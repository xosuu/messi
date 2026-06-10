package main

import (
	"bytes"
	"errors"
	"fmt"
	"os"
	"os/exec"
	"regexp"
	"strconv"
	"strings"

	"time"
)

var ruta string = "path"
var nombreServicio string = "server"
var port string = ":3009"

func main(){
	
	//change := make(chan string, 1)
	pid, err := GetPid(nombreServicio) 
	if( err != nil){
		fmt.Println(err)
	}
	
	er := KillProcess(pid)
	if (!er){
		fmt.Println("No se puedo elimiar proceso")
	}
	fmt.Println(er)


	

}

func GetPid(processName string)(int, error){
	var out bytes.Buffer
	cmd := exec.Command("ps", "aux")
	cmd.Stdout = &out
	cmd.Run()
	regex := fmt.Sprintf(`(?m)^.*%s.*$`, processName)
	re := regexp.MustCompile(regex)
	resp := re.FindString(out.String())
	
	list := strings.Fields(resp)
	if( len(list) == 0){
		errorMsg := fmt.Sprintf("Process %s not working", processName)
		return 0, errors.New(errorMsg)
	}
	pid, err := strconv.Atoi(list[1]) 
	if( err != nil){
		return 0, err
	}
	return pid, nil



}

func KillProcess(pid int)bool{
	var out bytes.Buffer

	// process, err := os.FindProcess(pid)
	// if(err != nil){
	// 	fmt.Println(err)
	// 	return false
	// }
	
	// erro := 
	// process.Signal(syscall.SIGTERM)
	// if( erro != nil){
	// 	fmt.Println(erro)
	// 	return false
	// }
	// cmd := exec.Command("lsof", "-i", port)
	// cmd.Run()
	// cmd.Stdout = &out 
	// p := strings.Fields(out.String())
	kill := exec.Command("kill", "-9", string(pid))
	kill.Run()
	kill.Stdout = &out
	return true
}

func StartProcess(commands []string){
	var out bytes.Buffer
	cmd := exec.Command(commands[0], commands[1:]...)
	cmd.Stdout = &out 
	cmd.Run()
	
	fmt.Println(out.String())
}

func DetectChange(path string, alert chan bool)bool{
	file, err := os.Stat(path)
	if(err != nil){
		fmt.Println(err)
		return false
	}
	ultimate := file.ModTime()
	for{
		time.Sleep(5 * time.Second)
		fi, _ := os.Stat(ruta)
		if(fi.ModTime() != ultimate){
			alert <- true
			ultimate = fi.ModTime()
		}
	}
	
}



