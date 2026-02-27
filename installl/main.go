package main

import (
	"dog/dog"
	"fmt"
	"os"
	"os/signal"
	"syscall"
)


func main(){
	
	ch := make(chan os.Signal, 1)
	archivos := [5]string{"holis.txt", "uno.txt", "dos.txt", "tres.txt", "cuatro.txt"}
	fmt.Println("analizando 5 archivos")



	//Aca esperamsos el ctrl+c
	signal.Notify(ch, syscall.SIGINT, syscall.SIGTERM)


	for i:=0 ; i<len(archivos);i++{
		go dog.Analize(archivos[i])

	}
	

	si := <- ch 
	
	fmt.Println("Programa cerrado", si)
	//select{}
	
}






