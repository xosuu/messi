package telegram

import (
	// "net/http"
	// "os"
	"encoding/json"
	"fmt"
	"io"
	"net/http"
	"os"

	// "dog/dog"
	"dog/mystruct"
)



var URL string = "https://api.telegram.org/"

func Send(msg string)(string, error){
	tokenTelegram := getToken() 
	resp , err := http.Post(URL+"bot"+ tokenTelegram + "/" + "sendMessage")
	return "", nil
}


func getToken()string{
	jsn,err := os.ReadFile("../info.json")
	if(err != nil){
		panic(" No existe el archivo info.json")
	}
	
	var Data mystruct.Docs
	resp := json.Unmarshal([]byte(string(jsn)), &Data)
	if(resp!=nil){
		fmt.Println(resp.Error())
	}
	if(Data.TelegramToken  == "" && verifyToken(Data.TelegramToken) == false){
		panic("Token invalido")
	}
	return Data.TelegramToken

}

func verifyToken(token string)bool{
	resp, err := http.Get(URL+"bot"+token+"/getMe")
	if(err != nil){
		panic("Algo salio mal al verificar el token : " + err.Error())
	}

	// body, err := io.ReadAll(resp.Body)
	// defer resp.Body.Close()

	if(resp.StatusCode == 200){
		return true
	}
	return false

}





