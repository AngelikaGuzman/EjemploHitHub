/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Github {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner br=new Scanner (System.in);
        int num1;
        int num2;
        int suma;
        System.out.println("ingresa un numero ");
        num1 = br.nextInt();
       System.out.println("ingresa un numero ");
       num2 = br.nextInt();
       
       suma = num1 + num2; 
        
       System.out.println(suma);
       
        
    }
    
}
