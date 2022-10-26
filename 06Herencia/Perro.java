import javax.swing.JOptionPane;
public class Perro extends Animal {
    // *La palabra resevada extend es para heredar
    private String ladrido;

    public Perro() {

    }

    public Perro(String nombre, String raza, String tipoalimento, int edad, String ladrido) {
        // *Para obtener o acceder a los atributos heredados debemos hacer us de la
        // palabra reservada super
        super(nombre, raza, tipoalimento, edad);
        this.ladrido = ladrido;
    }

    // ! get
    public String getLadrido() {
        return ladrido;
    }

    // ! set
    public void SetLadrido(String ladrido) {
        this.ladrido = ladrido;
    }

    public void mostrarperro() {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del perro");
        String raza = JOptionPane.showInputDialog("Ingresa la raza del perro");
        String tipoalimento = JOptionPane.showInputDialog("Ingresa el tipo de alimeto");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del perro"));
        String ladrido = JOptionPane.showInputDialog("Ingresa el ladrido del perro");

        JOptionPane.showMessageDialog(null, "El nombre del perro es " + nombre + "\n" + "La raza del perro es " + raza + "\n" + "El tipo de alimento del perro es " + tipoalimento + "\n" + "La edad del perro es " + edad + "Su ladrido es " + ladrido + "\n");

    }
}
