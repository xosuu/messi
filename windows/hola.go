package main

import (
	"fmt"
	"time"
	"windows/sendTools"
	"windows/tunnel"

)


func main(){
	fmt.Println("Iniciando ")
	
	info := make(chan tunnel.InfoTunnel)
	
	
	go func (){

		inf := tunnel.InitTunne()
		info <- inf		
	}()
	msg := <- info
	fmt.Println("Pinggy iniciado..")


	go tunnel.ServerTunn()
	


	fmt.Println("Espera..")
	sendTools.Send("Enviando datos....")
	time.Sleep(10*time.Second)
	
	
	re := sendTools.Send("INfooooo: "+msg.Info)
	fmt.Println(re)
		
	fmt.Println("running.....")
	select{}

}

