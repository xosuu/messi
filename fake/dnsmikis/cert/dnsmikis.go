package cert

import (
	"encoding/json"
	"fmt"
	"io"
	"net/http"

	// "io"
	// "net/http"
	"os"
	"strings"
)

func CheckSubdomain(url string)[]SubDomain{
	resp:=Get(url)
	body, err:= io.ReadAll(resp.Body)
	if(err != nil){
		fmt.Println(err)
	}
	subdomains := ParseData(string(body))

	return subdomains


}



func ReadFile(path string)[]string{

	file, err := os.ReadFile(path)
	if(err != nil){
		fmt.Println(err.Error())
		return []string{}
	}

	resp := strings.Fields(string(file))

	return resp


}

func Get(url string)*http.Response{


	resp, err := http.Get(url)
	if(err != nil){
		fmt.Println(err)
		
	}
	
	return resp


}


func ParseData(content string)[]SubDomain{
	var subdomain []SubDomain
	resp := json.Unmarshal([]byte(content), &subdomain)
	if(resp != nil){
		fmt.Println(resp.Error())
	}
	return subdomain

}


// func readJson(){
// 	file, err := os.ReadFile("testSub")
// }









