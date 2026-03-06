package main

import (
	
	"dog/telegram"
	"fmt"
	"os"
	"os/signal"
	"syscall"
	"dog/dog"
)




func main(){
	
	telegram.VerifyUserStatus()
	var filesToAnalize []string
	ch := make(chan os.Signal, 1) //channel



	files, errFile := dog.GetFiles(dog.ReadDocs().File.Paths)
	amountDirs, dirsFiles, errDir := dog.GetFilesFromDir(dog.ReadDocs().Dir.Paths)
	
	if(errFile != nil){
		fmt.Println(errFile.Error())
		
	}
	if(errDir != nil){
		fmt.Println(errDir.Error())
	}
	fmt.Println(len(files))
	fmt.Println(len(dirsFiles))


	
	
	
	filesToAnalize = dog.ListCleaner(append(dirsFiles, files...))


	
	fmt.Print("\n\n\033[1;33m		MONITOREANDO \033[0m")


	banner := fmt.Sprintf(`
		Carpetas: %d
		Archivos: %d

		Total Archivos: %d
	
	`, amountDirs, len(files), len(filesToAnalize))

	
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







