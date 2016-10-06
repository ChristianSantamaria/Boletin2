/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1, n2;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));
        
        System.out.println("La suma de ellos es = "+ (n1 + n2));
        System.out.println("La resta de ellos es = "+ (n1 - n2));
        System.out.println("La multiplicacion de ellos es = "+ (n1 * n2));
        System.out.println("La division de ellos es = "+ (n1 / n2));
        
        
    }
    
}
