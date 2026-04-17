package domain

import (
	//"fake/funcs"
	"fake/IPs"
	"fake/funcs"
	"fake/style"
	"fmt"
	"net"
	"time"
)



type Domain struct{
	Name string
	Ip  []net.IP
	Subdomains []string 
	Cdn []string

}

func (d *Domain) CheckNs(){
	if (string(d.Ip[0]) == "0.0.0.0"){
		d.Cdn = append(d.Cdn, "No host")
		return
	}else{
		fmt.Println("Check cloudflare")
		for _, v := range(d.Ip){
			time.Sleep(50 * time.Millisecond)
			isCloudflare := funcs.CheckCdn(string(v), IPs.CLOUDFLARE )
			if(isCloudflare){
				d.Cdn = append(d.Cdn, style.GREEN+"Cloudflare"+style.END)  
			}else{
				d.Cdn = append(d.Cdn, style.RED + "Cloudflare" + style.END) 
			}

		}
		fmt.Println("Check cloudfront")
		for _, x := range(d.Ip){
			ips:=IPs.CLOUDFRONT
			isCloudFront := funcs.CheckCdn(string(x), ips)
			if(isCloudFront){
				d.Cdn = append(d.Cdn, style.GREEN + "Cloudfront" + style.END)
			}else{
				d.Cdn = append(d.Cdn, style.RED + "Cloudfront" + style.END)
			}

		}


		fmt.Println("Check akamai")
		for _, z := range(d.Ip){
			
			isCloudFront := funcs.CheckCdn(string(z), IPs.AKAMAI)
			if(isCloudFront){
				d.Cdn = append(d.Cdn, style.GREEN + "Akamai" + style.END)
			}else{
				d.Cdn = append(d.Cdn, style.RED + "Akamai" + style.END)
			}

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