Algoritmo numeroparoimpar
	num1<-0
	Repetir
		Escribir "Inserta un n�mero"
		Leer num1
		Si num1 mod 2 = 0 Entonces
			Escribir "El n�mero ", num1, " es par"
		SiNo
			Escribir "El n�mero ", num1, " es impar"
		Fin Si
		Escribir "Desea repetir: si/no"
		Leer respuesta
	Hasta Que respuesta = "no"
FinAlgoritmo
