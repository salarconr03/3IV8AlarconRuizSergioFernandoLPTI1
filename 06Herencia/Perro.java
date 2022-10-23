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
        System.out.println("El nombre del perro es " + getNombre() + "\n" + "su raza es " + getRaza() + "\n"
                + "Se alimenta de " + getTipoalimento() + "\n" + "su ladrido es " + getLadrido() + "\n");
    }
}
