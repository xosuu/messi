package funcs

import (

	"fmt"
	"net"
	//"time"
)

//---------------
func DeleteRepeat(list []string)[]string{

	// fmt.Println("Limpiando lista?---")
	// fmt.Println(list)
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
		return []net.IP{net.IPv4(0, 0, 0, 0)}
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



func CheckCdn(ip string, rangeIps[]string)bool{

	for _, v := range(rangeIps){

		//time.Sleep(50 * time.Millisecond)
		_, ipnet, err := net.ParseCIDR(v)
		if(err != nil){

			fmt.Println("Error checkcnd: "+ v + err.Error())
			return false
		}
		ip := net.ParseIP(ip)
		if(ipnet.Contains(ip)){
			//fmt.Println(ip, true, v)
			//fmt.Println("cloudflare")
			return true
		// }else{
		// 	fmt.Println(ip, false, v)
		// 
		}


	}
	//fmt.Println("No cloudflare")
	return false
	
}