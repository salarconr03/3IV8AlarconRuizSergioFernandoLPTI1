Algoritmo factorial
	Definir n,f Como Real
	Repetir
		n <- 0
		f <- 1
		Escribir 'Ingrese un número:'
		Leer n
		Para i<-1 Hasta n Hacer
			f <- f*i
		FinPara
		Escribir 'El factorial de ',n,' Es: ',f
		Escribir 'Desea repetir: si/no'
		Leer respuesta
	Hasta Que respuesta='no'
FinAlgoritmo
