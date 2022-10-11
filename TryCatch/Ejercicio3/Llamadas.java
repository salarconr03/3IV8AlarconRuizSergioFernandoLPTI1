import java.util.Scanner;
public class Llamadas{
    int opcion, tipo, minutos, op;
    double costo, numero, credito;
    char respuesta;
    Scanner entrada = new Scanner(System.in);

    public void menu() {
        do{
            System.out.println("Que desea realizar.");
            System.out.println("1. Llamadas");
            System.out.println("2. Consultar o ingresar credito");
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    llamadas();
                    break;
                case 2:
                    credito();
                    break;
            }
        }while (respuesta == 'S' || respuesta == 's');
    }

    public void llamadas(){
        System.out.println("Ingresa tu numero de telefono");
        numero = entrada.nextDouble();
        System.out.println("Que tipo de llamada desea realizar");
        System.out.println("1. Llamada local nacional");
        System.out.println("2. Llamada local internacional");
        System.out.println("3. Celulares");
        tipo = entrada.nextInt();

        switch(tipo){
        case 1:
                try {
                    System.out.println("Ingrese la cantidad de minutos que durara la llamada");
                    minutos = entrada.nextInt();
                    costo = minutos * 0.5;
                    System.out.println("El costo de la llamada es de $" + costo);
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Por favor ingresa un valor valido");
                    System.out.println("¿Desea repetir el programa? S/N");
                    respuesta = entrada.next().charAt(0); 
                }
                System.out.println("¿Desea repetir el programa? S/N");
                respuesta = entrada.next().charAt(0); 
            break;
        case 2:
            try {
            System.out.println("Ingrese la cantidad de minutos que durara la llamada");
            minutos = entrada.nextInt();
            costo = minutos * 0.6;
            System.out.println("El costo de la llamada es de $" + costo);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor ingresa un valor valido");
                System.out.println("¿Desea repetir el programa? S/N");
                respuesta = entrada.next().charAt(0); 
            }
            System.out.println("¿Desea repetir el programa? S/N");
            respuesta = entrada.next().charAt(0);
            break;
        case 3:
            try {
                System.out.println("Ingrese la cantidad de minutos que durara la llamada");
            minutos = entrada.nextInt();
            costo = minutos * 0.2;
            System.out.println("El costo de la llamada es de $" + costo);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor ingresa un valor valido");
                System.out.println("¿Desea repetir el programa? S/N");
                respuesta = entrada.next().charAt(0); 
            }
            System.out.println("¿Desea repetir el programa? S/N");
            respuesta = entrada.next().charAt(0);
            break;
        }
    }

    public void credito() {
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Ingresar credito");
        System.out.println("2. Consultar credito");
        op = entrada.nextInt();

        switch(op){
            case 1:
                try {
                System.out.println("Ingrese la cantidad deseada");
                credito = entrada.nextDouble();
                System.out.println("Su credito es de $" + credito);
                } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor ingresa un valor valido");
                System.out.println("¿Desea repetir el programa? S/N");
                respuesta = entrada.next().charAt(0); 
                }
                System.out.println("¿Desea repetir el programa? S/N");
                respuesta = entrada.next().charAt(0);
                break;
            case 2:
                credito = credito - costo;
                System.out.println("Su credito es de $" + credito);
                System.out.println("¿Desea repetir el programa? S/N");
                respuesta = entrada.next().charAt(0);
                break;
        }
    }
}