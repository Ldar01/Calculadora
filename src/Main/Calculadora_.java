/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.Ventana;
import Main.Aritmetica.Aritmetico;
import Main.Convertor.Convertor;
import javax.swing.JFrame;

/**
 *
 * @author LN710Q
 */
public class Calculadora_ {

    public static void main(String[] args) {

        JFrame ventana = new JFrame("Calculadora Basica");
        ventana.setContentPane(new Ventana());
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.pack();
        ventana.setVisible(true);
    }
    
}
