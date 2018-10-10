/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        float b100,b20,b5,m1,euros;
        
        System.out.println("b100");
        b100=ler.nextFloat();
        System.out.println("b20");
        b20=ler.nextFloat();
        System.out.println("b5");
        b5=ler.nextFloat();
        System.out.println("m1");
        m1=ler.nextFloat();
        float cambio =(b100*100)+(b20*20)+(b5*5)+m1;
        System.out.println("total euros="+cambio);
                
        
        // TODO code application logic here
    }
    
}
