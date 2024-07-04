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
public class TablasMulti {
    public static void main(String args[]){
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la tabla del: ");
        numero = scanner.nextInt();
        
        for(int i = 1 ; i <= 10; i++){
            int tb = numero * i;
            System.out.println("Tabla del : "+ numero + " x " + i + " = "+ tb);
            
            
        } 
        scanner.close();
        
        
        
    }
    
}
