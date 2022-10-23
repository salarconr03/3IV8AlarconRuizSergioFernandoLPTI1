public class Animal {
    /*
     * Es poder restringir el acceso a los tipos de dato Vamos a poder agrupar en
     * una clase
     */

    private String nombre, raza, tipoalimento;
    private int edad;

    /*
     * Definimos el constructoresS.
     * Este nos sirve para declara la existencia de una clase, inicializar las
     * variables y poder crear instancias de clases
     */

    public Animal() {
        // vacio
    }

    // sobrecarga de metodo
    public Animal(String nombre, String raza, String tipoalimento, int edad) {
        // para poder definir los parametros de acceso a las variables
        this.nombre = nombre;
        this.raza = raza;
        this.tipoalimento = tipoalimento;
        this.edad = edad;
    }

    /*
     * Poder enviar y obtener los valores correspondientes de las variables
     * getter y setter
     * get -> obtener -> recibir
     * set -> asignar -> enviar
     */

    // ! get
    public String getNombre() {
        return nombre;
    }

    // ! set
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    // ! get
    public String getRaza() {
        return raza;
    }

    // ! set
    public void SetRaza(String raza) {
        this.raza = raza;
    }

    // ! get
    public String getTipoalimento() {
        return tipoalimento;
    }

    // ! set
    public void SetTipoalimento(String tipoalimento) {
        this.tipoalimento = tipoalimento;
    }

    // ! get
    public int getEdad() {
        return edad;
    }

    // ! set
    public void SetEdad(int edad) {
        this.edad = edad;
    }
}