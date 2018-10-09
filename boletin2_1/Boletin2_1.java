/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
           
        
        System.out.println("tecle precio tarifa");
        float precioTarifa=ler.nextFloat();
        System.out.println("tecle precio pagado");
        float precioPagado=ler.nextFloat();
        float porcentaje = (precioTarifa-precioPagado)/precioPagado*100;
        System.out.println("porcentaje = "+porcentaje +" %");
        
        // TODO code application logic here
    }
    
}
