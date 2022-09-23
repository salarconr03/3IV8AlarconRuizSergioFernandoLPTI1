import java.util.Scanner;
class serienumeros{
    public static void main(String []args){
        int cantidad;
        int cero = 0;
        int n;
        int positivos = 0 ;
        int negativos = 0 ;
        int i;
        Scanner entrada = new Scanner(System.in);

            System.out.println("Alarcon Ruiz, Sergio Fernando");
            System.out.println("Introduce la cantidad de numeros");
            cantidad = entrada.nextInt();
            for (i = 0; i < cantidad; i++){
                System.out.println("Ingrese el valor del numero");
                n = entrada.nextInt();

                if(n > 0){
                    System.out.println("El numero "+ n +" es positivo");
                    positivos++;
                }if (n < 0){
                    System.out.println("El numero "+ n +" es negativo");
                    negativos++;
                }if (n == 0 ){
                    System.out.println("El numero "+ n +" es neutro");
                    cero++;
                }
            }
            System.out.println("La cantidad de numeros positivos es: "+ positivos);
            System.out.println("La cantidad de numeros negativos es: "+ negativos);
            System.out.println("La cantidad de numeros sin signo es: "+ cero);
    }
}        
         
        

