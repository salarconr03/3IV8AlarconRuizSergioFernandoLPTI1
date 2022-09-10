/*
 *Todo programa en java debe tener el nombre de la clase tal cual el nombre del archivo0 
 */
class EntradaTexto {
    // Los limites de la clase
    // toda la clse debe tener un metodo principal
    /*
     * Vamos a realizar un rpogrma mediante el cual podemos introducir texto a
     * nuestra conveniencia
     */

    // metodo principal
    public static void main(String[] args) {

        // tipo de dato
        String nombre;
        int edad;
        // el ; es el fin de la linea
        // instancia
        System.out.println("Introduce tu nombre");

        // Vamos a obtener el nombre sel usuario

        nombre = System.console().readLine();

        System.out.println("Introduce tu edad: ");

        edad = Integer.parseInt(System.console().readLine());

        System.out.println("Hola " + nombre + " bienvenido a tu progrmita, tienes " + edad + " primaveras");
    }

}