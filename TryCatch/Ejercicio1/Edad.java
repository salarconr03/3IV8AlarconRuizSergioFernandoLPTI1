import java.util.Scanner;
public class Edad{
    int nacimiento;
    int actual;
    int edad;
    Scanner entrada = new Scanner(System.in);

    public void datos() {
        try {
            System.out.println("Introduce el ano en el que naciste.");
            nacimiento = entrada.nextInt();
            System.out.println("Introduce el ano actual");
            actual = entrada.nextInt();
            calcular();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor introduce un valor valido.");
        }
    }

    public void calcular() {
       edad = actual - nacimiento;
       System.out.println("Tu edad es de : " + edad + " anos");
    }
}