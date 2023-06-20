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
public class AreaCir {
    
    Scanner teclado=new Scanner (System.in); 
     public void arearc(){
       
        System.out.println("Calcular el Area de un circulo ");
        System.out.println("Escribe el radio");
       float radio=teclado.nextFloat();
       
       double elevado=Math.pow(radio,2);
       double resultado=3.1416*elevado;
       
   
   System.out.println("El area de un rectángulo es :  "+ resultado);
   
   
   }
    
}
