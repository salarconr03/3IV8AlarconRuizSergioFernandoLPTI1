import java.util.Scanner;
public class Figura {
    double lado, base, altura, ladoa, ladob, radio, area, perimetro;
    int figura;
    final double pi = 3.14;
    Scanner entrada = new Scanner(System.in);

    public void menu() {
        System.out.println("Con que figura quieres trabajar:");
		System.out.println("Rectangulo: 1");
		System.out.println("Cuadrado: 2");
		System.out.println("Triangulo: 3");
		System.out.println("Circulo: 4");
		figura = entrada.nextInt();

        switch(figura){
            case 1:
                rectangulo();
                break;
            case 2:
                cuadrado();
                break;
            case 3:
                triangulo();
                break;
            case 4:
                circulo();
                break;
        }
    }

    public void rectangulo() {
        try {
            System.out.println("Introduce la base: ");
            base = entrada.nextInt();
            System.out.println("Introduce la altura: ");
            altura = entrada.nextInt();
            area = base * altura;
            perimetro = 2 * (base + altura);
            System.out.println("El area es " + area + " y el perimetro es " + perimetro);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor introduce un valor valido");
        }
    }

    public void cuadrado() {
        try {
            System.out.println("Introduce un lado: ");
            lado = entrada.nextInt();
            area = lado * lado;
            perimetro = lado * 4;
            System.out.println("El area es " + area + " y el perimetro es " + perimetro);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor introduce un valor valido");
        }
    }

    public void triangulo() {
        try {
            System.out.println("Introduce la base: ");
            base = entrada.nextInt();
            System.out.println("Introduce la altura: ");
            altura = entrada.nextInt();
            System.out.println("Introduce los dos lados restantes: ");
            ladoa = entrada.nextInt();
            ladob = entrada.nextInt();
            area = (base * altura) / 2;
            perimetro = base + ladoa + ladob;
            System.out.println("El area es " + area + " y el perimetro es " + perimetro);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor introduce un valor valido");
        }
    }

    public void circulo() {
        try {
            System.out.println("Introduce el radio: ");
            radio = entrada.nextInt();
            area = pi * (radio * radio);
            perimetro = pi * (2 * radio);
            System.out.println("El area es " + area + " y el perimetro es " + perimetro);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Por favor introduce un valor valido");
        }
    }
    
}
