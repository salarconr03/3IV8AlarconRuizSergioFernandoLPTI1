import javax.swing.JOptionPane;
public class Huron extends Animal {
    // *La palabra resevada extend es para heredar
    private int dormir;

    public Huron() {

    }

    public Huron(String nombre, String raza, String tipoalimento, int edad, int dormir) {
        // *Para obtener o acceder a los atributos heredados debemos hacer us de la
        // palabra reservada super
        super(nombre, raza, tipoalimento, edad);
        this.dormir = dormir;
    }

    // ! get
    public int getDormir() {
        return dormir;
    }

    // ! set
    public void SetDormir(int dormir) {
        this.dormir = dormir;
    }

    public void mostrarhuron() {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del huron");
        String raza = JOptionPane.showInputDialog("Ingresa la raza del huron");
        String tipoalimento = JOptionPane.showInputDialog("Ingresa el tipo de alimeto");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del huron"));
        int dormir = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de horas que duerme al dia"));

        JOptionPane.showMessageDialog(null, "El nombre del huron es " + nombre + "\n" + "La raza del huron es " + raza + "\n" + "El tipo de alimento del huron es " + tipoalimento + "\n" + "La edad del huron es " + edad + "\n" + "duerme  " + dormir + " horas al dia");

    }
}
