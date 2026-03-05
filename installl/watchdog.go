package main

import (
	"dog/dog"
	"fmt"
	"os"
	
	"os/signal"
	
	"syscall"
)


func main(){
	
	var filesToAnalize []string
	ch := make(chan os.Signal, 1) //channel



	filess, errFile := dog.GetFiles(dog.ReadDocs().File.Paths)
	dirss, errDir := dog.GetFilesFromDir(dog.ReadDocs().Dir.Paths)
	
	if(errFile != nil){
		fmt.Println(errFile.Error())
		
	}
	if(errDir != nil){
		fmt.Println(errDir.Error())
	}
	// fmt.Println(filess)
	// fmt.Println(dirss)


	
	
	
	filesToAnalize = dog.ListCleaner(append(dirss, filess...))


	fmt.Println("JIJOOOOOO: ",filesToAnalize)
	fmt.Print("\n\n\033[1;33m		MONITOREANDO \033[0m")


	banner := fmt.Sprintf(`
		Carpetas: %d
		Archivos: %d

		Total Archivos: %d
	
	`, len(filess), len(dirss), len(filesToAnalize))


	fmt.Println(banner)
	//Aca esperamsos el ctrl+c
	signal.Notify(ch, syscall.SIGINT, syscall.SIGTERM)


	for i:=0 ; i<len(filesToAnalize);i++{
		go dog.Analize(filesToAnalize[i])

	}
	

	si := <- ch 
	
	fmt.Println("Programa cerrado", si)
	//select{}
	
}







