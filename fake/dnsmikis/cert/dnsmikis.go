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




var UserAgent string = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36"


func CheckSubdomain(url string)[]SubDomain{
	fmt.Println("Check subdomain of ")
	resp:=Get(url)
	body, err:= io.ReadAll(resp.Body)
	if(err != nil){
		fmt.Println("Error: ")
		fmt.Println(err.Error())
	}
	//fmt.Println(string(body))
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


	req, err := http.NewRequest("GET", url, nil)
	if(err != nil){
		fmt.Println("error", err.Error())
	}

	req.Header.Set("User-Agent", UserAgent)

	cli := &http.Client{}

	resp, err := cli.Do(req)
	if(err != nil){
		fmt.Println("Error get ", err.Error())
	}



	// resp, err := http.Get(url)
	// if(err != nil){
	// 	fmt.Println("Error get")
	// 	fmt.Println(err.Error())
		
	// }
	
	return resp


}


func ParseData(content string)[]SubDomain{
	var subdomain []SubDomain
	resp := json.Unmarshal([]byte(content), &subdomain)
	if(resp != nil){
		fmt.Println("Error Parser")
		fmt.Println(resp.Error())
		
	}
	return subdomain

}


// func readJson(){
// 	file, err := os.ReadFile("testSub")
// }









