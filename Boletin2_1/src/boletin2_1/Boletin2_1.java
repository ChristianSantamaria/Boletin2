/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio 1
        
        float b, h ;
        
        b = Float.parseFloat(JOptionPane.showInputDialog("Base: "));
        h = Float.parseFloat(JOptionPane.showInputDialog("Altura: "));
        
        float a = (b * h) / 2;
        System.out.println("O area do triangulo e: "+ a);
        
        
    }
    
}
