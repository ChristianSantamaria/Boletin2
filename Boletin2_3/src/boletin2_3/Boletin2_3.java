/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float cambio = 0;
        float euros = 0;
        cambio = Float.parseFloat(JOptionPane.showInputDialog("Cambio: "));
        euros = Float.parseFloat(JOptionPane.showInputDialog("Euros: "));
        float resultado = cambio * euros;
        System.out.println("El resultado del cambio es "+resultado);
    }
    
}
