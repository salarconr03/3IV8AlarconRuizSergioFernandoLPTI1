/*
 * Vamos a crear un programa que se encargue de realizar las siguientes operaciones
 * 
 * 1-Bono o descuento por la edad
 * 2-Convertir numeros decimales a binarioa
 * 3-Convertir temperatura celcius a kelvin y rakine
 * 4-Numero de positivos y negativos de acuerdo a una lista.
 * 5-Tiendita peke
 * 6-Area y perimetro de figuras
 * 7-tabla
 * 8-Factorial
 * 9-Dibujito
 * 10-Figuras huecas de codigo
 * 11-Patrones
 * 12-Diamante
 * 13-Calculadora
 * 14-Salir
 */

 import java.util.Scanner;
 class Estructuradatos{
    //Programa 1
    public static void main(String[] args){
        //decalro mi objeto
        Scanner entrada = new Scanner(System.in); 
        
        //variables
        int edad, opcion, socio, numbinario, total, numerototal, n, a, b;
        int positivos = 0;
        int negativos = 0;
        double precio, bono;
        char letras, operacion;
        float precios = 0;
        float resultad = 0;
        int cantidad = 0;
        String binario = "";

        //vamos a crear un bucle para que se repita el programa
        do{
            //Vamos a crear nuestr menu
            System.out.println("Bienvenido a la tarea que tenian que hacer");
            System.out.println("1-Descuento por edad");
            System.out.println("2-Convertir numero decimal a binario");
            System.out.println("3-Conversiones de temperatura");
            System.out.println("4-Numeros positivos y negativos");
            System.out.println("5-La tiendita");
            System.out.println("6-Area y perimetro");
            System.out.println("7-Tabla");
            System.out.println("8-Factorial");
            System.out.println("9-Dibujitos");
            System.out.println("10-Figura hueca");
            System.out.println("11-Patrones");
            System.out.println("12-Diamante");
            System.out.println("13-Calculadora");
            System.out.println("14-Salir");

            opcion = entrada.nextInt();

            //nuestro swirch
            switch(opcion){
                case 1:
                    break;
                case 2:
                    System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    binario = "";
                    // Tengo que comprobar que es un entero positivo 
                    if(numbinario > 0){
                        //Debo de aplicar el algoritmo
                        while(numbinario > 0){
                            if(numbinario % 2 == 0){
                                binario = "0" + binario;
                            } else{
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2;
                        }
                    } else if(numbinario == 0){
                        binario = "0";
                    } else{
                        binario = "\n No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero binario es :" + binario);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    //vamos a ver un for
                    for(n=1; n<=10; n++){
                        System.out.println(n + " " + (n * 10) + " " + (n * 100) + " " + (n * 1000));
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Cuadrado magico");
                    System.out.println("Inserta el numero de unidades entre el 1 y 20");
                    n = entrada.nextInt();
                    if(n >= 1 && n <= 20){
                        //linea superior
                        for(int i = 0; i < n; i++){
                            System.out.print(" * ");
                        }
                        System.out.println("");
                        //cuadrado interno
                        for(int j = 0; j < n-2; j++){
                            System.out.print(" * "); 
                            //columna
                            for(int k = 0; k < n-2; k++){
                                System.out.print("   ");
                            }
                            System.out.println(" * ");
                        }
                        //linea inferior
                        for(int i = 0; i < n; i++){
                         System.out.print(" * ");
                        }
                        System.out.println("");
                        } else{
                            System.out.println("Error solo entre el 1 y 20");
                        }
                    }
                    break;
            }while(letras == 's' || letras == 'S'); 

            //Debo preguntar al final
            System.out.println("Deseas repetir el programa? Si lo desea escriba s");

            letras = entrada.next().charAt(0);
        }  
    }