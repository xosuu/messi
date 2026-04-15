package main

import (
	//"encoding/json"
	"fake/dnsmikis/cert"
	"fake/funcs"
	"strings"
	"time"

	//"fake/funcs"
	"fmt"
)


var Nombre string





func main(){

	files := cert.ReadFile("mikis.txt")
	domain := "tigo.com.bo"
	url := fmt.Sprintf("https://crt.sh/?q=%s&output=json", domain)
	fmt.Println(files[1:30])


	subdomain := cert.CheckSubdomain(url)

	var subdomains  []string
	//var listClean []string


	for _,v := range subdomain{
		subdomains = append(subdomains, strings.ReplaceAll(v.CommonName, "*.", ""))
	}

	subs := funcs.DeleteRepeat(subdomains)
	for _, x := range subs{
		time.Sleep(100 * time.Millisecond)
		fmt.Println(x, funcs.CheckIp(x), funcs.IsCloudflare(x[ ]))
	}
	
	// list := []string{"pepe", "gato", "pepe", "perro", "perro"}

	// clear := funcs.DeleteRepeat(list)
	// fmt.Println(clear)

	fmt.Println(funcs.CheckIp("distribuidores.entel.bo"))

	
}