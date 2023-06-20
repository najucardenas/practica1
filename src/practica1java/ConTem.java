/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1java;

import java.util.Scanner;

/**
 *
 * @author juan
 */
public class ConTem {
    Scanner teclado=new Scanner (System.in); 
    
   public void comTem1(){
       
        System.out.println("conversión de temperatura");
        System.out.println("Escribe la temperatura en centigrados");
       float tem=teclado.nextFloat();
       
       float resultado=(tem*9/5)+32;
       
   
   System.out.println("El resultado de  centigrados a Fahrenheit:  "+ resultado);
   
   
   }
    
    
}
