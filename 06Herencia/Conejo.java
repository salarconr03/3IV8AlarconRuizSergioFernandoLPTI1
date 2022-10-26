import javax.swing.JOptionPane;
public class Conejo extends Animal {
    // *La palabra resevada extend es para heredar
    private double salto;

    public Conejo() {

    }

    public Conejo(String nombre, String raza, String tipoalimento, int edad, double salto) {
        // *Para obtener o acceder a los atributos heredados debemos hacer us de la
        // palabra reservada super
        super(nombre, raza, tipoalimento, edad);
        this.salto = salto;
    }

    // ! get
    public double getSalto() {
        return salto;
    }

    // ! set
    public void SetSalto(double salto) {
        this.salto = salto;
    }

    public void mostrarconejo() {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del conejo");
        String raza = JOptionPane.showInputDialog("Ingresa la raza del conejo");
        String tipoalimento = JOptionPane.showInputDialog("Ingresa el tipo de alimeto");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del conejo"));
        Double salto = Double.parseDouble(JOptionPane.showInputDialog("Ingresa que tan alto salta tu conejo en cm"));

        JOptionPane.showMessageDialog(null, "El nombre del conejo es " + nombre + "\n" + "La raza del conejo es " + raza + "\n" + "El tipo de alimento del conejo es " + tipoalimento + "\n" + "La edad del conejo es " + edad + "\n" + "Salta " + salto + "cm" +  "\n");

    }
}
