package dog

import (
	"bytes"
	"errors"
	"os/exec"
	"strings"
	"fmt"
	"log"
	"os"
	"time"


	//"time"
	"encoding/json"

	"dog/mystruct"
	"dog/telegram"
	
)




func Analize(file string){
	
	fil, _ := os.Stat(file)
	fileName := file
	last := fil.ModTime()
	

	for {
		time.Sleep(5 * time.Second)
		fil , err := os.Stat(fileName)
		if(err != nil){
			
			msg:= fmt.Sprintf("Archivo > %s eliminado o removido, %s", fileName, time.Now().Format("2006-01-02 15:04:05"))
			telegram.Send(msg)
			//log.Println("No pude encontrar el archivo", err)
			log.Println("Me mori chau")
			fmt.Println(msg)
			break
		}else{
			if (last != fil.ModTime()){
				//log.Printf("Se modifico el archivo..%s", string(fileName))
				msg := fmt.Sprintf("%s Se modifico >> %s", string(fil.ModTime().Format("2006-01-02 15:04:05")),string(fileName))
				fmt.Println(msg)
				telegram.Send(msg)
				last = fil.ModTime()
			}
		}
	}
}



//Leemos los archivos que estan dentro de directorios
func GetFilesFromDir(PathDir []string)(int, []string, error){
	data := PathDir
	
	var listFiles []string
	var out bytes.Buffer

	var finalList []string
	var totalDirs int
	


	if(len(data) == 0){
		return 0, []string{""}, errors.New("No hay directorios")
	}

	for i:=0; i<len(data); i++{
		time.Sleep(200 * time.Millisecond)
		info, er := os.Stat(data[i])
		fmt.Println("Carpetas encontradas: ", len(data))
		if(er != nil){
			continue
		}else if( info.IsDir()){ //verifica si es una carpeta real
			totalDirs += 1
			out.Reset() //limpiamos para que esta vuelta no se acumule
			fmt.Println("Verificando carpeta..", data[i])
			time.Sleep(2*time.Second)
			cmd := exec.Command("ls", data[i])
			cmd.Stdout = &out
			cmd.Run()
			//fmt.Println(out.String())


			//convertimos en lista y cada ruta la Anadimos a la lista principal
			list := splitString(out.String())
			list = deleteLastElement(list)
			//fmt.Println(len(list))
			for fi:=0; fi<len(list); fi++{
				//fmt.Println(list[fi])
				ruta := data[i] + list[fi] //ruta
				listFiles = append(listFiles, ruta)
			}
			

		}
		
	}


	//limpiar lista
	
	fmt.Println("limpiando lista")
	//fmt.Println(len(listFiles))
	//fmt.Println(listFiles)
	for i:=0; i<len(listFiles); i++{
		time.Sleep(100*time.Millisecond)
		resp, err := verifyFile(listFiles[i]) //verificamos los archivos 
		if(err == false){
			continue
		}
		finalList = append(finalList, resp) 
	}

	//devolvemos la cantidad de carpetas validas, lista de todos los archivos que habia en esa carpeta, nil
	return totalDirs, finalList, nil
	

}


//Leemos los archivos sueltos sin carpetas
func GetFiles(paths[]string)([]string, error){
	var files []string
	data := paths

	if(len(data) == 0){
		return []string{""}, errors.New("Archivos vacios o no validos: files{path:[]}")
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
		return []string{}, errors.New("Se encontraron archivos pero no son validos: files{path:['no existe']}") 
	}
	return files, nil
}



//Verifica si un archivo existe o no
func verifyFile(filePath string)(string, bool){
	_, err := os.Stat(filePath)

	if(err != nil){
		return "", false
	}
	return filePath, true

}










//Lee el info.json y lo parsea en el struct Docs para despuer ser procesado

func ReadDocs()mystruct.Docs{



	files, err := os.ReadFile("info.json")
	if(err != nil){
		panic("No existe el archivo info.json \n"+err.Error())
	}


	var inf mystruct.Docs
	er := json.Unmarshal([]byte(string(files)), &inf)
	
	if(er != nil){
		panic("Las rutas de los archivos deben estar en formato string \n"+er.Error())
		
	}

	return inf

}



//hace string.split
func splitString(info string)[]string{
	er := strings.ReplaceAll(info, "\n", " ")
	return strings.Split(er, " ")
	
}


//elimina el ultimo elemento
func deleteLastElement(list []string)[]string{
	return list[:len(list)-1]
}



//limpia espacios vacios etc de una lista 
func ListCleaner(list[]string)[]string{

	var newList []string

	for i:=0; i<len(list); i++{
		if(list[i] == ""){
			continue
		}else if(list[i]== " "){
			continue
		}else{
			newList = append(newList, list[i])
		}
	}

	return newList

}


