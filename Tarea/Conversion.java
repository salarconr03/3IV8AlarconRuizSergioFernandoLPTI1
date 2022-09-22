import java.util.Scanner;
class Conversion{
  public static void main (String[] args){
    double temperatura;
    double centigrados;
    double kelvin;
    double rankine;
    int conversion;
    Scanner teclado = new Scanner(System.in);
  
    System.out.println("Alarcon Ruiz, Sergio Fernando");
    System.out.println("Introduce la temperatura en Farenheight que desees convertir");
    temperatura = teclado.nextDouble();
    System.out.println("¿Con que conversion desea trabajar?");
    System.out.println("1-Centigrados");
    System.out.println("2-Kelvin");
    System.out.println("3-Rankine");
    conversion = teclado.nextInt();

    switch(conversion){
      case 1:
        centigrados = ((temperatura - 32) * 5) / 9;
        System.out.println("El resultado de la conversion es " + centigrados + "°C");
        break;
      case 2:
        kelvin = ((temperatura - 32) * 5) / 9 + 273.15;
        System.out.println("El resultado de la conversion es " + kelvin + "°K");
        break;
      case 3:
        rankine = temperatura + 459.67;
        System.out.println("El resultado de la conversion es " + rankine + "°R");
        break;
    }
  }
}