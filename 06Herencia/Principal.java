import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        int op;
        Gato cat = new Gato();
        Perro dog = new Perro();
        Conejo rabbit = new Conejo();
        Hamster hamster = new Hamster();
        Huron huron = new Huron();

        op = Integer.parseInt(JOptionPane.showInputDialog("¿Con que animal deseas trabajar? \n" + "1. Perro \n" + "2. Gato \n" + "3. Conejo \n" + "4. hamster \n" + "5. Huron"));

        switch(op){
            case 1:
                dog.mostrarperro();
                break;
            case 2:
                cat.mostrargato();
                break;
            case 3:
                rabbit.mostrarconejo();
                break;
            case 4:
                hamster.mostrarhamster();
                break;
            case 5:
                huron.mostrarhuron();
                break;
        }
    }
}
