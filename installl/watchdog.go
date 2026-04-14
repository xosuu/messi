package main

import (
	"dog/dog"
	"dog/funcs"
	"dog/telegram"
	"fmt"
	"os"
	"os/signal"
	"syscall"
	"time"
	//"time"
)




func main(){
	
	funcs.Cmd("clear")

	telegram.VerifyUserStatus()
	var filesToAnalize []string
	ch := make(chan os.Signal, 1) //channel
	msg := make(chan string, 10)





	files, errFile := dog.GetFiles(dog.ReadDocs().File.Paths)
	InfoDirFiles, errDir := dog.GetFilesFromDir(dog.ReadDocs().Dir.Paths)
	
	if(errFile != nil){
		fmt.Println(errFile.Error())
		
	}
	if(errDir != nil){
		fmt.Println(errDir.Error())
	}
	// fmt.Println(len(files))
	// fmt.Println(len(dirsFiles))

	//fmt.Println(InfoFiles.Files)
	
	
	
	filesToAnalize = funcs.ListCleaner(append(InfoDirFiles.Files, files...))


	
	fmt.Print("\n\n\033[1;33m		MONITOREANDO \033[0m")


	banner := fmt.Sprintf(`
		Carpetas: %d
		Archivos: %d

		Total Archivos: %d
	
	`, InfoDirFiles.TotalDirs, len(files), len(filesToAnalize))

	
	fmt.Println(banner)
	//Aca esperamsos el ctrl+c
	signal.Notify(ch, syscall.SIGINT, syscall.SIGTERM)


	for i:=0 ; i<len(filesToAnalize);i++{
		
		go dog.Analize(filesToAnalize[i], msg)

	}
	
	for carpeta:=0 ; carpeta <len(InfoDirFiles.Dirs); carpeta ++{
		go dog.Analize(InfoDirFiles.Dirs[carpeta], msg)
	}
	
	go func(){
		
		ticker := time.NewTicker(600 * time.Millisecond)
		defer ticker.Stop()
		for{
			mssg := <- msg 
			go WriteLog(mssg)
			
			go SendAlertTelegram(mssg, *ticker)
			
			
		}
	}()
	
	//go SendAlertTelegram(msg)

	si := <- ch 
	
	fmt.Println("Programa cerrado", si)
	//select{}
	
}




func WriteLog(c string){
	fmt.Println(c)
	funcs.WriteLog(c)
	
}

func SendAlertTelegram(c string, t time.Ticker){
	<- t.C
	telegram.Send(c)
	
}


