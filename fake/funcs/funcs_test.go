package funcs

import (
	"fmt"
	"testing"
)




func TestCheckIp(t *testing.T){
	url := "tigo.com"
	r := CheckIp(url)
	fmt.Println("IP: ",r)
	fmt.Println("NS: ",CheckNs(url))

}


func TestIsCloudflare(t *testing.T){
	IsCloudflare("190.129.60.137")

}