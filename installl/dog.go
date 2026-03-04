package main

import (
	"bytes"
	"dog/dog"
	"fmt"
	"os"
	"os/exec"
	"os/signal"
	"strings"
	"syscall"
)


func main(){
	

	
	ch := make(chan os.Signal, 1)
	// archivos := [5]string{"holis.txt", "uno.txt", "dos.txt", "tres.txt", "cuatro.txt"}
	// fmt.Println("analizando 5 archivos")

	var out bytes.Buffer
	cmd := exec.Command("ls", "./files/")
	cmd.Stdout = &out 
	cmd.Run()


	files := strings.ReplaceAll(out.String(), "\n", " ")

	list := strings.Split(files, " ")
	




	banner := fmt.Sprintf(`
	
	
		Monitoreando %d archivos

	
	`, len(list))


	fmt.Println(banner)
	//Aca esperamsos el ctrl+c
	signal.Notify(ch, syscall.SIGINT, syscall.SIGTERM)


	for i:=0 ; i<len(list);i++{
		go dog.Analize("./files/"+list[i])

	}
	

	si := <- ch 
	
	fmt.Println("Programa cerrado", si)
	//select{}
	
}







