package main

import (
	"fmt"
	"os"
	
	"os/signal"
	"syscall"
	"time"
	"windows/sendTools"
	"windows/tunnel"
)


func main(){
	fmt.Println("Iniciando ")
	info := make(chan tunnel.InfoTunnel)
	
	exit := make(chan os.Signal, 1)


	
	
	go func (){
		inf := tunnel.InitTunne()

		info <- inf		
	}()
	data := <- info
	
	fmt.Println("Pinggy iniciado..")


	go tunnel.ServerTunn()
	


	fmt.Println("Espera..")
	sendTools.Send("Enviando datos....")
	time.Sleep(10*time.Second)
	
	
	re := sendTools.Send("INfooooo: "+data.Info)
	fmt.Println(re)
		
	fmt.Println("running.....")
	//select{}
	signal.Notify(exit, syscall.SIGINT, syscall.SIGTERM)
	ext := <-exit
	fmt.Println("terminado bye bye", ext)
	data.TunnelPinngyObj.Process.Kill()
	
	

}

