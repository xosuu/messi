package cert

import (
	"encoding/json"
	"fmt"
	"io"

	//"net"
	"net/http"
	"os"
	"strings"
	//"time"
)




// func CheckSubdomain(url string)Domain{
// 	time.Sleep(200 * time.Millisecond)
// 	domain := Domain{}
// 	resp, err := net.LookupIP(url)
// 	if(err != nil){
// 		fmt.Println(err.Error())
// 		return domain
// 	}
// 	domain.Url = url
// 	domain.Ip = resp
// 	return domain

// }



func ReadFile(path string)[]string{

	file, err := os.ReadFile(path)
	if(err != nil){
		fmt.Println(err.Error())
		return []string{}
	}

	resp := strings.Fields(string(file))

	return resp


}

func Get(url string){


	resp, err := http.Get(url)
	if(err != nil){
		fmt.Println(err)
		
	}
	
	body, err := io.ReadAll(resp.Body)
	if(err != nil){
		fmt.Println(err)
	}

	
	subdomains := []SubDomain{}

	jio := strings.Split(string(body), ",")
	fmt.Println(jio)
	for i:=0; i<len(jio); i++{
		//fmt.Println(string(jio[i]))
		subdomains = append(subdomains, ParseData(string(jio[i])))
	}

	fmt.Println(jio)
}


func ParseData(content string)SubDomain{
	var subdomain SubDomain
	resp := json.Unmarshal([]byte(content), &subdomain)
	if(resp != nil){
		fmt.Println(resp.Error())
	}
	return subdomain

}


func readJson(){
	file, err := os.ReadFile("testSub")
}