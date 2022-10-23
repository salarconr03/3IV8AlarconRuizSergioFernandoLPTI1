public class Principal {
    public static void main(String[] args) {
        Gato cat = new Gato("Lucifer", "de calle", "Atun", 3, 6);
        Perro dog = new Perro("Morris", "de calle", "pollo", 6, "guau guau");
        dog.mostrarperro();
        cat.mostrargato();
    }
}
