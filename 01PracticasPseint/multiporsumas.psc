Algoritmo multiporsumas
	definir multiplicando Como Real
	definir multiplicador Como Entero
	definir resultado Como Real
	definir contador Como Entero
	
	Escribir "Ingresa el multiplicando"
	leer multiplicando
	
	Repetir
		Escribir "Ingresar multiplicador"
		leer multiplicador
	Hasta Que multiplicador > 0
	
	contador<-0
	resultado<-0
	Mientras contador<multiplicador Hacer
		resultado<-resultado+multiplicando
		contador<-contador+1
	FinMientras
	
	Escribir "resultado= " , resultado
	
FinAlgoritmo
