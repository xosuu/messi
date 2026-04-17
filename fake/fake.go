package main

import (
	//"encoding/json"
	"fake/dnsmikis/cert"
	"fake/domain"
	"fake/funcs"
	"fake/style"
	"strings"
	"time"

	//"fake/funcs"
	"fmt"
)


var Nombre string





func main(){

	files := cert.ReadFile("mikis.txt")
	dominio := "tigo.com.bo"
	url := fmt.Sprintf("https://crt.sh/?q=%s&output=json", dominio)
	fmt.Println(files[1:30])


	subdomain := cert.CheckSubdomain(url)

	
	var subdomains []domain.Domain
	var listDomains []string

	fmt.Println("Iniciando")
	for _,v := range subdomain{
		
		listDomains = append(listDomains, strings.ReplaceAll(v.CommonName, "*.", ""))
	}


	listClean := funcs.DeleteRepeat(listDomains)
	

	if(len(listClean) > 50){

	}
	//Dominio padre
	dominioPadre := domain.Domain{Name: dominio, Ip: funcs.CheckIp(dominio)}
	dominioPadre.CheckNs()
	subdomains = append(subdomains, dominioPadre)
	//Subdominios
	for _, x := range listClean{
		//fmt.Print(x)
		time.Sleep(50 * time.Millisecond)

		domaiin := domain.Domain{Name: x, Ip: funcs.CheckIp(x) }
		domaiin.CheckNs()
		subdomains = append(subdomains, domaiin)

		// ip := funcs.CheckIp(x)
		// ipp := ip[0]
		// fmt.Println(x, ip, funcs.IsCloudflare(string(ipp)))
	}

	fmt.Println("Mostrando resultados jijoo")
	for _, v := range subdomains{
		time.Sleep(100 * time.Millisecond)
		fmt.Println(style.YELLOW, v.Name, style.END ,style.GREEN, v.Ip, style.END , v.Cdn)
	}


	fmt.Println(funcs.CheckIp(dominio))

	
}