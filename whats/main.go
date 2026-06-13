package main

import (
	"context"
	"fmt"
	"os"
	"os/signal"
	"syscall"
	_ "github.com/mattn/go-sqlite3"
	qrterminal "github.com/mdp/qrterminal/v3"
	"go.mau.fi/whatsmeow"
	"go.mau.fi/whatsmeow/store/sqlstore"
	"go.mau.fi/whatsmeow/types/events"
	waLog "go.mau.fi/whatsmeow/util/log"

)



func EventHandler(ev any){
	switch e := ev.(type){
		
	case *events.Message:
		fmt.Println("Received message ", e.Message.GetConversation())
		fmt.Println("from:", e.Message.GetChat())
	}
}

func main(){
	ctx := context.Background()

	dbLog := waLog.Stdout("Database", "DEBUG", true)
	clientLog := waLog.Stdout("Client", "DEBUG", true)


	cont, err := sqlstore.New(ctx, "sqlite3", "file:examplestore.db?_foreign_keys=on", dbLog)
	if(err != nil){
		panic(err)
	}

	deviceStore, er := cont.GetFirstDevice(ctx)
	if( er != nil ){
		panic(er)
	}
	

	client := whatsmeow.NewClient(deviceStore, clientLog)
	client.AddEventHandler(EventHandler)

	if( client.Store.ID == nil){
		qrChan, errw := client.GetQRChannel(ctx)
		if( errw!= nil){
			panic(errw)
		}
		er = client.Connect()
		if( er!= nil){
			panic(er)
		}
		for qr := range qrChan{
			if(qr.Event == "code"){

				qrterminal.GenerateHalfBlock(qr.Code, qrterminal.L, os.Stdout)

			}
		}
	}else{
		e := client.Connect()
		if( e != nil){
			panic(e)
		}
	}


	c := make(chan os.Signal, 1)

	fmt.Println("Escuchando mensaje, ctrl+c para salir")
	signal.Notify(c, os.Interrupt, syscall.SIGTERM)

	<-c 
	client.Disconnect()

}



