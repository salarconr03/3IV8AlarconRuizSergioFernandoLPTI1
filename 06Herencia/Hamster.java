import javax.swing.JOptionPane;
public class Hamster extends Animal {
    // *La palabra resevada extend es para heredar
    private String muerte;

    public Hamster() {

    }

    public Hamster(String nombre, String raza, String tipoalimento, int edad, String Muerte) {
        // *Para obtener o acceder a los atributos heredados debemos hacer us de la
        // palabra reservada super
        super(nombre, raza, tipoalimento, edad);
        this.muerte = muerte;
    }

    // ! get
    public String getMuerte() {
        return muerte;
    }

    // ! set
    public void SetMuerte(String muerte) {
        this.muerte = muerte;
    }

    public void mostrarhamster() {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del hamster");
        String raza = JOptionPane.showInputDialog("Ingresa la raza del conejo");
        String tipoalimento = JOptionPane.showInputDialog("Ingresa el tipo de alimeto");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del hamster"));
        String muerte = JOptionPane.showInputDialog("Ingresa como murio");

        JOptionPane.showMessageDialog(null, "El nombre del hamster es " + nombre + "\n" + "La raza del hamster es " + raza + "\n" + "El tipo de alimento del hamster es " + tipoalimento + "\n" + "La edad del hamster es " + edad + "\n" + "murio " + muerte + "\n");

    }
}
