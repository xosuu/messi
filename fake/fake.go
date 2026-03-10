package main

import (
	//"encoding/json"
	"fake/dnsmikis"
	
)


var Nombre string



type User  struct{
	Nombre int `json:"pepe"`
}

func main(){

	we := dnsmikis.Dns{Url: "ioio"}

	we.Saludo()

	dnsmikis.ReadFile("mikis.txt")
	
	
}