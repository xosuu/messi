package security

import (
	
	"net"
	"os"
	"strconv"
)


func IdSec(){

	inf, err := net.Interfaces()
	if(err != nil){
		print(err)

	}

	info := os.Args[1]
	print(info)
	print(inf[2].HardwareAddr)
	for x, v := range inf{
		print(x)
		print(v.Name)
	}
	e := os.Getuid()

	print("eeee> "+ strconv.Itoa(e))
}




