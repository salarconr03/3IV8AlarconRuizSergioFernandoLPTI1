import java.util.Scanner;
class Descuento{
  public static void main (String[] args){
    int edad;
    int costo = 2400;
    double costofinal;
    char socio;
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Alarcon Ruiz, Sergio Fernando");
    System.out.println("Costo sin descuento = 2400");
    System.out.println("Introduce tu edad: ");
    edad = teclado.nextInt();

    if(edad > 65){
      costofinal = costo - (costo * 0.4);
      System.out.println("Tu costo final es de " + costofinal);
    } else if(edad < 21){
      System.out.println("¿Tus padres son socios? (S/N)");
      socio = teclado.next().charAt(0);
      if(socio == 'S' || socio == 's'){
        costofinal = costo - (costo * 0.45);
        System.out.println("Tu costo final es de " + costofinal);
      } else if(socio == 'N' || socio =='n'){
        costofinal = costo - (costo * 0.25);
        System.out.println("Tu costo final es de " + costofinal);
      }
    }else{
      System.out.println("Tu costo final es de 2400");
    }
  }
}