package main

import (
	_ "embed"
	"fmt"
	"hola/hola"
	
	"runtime"
	"strings"
)

//go:embed hola.txt
var content string
func main(){
	// r, e := content.ReadFile("hola.txt")
	// if(e != nil){
	// 	fmt.Println("No existe archivo")
	// 	return
	// }
	r := content
	er := hola.Saluda(string(r))
	fmt.Println(runtime.GOOS)
	fmt.Println(er)


	//lista := [...]string{"AS","A","Asd","as","ASd","A"}

	nombre := "hola mi nombre es pepe"

	fmt.Println(strings.Split(nombre, " "))
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







