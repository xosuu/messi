package funcs

import (
	"bytes"
	"fmt"
	"log"
	"os/exec"
)



func Saludo(nombre string){

	log.Println("Hola", nombre)
}


func Command(comando string){
	var out bytes.Buffer
	cmd := exec.Command(comando)
	cmd.Stdout = &out
	cmd.Run()

	fmt.Println(out.String())
}


const BANNER string = `

▒█░░▒█ ▒█▀▀█ 　 ▒█▀▀▀█ ▒█▄░▒█ ▀█▀ ▒█▀▀▀ ▒█▀▀▀ 
▒█▒█▒█ ▒█▄▄█ 　 ░▀▀▀▄▄ ▒█▒█▒█ ▒█░ ▒█▀▀▀ ▒█▀▀▀ 
▒█▄▀▄█ ▒█░░░ 　 ▒█▄▄▄█ ▒█░░▀█ ▄█▄ ▒█░░░ ▒█░░░
`