/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author drodriguezguardiola
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        double sueldo,kilometraje,ventas,dietas,sueldoBruto;
        System.out.println("tecle sueldo");
        sueldo=ler.nextFloat();
        System.out.println("tecle ventas");
        ventas=ler.nextFloat();      
        System.out.println("tecle kilometraje");
        kilometraje=ler.nextFloat();
        System.out.println("tecle dietas");
        dietas=ler.nextFloat();
        sueldoBruto=sueldo+((ventas*5)/100)+(kilometraje*2)+(dietas*30);
        System.out.println("sueldoBruto = "+ sueldoBruto);
        double sueldoLiquidoDescuento=((sueldoBruto*0.18)+36);
        System.out.println("sueldoLiquidoDescuento = "+ sueldoLiquidoDescuento);
        double sueldoLiquido= sueldoBruto-sueldoLiquidoDescuento;
        System.out.println("sueldoLiquido = "+ sueldoLiquido);
        
        
       
                
        
        // TODO code application logic here
    }
    
}
