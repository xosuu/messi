package main

import(
	"testing"
	"fmt"
	"dog/dog"
)





func TestListCleaner(t *testing.T){
	lista := []string{" ", "asd", "iuiu", "dasda"}

	fmt.Println(dog.ListCleaner(lista))

}




