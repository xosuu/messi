package mystruct




type Files struct{
	Paths []string `json:"paths"`
}
type Directory struct{
	Paths []string `json:"paths"`
}

type Docs struct{
	TelegramToken string `json:"telegramToken"`
	File Files `json:"file"`
	Dir  Directory `json:"dir"`


}



type SendMessage struct{
	ChatId int `json:"chat_id"`
	Text string `json:"text"`
}








