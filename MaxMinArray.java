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




//encontrar el numero minumo y maximo almacenado en un arreglo
public class MaxMinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ArregloAlacenar[] = new int[5];
        
        System.out.print("Ingrese cinco numeros :  ");
        for(int i = 0; i < ArregloAlacenar.length; i++){
            System.out.println("Ingrese un numero: ");
            ArregloAlacenar[i] = scanner.nextInt();
            
            
        }
        int max = ArregloAlacenar[0];
        int min = ArregloAlacenar[0];
        for(int i = 0; i < ArregloAlacenar.length; i++){
            if(ArregloAlacenar[i] > max){
                max = ArregloAlacenar[i];
            }if(ArregloAlacenar[i] < min){
                min = ArregloAlacenar[i];
            }
            
            
        }System.out.println("el numero mayor es " + max +"el numero menor es : "+ min);
        
       
    }
    
    
}
