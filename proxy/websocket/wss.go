package websocket

import (
    "fmt"
    "net/http"
    "github.com/gorilla/websocket"
)

// Configurar el mejorador (upgrader) de HTTP a WebSocket
var upgrader = websocket.Upgrader{
    ReadBufferSize:  1024,
    WriteBufferSize: 1024,
    // Permitir conexiones de cualquier origen (solo para desarrollo)
    CheckOrigin: func(r *http.Request) bool { return true },
}

func wsHandler(w http.ResponseWriter, r *http.Request) {
    // 1. Mejorar la conexión HTTP
    conn, err := upgrader.Upgrade(w, r, nil)
    if err != nil {
        fmt.Println(err)
        return
    }
    fmt.Println("Cliente conectado")
    defer conn.Close()

    // 2. Bucle de lectura/escritura
    for {
        messageType, p, err := conn.ReadMessage()
        if err != nil {
            fmt.Println("Cliente desconectado", err)
            return
        }
        fmt.Printf("Mensaje recibido: %s\n", p)

        // Enviar el mensaje de vuelta
        if err := conn.WriteMessage(messageType, p); err != nil {
            fmt.Println(err)
            return
        }
    }
}

func main() {
    http.HandleFunc("/ws", wsHandler)
    fmt.Println("Servidor WebSocket en :8080/ws")
    http.ListenAndServe(":8080", nil)
}
