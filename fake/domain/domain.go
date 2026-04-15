package domain

import (
	//"fake/funcs"
	"fake/funcs"
	"net"
	"time"
)



type Domain struct{
	Name string
	Ip  []net.IP
	Subdomains []string 
	Dns string

}

func (d *Domain) CheckNs(){
	if (string(d.Ip[0]) == "0.0.0.0"){
		d.Dns = "No cloudflare"
		return
	}
	for _, v := range(d.Ip){
		time.Sleep(50 * time.Millisecond)
		resp := funcs.IsCloudflare(string(v))
		if(resp){
			d.Dns = "Cloudflare"
		}else{
			d.Dns = "No cloudflare"
		}
	}
}


// func (c *Domain) GetIp() []net.IP{
// 	ip := funcs.CheckIp(c.Name)
// 	return ip
// }

// func (d *Domain) CheckSubdomains(){
// 	d.subdomains = append(d.subdomains, )
// }