/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_10;

import javax.swing.JOptionPane;

/**
 *
 * @author csantamariacameselle
 */
public class Boletin2_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 0;
        int b100 = 0;
        int b20 = 0;
        int b5 = 0;
        int m1 = 0;
        
        total = Integer.parseInt(JOptionPane.showInputDialog("Cantidad total de dinero: "));
        
 
        if(total >= 100){
            b100 = total/100;
            total = total % 100;
        }
        if(total >= 20){
            b20 = total/20;
            total = total % 20;
        }
        if(total >= 5){
            b5 = total/5;
            total = total % 5;
        }
        if(total >= 1){
            m1 = total/1;
        }
        
        System.out.println("Tenemos " + b100 + " billetes de 100€");
        System.out.println("Tenemos " + b20 + " billetes de 20€");
        System.out.println("Tenemos " + b5 + " billetes de 5€");
        System.out.println("Tenemos " + m1 + " monedas de 1€");
    }
    
}
