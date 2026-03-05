package dog

import (
	"bytes"
	"errors"
	"os/exec"
	"strings"

	"log"
	"os"
	"fmt"
	"time"
	//"time"
	"encoding/json"
)




func Analize(file string){
	//var cont int = 0
	last, _ := os.Stat(file)
	fileName := file
	er := last.ModTime()
	//log.Print(fileName)
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



func GetFilesFromDir(PathDir []string)([]string, error){
	data := PathDir
	
	var listFiles []string
	var out bytes.Buffer

	if(len(data) == 0){
		return []string{""}, errors.New("No hay directorios")
	}

	for i:=0; i<len(data); i++{
		time.Sleep(200 * time.Millisecond)
		info, er := os.Stat(data[i])
		if(er != nil){
			continue
		}else if( info.IsDir()){
			fmt.Println("Verificando carpeta..", data[i])
			time.Sleep(2*time.Second)
			cmd := exec.Command("ls", data[i])
			cmd.Stdout = &out
			cmd.Run()
			fmt.Println(out.String())
			list := splitString(out.String())
			
			for i:=0; i<len(list); i++{
				listFiles = append(listFiles, list[i])
			}
			

		}
		
	}

	return listFiles, nil
	// for i:=0; i<len(listFiles); i++{

	// }
	

}

func GetFiles(paths[]string)([]string, error){
	var files []string
	data := paths

	if(len(data) == 0){
		return []string{""}, errors.New("No hay archivos")
	}
	
	for i:=0; i<len(data); i++{
		time.Sleep(50 * time.Millisecond)
		f, err := verifyFile(data[i])

		if(err == false){
			continue
		}
		files = append(files, f)
		
	}
	if(len(files)==0){
		return []string{""}, errors.New("No hay archivos") 
	}
	return files, nil
}



func verifyFile(filePath string)(string, bool){
	_, err := os.Stat(filePath)

	if(err != nil){
		return "", false
	}
	return filePath, true

}














type Files struct{
	Paths []string `json:"paths"`
}
type Directory struct{
	Paths []string `json:"paths"`
}

type Docs struct{
	
	File Files `json:"file"`
	Dir  Directory `json:"dir"`


}
func ReadDocs()Docs{



	files, err := os.ReadFile("info.json")
	if(err != nil){
		panic("No existe el archivo info.json \n"+err.Error())
	}


	var inf Docs
	er := json.Unmarshal([]byte(string(files)), &inf)
	
	if(er != nil){
		panic("Las rutas de los archivos deben estar en formato string \n"+er.Error())
		
	}

	return inf

}




func splitString(info string)[]string{
	er := strings.ReplaceAll(info, "\n", " ")
	return strings.Split(er, " ")
	
}




