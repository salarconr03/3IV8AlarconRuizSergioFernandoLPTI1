import javax.swing.JOptionPane;
public class Gato extends Animal {
    private int vidas;

    public Gato() {

    }

    public Gato(String nombre, String raza, String tipoalimento, int edad, int vidas) {
        // *Para obtener o acceder a los atributos heredados debemos hacer us de la
        // palabra reservada super
        super(nombre, raza, tipoalimento, edad);
        this.vidas = vidas;
    }

    // ! get
    public int getVidas() {
        return vidas;
    }

    // ! set
    public void SetVidas(int vidas) {
        this.vidas = vidas;
    }

    public void mostrargato(){
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del gato");
        String raza = JOptionPane.showInputDialog("Ingresa la raza del gato");
        String tipoalimento = JOptionPane.showInputDialog("Ingresa el tipo de alimeto");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del gato"));
        int vidas = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de vidas que le quedan"));

        JOptionPane.showMessageDialog(null, "El nombre del gato es " + nombre + "\n" + "La raza del gato es " + raza + "\n" + "El tipo de alimento del gato es " + tipoalimento + "\n" + "La edad del gato es " + edad + "\n" + "El numero de vidas que le quedan son  " + vidas + "\n");

    }

}
