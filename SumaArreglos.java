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
public class SumaArreglos {
    public static void main(String[] args) {
        int arreglos[] = new int[5];
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        
        for(int i  = 0 ; i < arreglos.length; i++){
            
            System.out.println("Ingresa un numero : ");
            arreglos[i] = scanner.nextInt();
            
            
            suma += arreglos[i];
            
            
        
        }
        System.out.println("Suma total de todos los numeros" + suma);
        
        
       
        
        
        
        
    }
    
    
    
    
}
