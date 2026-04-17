package IPs

import (
	"fmt"
	"testing"
)



func TestGetIps(t *testing.T){
	resp := getIps()
	fmt.Println(resp[5])
}
