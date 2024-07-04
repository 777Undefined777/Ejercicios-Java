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
public class Ejercicio44 {
    public static void main(String args[]){
        int suma = 0; 
        int filas = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el numero de filas : ");
        filas = scanner.nextInt();
        int arreglo[] = new int[filas];
        for(int i = 0 ; i < arreglo.length; i++){
            System.out.println("Ingresa u numero");
            arreglo[i] = scanner.nextInt();
            
        }for(int i  = 0 ; i < arreglo.length; i ++){
            suma += arreglo[i];
            
        }System.out.println("La suma total de los numeros es " + suma);
        
    }
    
}
