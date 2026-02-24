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
	if(msg.Status == false){
		fmt.Println("Error de pinggy")
		fmt.Println(msg.Info)
		return 
	}
	fmt.Println("Pinggy iniciado..")

	go tunnel.ServerTunn()
	


	fmt.Println("Espera..")

	sendTools.Send("Enviando datos....")
	time.Sleep(10*time.Second)
	
	fmt.Println(msg)
	re := sendTools.Send("INfooooo: "+msg.Info)
	fmt.Println(re)
		
	fmt.Println("running.....")
	select{}

}

