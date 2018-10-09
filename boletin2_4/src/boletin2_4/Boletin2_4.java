/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;






/**
 *
 * @author drodriguezguardiola
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int euros,cambio100,cambio20,cambio5,cambio1,resto;              
         
        System.out.println("tecle cantidas euro");
        euros=ler.nextInt();
        cambio100=euros/100;
        resto=euros%100;
        cambio20=resto/20;
        resto=resto%20;
        cambio5=resto/5;
        resto=resto%5;
        cambio1=resto/1;
        System.out.println("cambio billetes 100 = "+cambio100);
        System.out.println("cambio billetes 20 = "+cambio20);
        System.out.println("cambio billete 5 = "+cambio5);
        System.out.println("cambio monedas 1 = "+cambio1);
        
       
        
        
       
        
       
        
        
        // TODO code application logic here
    }
    
}
