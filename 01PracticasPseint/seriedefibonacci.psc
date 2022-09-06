Algoritmo seriedefibonacci
	Definir x Como Entero
	Definir a,b,c,fib Como Real
	Repetir
		Dimension fib[100]
		a <- 0
		b <- 1
		Para x<-1 Hasta 100 Hacer
			fib[x] <- a
			c <- a+b
			a <- b
			b <- c
		FinPara
		Para x<-1 Hasta 100 Hacer
			Escribir fib[x]
		FinPara
		Escribir 'Desea repetri: si/no'
		Leer respuesta
	Hasta Que respuesta='no'
FinAlgoritmo
