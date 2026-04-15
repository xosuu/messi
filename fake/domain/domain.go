package domain

import (
	"fake/funcs"
	"net"
)



type Domain struct{
	Name string
	ip  []string
	subdomains []string 

}



func (c *Domain) GetIp() []net.IP{
	ip := funcs.CheckIp(c.Name)
	return ip
}

func (d *Domain) CheckSubdomains(){
	d.subdomains = append(d.subdomains, )
}