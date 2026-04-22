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






func CheckSubdomain(url string) ([]SubDomain, error){
	fmt.Println("Check subdomain of ")
	resp, err := Get(url)
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

func Get(url string)(*http.Response, error){
	UserAgent := agents.GetRandomUa()
	cli := &http.Client{
		Timeout: 40 * time.Second,
	}


	req, err := http.NewRequest("GET", url, nil)
	if(err != nil){
		//fmt.Println("error Get:", err.Error())
		return nil, fmt.Errorf("Error http NewRquests: %s", err.Error())
	}
	
	req.Header.Set("User-Agent", UserAgent)
	req.Header.Set("Accept", "applicattion/json")
	

	resp, err := cli.Do(req)
	if(err != nil){

		return nil, fmt.Errorf("Error get: %s", err.Error())
		
	}
	if(resp.StatusCode != 200){
		return nil , fmt.Errorf("Error status code: %d", resp.StatusCode)
	}



	// resp, err := http.Get(url)
	// if(err != nil){
	// 	fmt.Println("Error get")
	// 	fmt.Println(err.Error())
		
	// }
	
	return resp, nil


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









