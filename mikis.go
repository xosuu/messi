package main

import (
	"context"
	"fmt"
	"net/http"
	//"os"
	"time"
)



func main(){
	//var s string 
	chain := make(chan int)

	s := make(chan string)


	go serv(s)
	go contador(chain, 9909, 1)
	go contador(chain, 180000, 2)
	go contador(chain, 200676, 3)
	go contador(chain, 100000000, 4)



	for range(5){
		select{
		case chr1 := <- chain:
			fmt.Println("Asdasdasdasd")
			fmt.Println(chr1)
		case chr2 := <- chain:
			fmt.Println(chr2)
		case chr3 := <- chain:
			fmt.Println(chr3)
		case chr4 := <- chain:
			fmt.Println(chr4)
		case chr5 := <- s:
			fmt.Println(chr5)

		}
	}
}




var nume int
func contador(c chan int, limite int, numTarea int){
	
	siu := 0
	nume ++

	
	start := time.Now().UnixMilli()
	for i:=1 ; i<=limite; i++{
		
		//time.Sleep(1*time.Millisecond)
		siu += 1
		
	}
	now := time.Now().UnixMilli() - start
	
	u := fmt.Sprintf("tarea N^%d terminada en %d milisegundos", numTarea, now)
	fmt.Println(u)
	c <- siu
	
}



func serv(c chan string){
	//http.HandleFunc("/s", ee)
	http.FileServer(http.Dir("/"))
	serve := &http.Server{
		Addr: ":3008",
		ReadTimeout: 2*time.Second,
	}
	fmt.Println("Server starting...")
	go serve.ListenAndServe()

	time.Sleep(1*time.Minute)
	x, cancel:= context.WithTimeout(context.Background(), 10*time.Second)
	
	defer cancel()
	
	serve.Shutdown(x)
	c <- "finalizado"
	
}

func ee(w http.ResponseWriter, r *http.Request){
	fmt.Println(w, "Eeeeeeeeeee")
}







