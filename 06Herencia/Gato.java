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

    public void mostrargato() {
        System.out.println("El nombre del gato es " + getNombre() + "\n" + "su raza es " + getRaza() + "\n"
                + "Se alimenta de " + getTipoalimento() + "\n" + "el numero de vidas disponibles " + getVidas() + "\n");
    }
}
