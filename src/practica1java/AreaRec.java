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
public class AreaRec {
      Scanner teclado=new Scanner (System.in); 
    
   public void arearc(){
       
        System.out.println("Calcular el Area de un rectangulo ");
        System.out.println("Escribe el largo");
       float largo=teclado.nextFloat();
         System.out.println("Escribe el ancho");
       float ancho=teclado.nextFloat();
       
       float resultado=largo*ancho;
       
   
   System.out.println("El area de un rectángulo es :  "+ resultado);
   
   
   }
    
    
}
