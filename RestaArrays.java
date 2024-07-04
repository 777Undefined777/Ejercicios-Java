/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class RestaArrays {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[2];
        int resta = 0;
        
        for(int i  = 0 ;  i < arreglo.length; i++){
            System.out.println("Ingresa un numero");
            arreglo[i] = scanner.nextInt();
            resta = arreglo[i] - resta;
           
            
        }
        
        int resta_Def = Math.abs(resta);
        System.out.println(resta_Def);// esto lo pasa de negativo a positivo
        
        //para que no aparezca en negativo
        
        
       
        
        
        
        
       
        
        
        
    }
    
}
