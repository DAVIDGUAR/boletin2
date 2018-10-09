/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;



/**
 *
 * @author drodriguezguardiola
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        float gradosCentrigrados;
                
        System.out.println("tecle grados");
        gradosCentrigrados=ler.nextFloat();
        float gradosFahrenheit=(gradosCentrigrados*9/5)+32f;
        System.out.println("grados Fahernheit = "+gradosFahrenheit);
        System.out.println("tecle grados");
        float gradosKelvin=(gradosCentrigrados+273.15f);
        System.out.println("grados Kelvin = "+gradosKelvin);
        
        
        
        
        
        // TODO code application logic here
    }
    
}
