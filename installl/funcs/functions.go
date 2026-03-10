package funcs

import (
	"bytes"
	"fmt"
	"os"
	"os/exec"
	"strings"
)

//Verifica si un archivo existe o no
func VerifyFile(filePath string)(string, bool){
	_, err := os.Stat(filePath)

	if(err != nil){
		return "", false
	}
	return filePath, true

}



//hace string.split
func SplitString(info string)[]string{
	er := strings.ReplaceAll(info, "\n", " ")
	return strings.Split(er, " ")
	
}

//elimina el ultimo elemento
func DeleteLastElement(list []string)[]string{
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




func WriteLog(content string)bool{
	filePath := "./log/watchdog.log"


	file, err := os.OpenFile(filePath, os.O_RDWR | os.O_CREATE | os.O_APPEND, 0644)
	
	if(err != nil){
		fmt.Println(err.Error())
		return false
	}
	defer file.Close()
	file.Write([]byte("\n"+content))
	
	return true

}




func Cmd(command string){
	var outp bytes.Buffer

	cmd := exec.Command(command)
	cmd.Stdout = &outp

	cmd.Run()
	fmt.Println(outp.String())
}

