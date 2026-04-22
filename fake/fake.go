package main

import (
	//"encoding/json"
	"fake/dnsmikis/cert"
	"fake/domain"
	"fake/funcs"
	"fake/style"
	"os"
	"strings"
	"time"

	//"fake/funcs"
	"fmt"
)


var Nombre string





func main(){

	
	files := cert.ReadFile("mikis.txt")
	//dominio := "zetita.online"
	dominio := os.Args[1]
	url := fmt.Sprintf("https://crt.sh/?q=%s&output=json", dominio)
	fmt.Println(files[1:30])


	subdomainCrt, err := cert.CheckSubdomain(url)
	if(err != nil){
		fmt.Println(err)
		return
	}
	
	var subdomains []domain.Domain
	var listDomains []string


	start := time.Now()
	fmt.Println(style.Banner)
	fmt.Println("Iniciando")
	for _,v := range subdomainCrt{
		
		listDomains = append(listDomains, strings.ReplaceAll(v.CommonName, "*.", ""))
	}


	listClean := funcs.DeleteRepeat(listDomains)
	

	
	//Dominio padre
	dominioPadre := domain.Domain{Name: dominio, Ip: funcs.CheckIp(dominio, true)}
	dominioPadre.CheckNs()
	subdomains = append(subdomains, dominioPadre)
	//Subdominios


	
	subdomains = Init(listClean)

	// for _, x := range listClean{
	// 	//fmt.Print(x)
	// 	time.Sleep(50 * time.Millisecond)

	// 	domaiin := domain.Domain{Name: x, Ip: funcs.CheckIp(x, true) }
	// 	domaiin.CheckNs()
	// 	subdomains = append(subdomains, domaiin)

	// }

	fmt.Println("\nMostrando resultados ")
	for _, v := range subdomains{
		time.Sleep(100 * time.Millisecond)
		//fmt.Println("-------------------------------------------------------------------------------------------")
		fmt.Println(style.YELLOW, v.Name, style.END ,style.GREEN, v.Ip, style.END ,"\n", v.Cdn)
		fmt.Println("--------------------------------------------------------------------------------------------------")
	}


	end := time.Since(start)
	fmt.Println("Terminado en :", end)
	//fmt.Println(funcs.CheckIp(dominio, false))

	
}




func Init(lista []string)[]domain.Domain{
	subdomains := []domain.Domain{}

	dmain := make(chan domain.Domain, 10)
	limitElements := 30
	numThreads := 5



	if(len(lista) > limitElements){
		fmt.Print("Acelerando....")
		time.Sleep(1 * time.Second)
		chunksSubdomains := funcs.SplitArray(lista, numThreads)

		for _,list := range chunksSubdomains{
			go func(){
				
				for _, x := range list{
					//fmt.Print(x)
				
					time.Sleep(50 * time.Millisecond)	
					domaiin := domain.Domain{Name: x, Ip: funcs.CheckIp(x, true) }
					domaiin.CheckNs()
					//subdomains = append(subdomains, domaiin)
					dmain <- domaiin
					}
				//fmt.Printf(".")
			}()

		}

		for range(len(lista)){
			info := <- dmain
			subdomains = append(subdomains, info)
		}
			
		return subdomains


	}

	for _, x := range lista{
		//fmt.Print(x)
		time.Sleep(50 * time.Millisecond)
		
		domaiin := domain.Domain{Name: x, Ip: funcs.CheckIp(x, true) }
		domaiin.CheckNs()
		subdomains = append(subdomains, domaiin)

	}
	return subdomains

}