package funcs

import (
	"fmt"
	"testing"
)




func TestCheckIp(t *testing.T){
	url := "console.nube.entel.bo"
	r := CheckIp(url)
	fmt.Println("IP: ",r)
	fmt.Println("NS: ",CheckNs(url))

}


// func TestCheckCdn(t *testing.T){
// 	CheckCdn("190.129.60.137", )

// }