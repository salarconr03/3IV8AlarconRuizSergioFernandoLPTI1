Algoritmo calificaciones
	Escribir "Desarrolle un algoritmo que permita convertir calificaciones num�ricas a letras"
	nota <- 0
	
	Repetir
	Escribir "Ingresa la calificaci�n num�rica: "
	Leer nota
	Si nota > 20 Entonces
		Escribir "No se aceptan n�meros tan grandes"
	SiNo
		Si nota >= 19 y nota <= 20 Entonces
			Escribir "Tu nota es A"
		SiNo
			Si nota >= 16 y nota <= 18 Entonces
				Escribir "Tu nota es B"
			SiNo
				Si nota >= 13 y nota <= 15 Entonces
					Escribir "Tu nota es C"
				SiNo
					Si nota >= 10 y nota <= 12 Entonces
						Escribir "Tu nota es D"
					SiNo
						Si nota >= 1 y nota <= 9 Entonces
							Escribir "Tu nota es E"
						SiNo
							Escribir "no negativos"
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si
	Hasta que nota = 0
FinAlgoritmo
