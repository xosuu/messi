package main

import (
	//"encoding/json"
	"fake/dnsmikis/cert"
	"fmt"
)


var Nombre string





func main(){

	files := cert.ReadFile("mikis.txt")
	domain := "https://crt.sh/?q=entel.bo&output=json"
	fmt.Println(files[1:30])

	
	cert.Get(domain)
	// for _,v := range files[30:40]{
	// 	res := dnsmikis.CheckSubdomain(v+"."+domain)
	// 	fmt.Println(res)
	// }
	
	
}