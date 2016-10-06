/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_7;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin2_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n, i, t,resultado;
       
        
        n = Double.parseDouble(JOptionPane.showInputDialog("Nominal: "));
        i = Double.parseDouble(JOptionPane.showInputDialog("Interes: "));
        t = Double.parseDouble(JOptionPane.showInputDialog("Años: "));
        
        t = t * 12;
        i = i / 1200;
        
        resultado = (n*(Math.pow((1+i),t)*i))/((Math.pow((1+i),t)-1));
        
        System.out.println("La renta mensual es de: " + resultado );
        
    }
    
}
