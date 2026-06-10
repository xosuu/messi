package main

import (
	"context"
	"fmt"
	"net/http"
	"os"
	"os/signal"
	"syscall"
)

type Html struct{


}

func (h *Html) ServeHTTP(w http.ResponseWriter, r *http.Request){
	fmt.Println("Html init")
}


func main(){
	c := make(chan os.Signal, 1)

	mux := http.NewServeMux()

	mux.Handle("/", http.FileServer(http.Dir("./temp")))
	
	server := &http.Server{
		Addr : ":3009",
		Handler : mux,
	}


	fmt.Println("Server iniciado")
	go func ()  {
		err := server.ListenAndServe()
		if( err != nil){
				fmt.Println(err)
		}
		
	}()
	fmt.Println("Esperando jijojoj")
	signal.Notify(c, syscall.SIGINT, syscall.SIGTERM)
	<- c
	server.Shutdown(context.Background())
	//fmt.Println("jijooo:,", e)
}