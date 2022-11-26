/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08crudpersonas;

/**
 *
 * @author alumno
 */

import javax.swing.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VistaPersona ventana = new VistaPersona();
        //ventana.principal();
        
        //tenemos que crear un JFrame
        JFrame ventana = new JFrame("Dormiditos");
        //definir el tamaño de la ventana
        ventana.setSize(550, 270);
        
        //definir las acciones para la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //toda ventana necesita un oanel
        JPanel panel = new JPanel();
        //lo agregamos a la ventana
        ventana.add(panel);
        ventana.setVisible(true);
        
        agregarComponentes(panel);
        
    }
    
    private static void agregarComponentes(JPanel panel){
        //vamos a inicializar el panel
        panel.setLayout(null);
        
        //etiquetas
        JLabel userlabel = new JLabel("Nombre de usuario");
        //Vamos a definir su tamaño y orientacion dentro del panel
        userlabel.setBounds(10, 10, 120, 50);
        //agregamos el panel
        panel.add(userlabel);
        
        JTextField usertext = new JTextField();
        usertext.setBounds(160, 50, 160, 25 );
        panel.add(userlabel);
        
        //etiquetas
        JLabel userpassword = new JLabel("password");
        //Vamos a definir su tamaño y orientacion dentro del panel
        userpassword.setBounds(10, 40, 80, 50);
        //agregamos el panel
        panel.add(userpassword);
        
        JTextField passtext = new JTextField();
        passtext.setBounds(160, 50, 160, 25 );
        panel.add(userpassword);
        
        //botones
        JButton loginbutton = new JButton("Iniciar Sesion");
        loginbutton.setBounds(10, 80, 120, 25);
        panel.add(loginbutton);
        
        JButton registerbutton = new JButton("Registrate");
        registerbutton.setBounds(180, 80, 120, 25);
        panel.add(registerbutton);
    }
}
