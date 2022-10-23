import javax.swing.JOptionPane;

public class Datos {
    // *Necesitamos poder almacenar una lista de estudiantes
    Estudiante obj[] = new Estudiante[5];

    int x = 0;

    // !menu
    void menu() {
        /*
         * Crear dos opciones
         * 1. Registrar nuebo estudiante
         * 2. Mostrar lista de estudiante
         */
        String var = "si";
        while (var.equalsIgnoreCase("si")) {
            /*
             * Cuando se solicite una entrada de informacion debemos ocupar JOptionPane el
             * metodo showInputDialog pero debemos entender que todas las entradas de una
             * interfaz son de tipo String
             */
            int op = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido \n" + "Ingresa la opcion deseada: \n"
                    + "1. Registrar nuevo estudiante \n" + "2. Mostrar la lista de estudiantes"));

            switch (op) {
                case 1:
                    pedirEstudiante();
                    break;
                case 2:
                    mostrarEstudiante();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
            String mensaje = JOptionPane.showInputDialog("¿Desea registrar un nuevo estudiante?");
        }
    }

    // ! Pedir estudiante
    public void pedirEstudiante() {
        // *Debemos declarar primero los datos que vamos a necesitar del estudiante
        int boleta = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la boleta del estudiante"));
        String nom = JOptionPane.showInputDialog("Ingresa el nombre del estudiante");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante"));
        char gen = JOptionPane.showInputDialog("Ingrese el sexo del estudiante F/M").charAt(0);

        // * Debo ocupar mi arreglo de objetos
        obj[x] = new Estudiante(boleta, nom, edad, gen);
        x++;
    }

    // !Mostrar estudiante
    public void mostrarEstudiante() {
        // *Rrecorrer mi arreglo de objetos
        for (int i = 0; i < x; i++) {
            JOptionPane.showMessageDialog(null, "La boleta del estudiante es: " + obj[i].getNumBoleta() + "\n" +
                    "La edad del estudiante es: " + obj[i].getEdad() + "\n" + "El sexo del estudiante es: "
                    + obj[i].getSexo() + "\n" + "El nombre del estudiante es: " + obj[i].getNombre() + "\n");
        }
    }

}
