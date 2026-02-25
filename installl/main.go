package main

import (
	"dog/dog"
	"fmt"

	
)


func main(){
	

	archivos := [5]string{"holis.txt", "uno.txt", "dos.txt", "tres.txt", "cuatro.txt"}
	fmt.Println("analizando 5 archivos")

	for i:=0 ; i<len(archivos);i++{
		go dog.Analize(archivos[i])

	}
	select{}
}






