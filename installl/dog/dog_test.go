package dog

import (
	"fmt"
	"testing"
)





func TestDeleteLastElement(t *testing.T){
	lista := []string{"ave", "conejo", "perro", "gato", " ", "asdasdsdasdasdasda"}
	//list := []int{234,45,23,45,77777, 435, 888, 9898,24234,23453,56756,9999999999999}

	e := deleteLastElement(lista)

	fmt.Println(e)

}







