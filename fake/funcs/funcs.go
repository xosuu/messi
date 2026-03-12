package funcs

import (
	"fmt"
	"net"
)

//---------------
func DeleteRepeat(list []string)[]string{


	var newList []string

	for i:=0; i<len(list); i++{
		num := list[i]
		for x:=0; x<len(list); x++{
			if num != list[x] && elementInList(newList, num) == false{
				newList = append(newList, num)
			}
		}
	}

	return  newList

}


func elementInList(list []string, element string)bool{

	for i:=0; i<len(list); i++{
		if(element == list[i]){
			return true
		}
	}
	return false

}

//------------------


func CheckIp(url string)[]net.IP{
	resp, err := net.LookupIP(url)
	if(err != nil){
		fmt.Println(err)
	}

	return resp
}




func CheckNs(url string)[]string{
	resp, err := net.LookupNS(url)
	if(err != nil){
		fmt.Println(err.Error())
	}
	list := []string{}
	for _, v := range resp{
		list = append(list, v.Host)
	}
	return list
}

