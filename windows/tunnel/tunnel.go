package tunnel

import (
	"bytes"
	//"container/list"
	"fmt"
	//"io"
	
	"os/exec"
	"os"
)


var system string = "windows"

func InitTunne()bool{
	
	var out bytes.Buffer
	var port string = "3333"
	var command string = fmt.Sprintf(`ssh -i .\key -T -p 443 -R0:127.0.0.1:%s free.pinggy.io > da.log`, port)
	runTunnel  := commandToRun(system, command)	

	// var cpKeys string = "iwr "
	// copyKeys := commandToRun(system, "")



	fmt.Println("Starting....")
	cmd := exec.Command(runTunnel[0], runTunnel[1], runTunnel[2])
	cmd.Stdout = &out
	//stout, err := cmd.StdoutPipe()
	//if(err != nil){fmt.Println(err)}

	er := cmd.Run()
	if(er != nil){
		return false
	}
	//fmt.Println(string(out.String()))
	
	return true}



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
