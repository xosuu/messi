package funcs

import (
	"fmt"
	"math/rand"
	"net"
	"time"
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


func CheckIp(url string, onlyIpv4 bool)[]net.IP{
	

	time.Sleep(time.Duration(rand.Intn(50)) * time.Millisecond)
	resp, err := net.LookupIP(url)
	if(err != nil){
		fmt.Println(err)
		return []net.IP{}
	}
	if(onlyIpv4){
		
		var ipv4s []net.IP 

		//fmt.Println(len(resp))
		for i:=0; i<len(resp);i++ {
			if(len(resp[i]) != net.IPv6len){
				ipv4s = append(ipv4s, resp[i])
			}
		}
		return ipv4s
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



func CheckCdn(ip net.IP, rangeIps[]string)bool{

	for _, v := range(rangeIps){

		//time.Sleep(50 * time.Millisecond)
		_, ipnet, err := net.ParseCIDR(v)
		if(err != nil){

			fmt.Println("Error checkcnd: "+ v + err.Error())
			return false
		}
		ipp := net.ParseIP(ip.String())
		//fmt.Println(ipnet.Contains(ipp))
		if(ipnet.Contains(ipp)){
			//fmt.Println(ip, true, v)
			//fmt.Println("cloudflare")
			return true
		// }else{
		// 	fmt.Println(ip, false, v)
		// 
		}


	}
	//fmt.Println(ip)
	return false
	
}