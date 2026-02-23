package main

import (
	"embed"
	"fmt"
	"hola/hola"

	// "bytes"
	// "log"
	// "os/exec"
	// "time"
	//"time"
	"os"
)

var content embed.FS
func main(){
	r, e := os.ReadFile("hola.txt")
	if(e != nil){
		fmt.Println("No existe archivo")
		return
	}

	er := hola.Saluda(string(r))

	fmt.Println(er)
	// var out bytes.Buffer
	
	// ch := make(chan int)

	// log.Println("Iniciando")
	// cmd := exec.Command("ssh" ,"-p","443","-R0:127.0.0.1:3012", "free.pinggy.io")
	// log.Println("Iniciando...")
	// cmd.Stdout = &out

	// log.Println("Iniciando.----")
	// go func(){

	// 	cmd.Run()
		
	// }()
	// log.Println("Iniciando----------")
	// time.Sleep(7 * time.Second)

	// log.Println(out.String())
	// select{}


}







