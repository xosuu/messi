package funcs

import (
	"fmt"
	"testing"
)




func TestCheckIp(t *testing.T){
	url := "lapatria.bo"
	r := CheckIp(url)
	fmt.Println(r)
	fmt.Println(CheckNs(url))

}
