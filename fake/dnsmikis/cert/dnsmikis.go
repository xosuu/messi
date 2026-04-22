package cert

import (
	"encoding/json"
	"fake/dnsmikis/requests"
	"fmt"
	"io"
	"os"
	"strings"
)






func CheckSubdomain(url string) ([]SubDomain, error){
	fmt.Println("Check subdomain of ")
	resp, err := requests.Get(url)
	if(err != nil){
		return []SubDomain{}, err
	}

	body, err:= io.ReadAll(resp.Body)
	if(err != nil){
		// fmt.Println("Error: ")
		// fmt.Println(err.Error())
		return []SubDomain{}, err
		
	}
	//fmt.Println(string(body))
	subdomains := ParseData(string(body))
	
	return subdomains, nil


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



func ParseData(content string)[]SubDomain{
	var subdomain []SubDomain
	resp := json.Unmarshal([]byte(content), &subdomain)
	if(resp != nil){
		fmt.Println("Error ParserData")
		fmt.Println(resp.Error())
		
	}
	return subdomain

}


// func readJson(){
// 	file, err := os.ReadFile("testSub")
// }









