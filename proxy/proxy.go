package main

import (
	
	"fmt"
	"io"
	"net"
)


func main(){

	fmt.Println("Iniciando servidor")

	
	serv, err := net.Listen("tcp", ":4008")
	
	if(err != nil){
		fmt.Println(err)
	}
	defer serv.Close()

	for{
		
		jijo, err := serv.Accept()
		fmt.Println("Conectado ", jijo.RemoteAddr())
		if(err != nil){
			
			fmt.Println(err)
			continue
		}
		
		go handl(jijo, "198.98.61.214:444")
	}
}



func handl(conn net.Conn, port string){

	defer conn.Close()


	buff := make([]byte, 1024)
	conn.Read(buff)

	respuesta := "HTTP/1.1 101 Switching Protocols\r\nUpgrade: websocket\r\nConnection: Upgrade\r\n\r\n"
	conn.Write([]byte(respuesta))


	siu, err := net.Dial("tcp", port) 
	if(err != nil){
		panic(err)

	}
	defer siu.Close()
	fmt.Println("Conectado")
	go func (){

		io.Copy(siu, conn)

	}()
	io.Copy(conn, siu)
	


}







