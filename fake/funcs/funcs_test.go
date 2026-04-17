package funcs

import (
	"fake/IPs"
	"fmt"
	"net"
	"testing"
)




func TestCheckIp(t *testing.T){
	url := "money.tigo.com.bo"
	r := CheckIp(url, true)
	fmt.Println("IP: ",r)
	fmt.Println("NS: ",CheckNs(url))

}


func TestCheckCdn(t *testing.T){
	ji := CheckCdn(net.IPv4(162,159,138,52), IPs.CLOUDFLARE)
	fmt.Println("Is cloudflare")
	fmt.Println(ji)

}