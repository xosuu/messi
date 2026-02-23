package main

import (
	"fmt"
	"os"
	"strings"

	//"net/http"
	"time"
	"windows/sendTools"
	"windows/tunnel"
)


func main(){
	fmt.Println("ASJDLAJSLDJALKSDJLAKJSDLKASJDLKJALSDAKDLA")

	
	//re := tunnel.InitTunne()
	tunnel.InitTunne()
	go tunnel.ServerTunn()


	fmt.Println("Espera..")

	sendTools.Send("Enviando datos....")
	time.Sleep(10*time.Second)
	datos, err := os.ReadFile("info.txt")
	if(err != nil){
		fmt.Println(err)
	}
	rep := string(strings.ReplaceAll(string(datos), " ", ""))
	fmt.Println(rep)
	re := sendTools.Send("INfooooo: "+rep)
	fmt.Println(re)
		
	
	select{}

}

