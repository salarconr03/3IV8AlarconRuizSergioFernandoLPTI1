import java.util.Scanner;
class Binario{
  public static void main (String[] args){
    int numbinario;
    String binario = "";
    Scanner entrada = new Scanner(System.in);

    System.out.println("Alarcon Ruiz, Sergio Fernando");
    System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
    numbinario = entrada.nextInt();
    binario = "";
    if(numbinario > 0){
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
  }
}