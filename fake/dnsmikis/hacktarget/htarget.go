package hacktarget

import (
	"errors"
	"fake/dnsmikis/requests"
	"fmt"
	"io"
	"strings"
)




func CheckSubdomain(url string)([]string, error){

	resp, err := requests.Get(url)
	if(err != nil){
		fmt.Println("Error: ", err.Error())
		return []string{}, errors.New(err.Error())
	}

	body, _ := io.ReadAll(resp.Body)

	return strings.Split(string(body), "\n"), nil
}





