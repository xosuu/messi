package websocket

import (
	"fmt"
	"net"
	"net/http"

	"github.com/gorilla/websocket"
)



var(
	Upgrades websocket.Upgrader = websocket.Upgrader{
		CheckOrigin: func(r *http.Request) bool {return true},
	}
)

func HandleS(w http.ResponseWriter, r *http.Request){
	fmt.Println("eoooo")
	ws, er := Upgrades.Upgrade(w, r, nil)
	if(er != nil){
		fmt.Println(er)
		
	}
	fmt.Println("Conectado ciuu", r.RemoteAddr)
	defer ws.Close()
	
	di, err := net.Dial("tcp", "198.98.61.214:444")
	if(err != nil){
		fmt.Println(err)
	}
	defer di.Close()


	go func(){
		buff := make([]byte, 8192)
		for{
			n, e:= di.Read(buff)
			if(e != nil){
				fmt.Println(e)
				return 
			}

			errr := ws.WriteMessage(websocket.BinaryMessage, buff[:n])
			if(errr != nil){
				fmt.Println(errr)
				return
			}
		}

	}()



	for{
		_, dat, err := ws.ReadMessage()
		if(err != nil){
			fmt.Println(err)
			return
		}

		_, err = di.Write(dat)
		if(err != nil){
			fmt.Println(err)
			break
		}
	}


}


func PruebaWebsocket(){

	fmt.Println("Iniciando wssss")
	http.HandleFunc("/", HandleS)
	err := http.ListenAndServe(":4008", nil)
	if(err != nil){
		fmt.Println(err)
	}
}