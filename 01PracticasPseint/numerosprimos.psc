Algoritmo numerosprimos
	Definir num, x, cont Como Entero
	num<-0
	Repetir
		Escribir "Ingresa un número:"
		Leer num
		x<-1
		cont<-0
		Mientras x <= num o x == num Hacer
			Si num mod x == 0 Entonces
				cont = cont + 1
			Fin Si
			x = x + 1 
		Fin Mientras
		Si cont == 2 Entonces
			Escribir "El número ", num, " es primo"
		SiNo
			Escribir "El número ", num, "  no es primo"
		Fin Si
		
		Escribir "Desea repetir: si/no"
		Leer respuesta
	Hasta Que respuesta = "no"
	
FinAlgoritmo
