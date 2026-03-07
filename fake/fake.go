package main

import (
	//"encoding/json"
	"fake/src"
	"fmt"
)


var Nombre string



type User  struct{
	Nombre int `json:"pepe"`
}

func main(){

	//var ji User 
	fmt.Println(Nombre)
	data := src.VerifyId("asd")
	fmt.Println(data)
	// resp := json.Unmarshal([]byte(data), &ji)

	
	// fmt.Println(ji.Nombre)
	// if(resp != nil){
	// 	fmt.Println(resp)
	// }
	// if(ji.Nombre == 0){
	// 	panic("NO TIENES pPERMISO")
	// }
	// fmt.Println("BIENVENIDOOOOOOOO")


	
	
}