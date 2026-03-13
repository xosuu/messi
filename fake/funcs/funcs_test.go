package funcs

import (
	"fmt"
	"testing"
)




func TestCheckIp(t *testing.T){
	url := "cv.oruro.gob.bo"
	r := CheckIp(url)
	fmt.Println("IP: ",r)
	fmt.Println("NS: ",CheckNs(url))

}


