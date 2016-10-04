/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_8;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin2_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cent, cambio, fareh, kelvin ;
        cambio = 1.8;
        cent = Float.parseFloat(JOptionPane.showInputDialog("Escriba los grados centigrados: "));
         
        fareh = (cent * cambio) + 32;
        kelvin = cent + 273;
        
        System.out.println("En Fahrenheit: "+ fareh );
        System.out.println("En Kelvin: "+ kelvin );
        
        
    }
    
}
