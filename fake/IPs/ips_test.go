package IPs

import (
	"fmt"
	"testing"
)



func TestGetIps(t *testing.T){
	resp := GetIps()
	fmt.Println(resp[5])
}
