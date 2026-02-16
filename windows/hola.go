package main

import (
	"fmt"
	"os"
	//"net/http"
	"windows/sendTools"
	"windows/tunnel"
	"time"
)


func main(){
	fmt.Println("ASJDLAJSLDJALKSDJLAKJSDLKASJDLKJALSDAKDLA")

	
	//re := tunnel.InitTunne()
	go tunnel.InitTunne()
	go tunnel.ServerTunn()


	fmt.Println("Espera..")

	sendTools.Send("Enviando datos....")
	time.Sleep(10*time.Second)
	dat, err := os.ReadFile("info.txt")
	if(err != nil){
		fmt.Println(err)
	}
	re := sendTools.Send(string(dat))
	fmt.Println(re)
		
	
	select{}

}

