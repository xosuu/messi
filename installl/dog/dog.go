package dog

import (
	"log"
	"os"
	"time"
	//"time"
)




func Analize(file string){
	//var cont int = 0
	last, _ := os.Stat(file)
	fileName := file
	er := last.ModTime()
	log.Print(fileName)
	for {
		time.Sleep(5 * time.Second)
		fil , err := os.Stat(file)
		if(err != nil){
			log.Println(err)
		}else{
			if (er != fil.ModTime()){
				log.Printf("Se modifico el archivo..%s", string(fileName))
				
				er = fil.ModTime()
			}
		}
	}
}



//func backup(data)