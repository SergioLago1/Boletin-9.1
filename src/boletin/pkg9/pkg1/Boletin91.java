/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.pkg1;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin91 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
    
     Scanner numeros = new Scanner(System.in);
        
             
     int pos = 0, neg = 0, cero = 0; //contadores
        int i;
        int numero;
      
     for (i = 0; i <10 ; i++) {
          
         System.out.println("Introduce el numero: "+(i+1)+" : ");
            
          numero = numeros.nextInt();
            
            if (numero>0){
                pos++;}
            if (numero<0){ 
                neg++;}
            if (numero==0){
                cero++;}
     }  
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }
}