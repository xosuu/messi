package cert

import (
	"encoding/json"
	"fake/dnsmikis/agents"
	"fmt"
	"io"
	"net/http"
	"time"
	// "io"
	// "net/http"
	"os"
	"strings"
)






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
	UserAgent := agents.GetRandomUa()
	cli := &http.Client{
		Timeout: 15 * time.Second,
	}


	req, err := http.NewRequest("GET", url, nil)
	if(err != nil){
		fmt.Println("error Get:", err.Error())
	}
	
	req.Header.Set("User-Agent", UserAgent)

	

	resp, err := cli.Do(req)
	if(err != nil){
		fmt.Println("Error get ", err.Error())
	}
	if(resp.StatusCode != 200){
		fmt.Println(resp.StatusCode)
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
		fmt.Println("Error ParserData")
		fmt.Println(resp.Error())
		
	}
	return subdomain

}


// func readJson(){
// 	file, err := os.ReadFile("testSub")
// }









