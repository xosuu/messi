package dnsmikis

import (
	"fmt"
	"os"
	"strings"
	"time"
)






type Dns struct{
	Url string 

}


func (c *Dns) Saludo() {
	fmt.Println("Hola "+c.Url)
}


func ReadFile(path string){

	resp, err := os.ReadFile(path)
	if(err != nil){
		fmt.Println(err.Error())
	}

	lista := strings.Fields(string(resp))
	cont :=0

	otra := lista[20:40]
	for x,v := range otra{
		time.Sleep(500*time.Millisecond)
		fmt.Println(x, v)
		cont ++
		if(cont == 11){break}
	}


	fmt.Println(lista[15:20])

}
























