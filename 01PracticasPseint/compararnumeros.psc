Algoritmo compararnumeros
	Escribir "Ejemplo para comparar si un numero es menor a diez:"
	num1<-0
	num2<-0
	num3<-0
	Escribir "Ingresa un número:"
	Leer num1
	Escribir "Ingresa otro número:"
	Leer num2
	Escribir "Ingresa otro número"
	Leer num3
	Si num1 == num2 y num1 == num3 Entonces
		Escribir "los tres números son iguales"
	SiNo
		Si num1 es mayor que num2 y num1 es mayor que num3 Entonces
			Escribir num1, " es el mayor"
		SiNo
			Si num2 es mayor que num1 y num2 es mayor que num3 Entonces
				Escribir num2, " es el mayor"
			SiNo
				Si num3 es mayor que num1 y num3 es mayor que num2 Entonces
					Escribir num3, " es el mayor"
				SiNo
					Si num1 == num2 y num1 es mayor que num3 Entonces
						Escribir "el primero y el segundo son iguales y mayores que ", num3
					SiNo
						Si num1 == num3 y num1 es mayor que num2 Entonces
							Escribir "el primero y el tercero son iguales y mayores que ", num2
						SiNo
							Si num2 == num3 y num2 es mayor que num1 Entonces
								Escribir "el segundo y el tercero son iguales y mayores que ", num1
							SiNo
								
							Fin Si
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Fin Si

FinAlgoritmo
