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
public class MultiploArray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int filas = 5;
        int arreglo[]  = new int[filas];
        int num_multi;
        
        for(int i = 0 ; i < arreglo.length; i++){
            System.out.println("Ingresa un numero : " + (i+1) + " : ");
            arreglo[i] = scanner.nextInt();
            
        }System.out.println("Cual es el numero al cual quieres encontrar si hay numeros : ");
        num_multi = scanner.nextInt();
        System.out.println("Los múltiplos de " + num_multi + " en el arreglo Es :");
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] % num_multi == 0){
                System.out.println(arreglo[i]);
            }
            
            
        }
    }
    
}
