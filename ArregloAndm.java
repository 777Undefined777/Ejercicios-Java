/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;
import java.util.Scanner;

public class ArregloAndm {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        
        int suma = 0;
        
        int arreglo[] = new int[100];
        
        System.out.println("Este es el arreglo:");
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1; // Llenar el arreglo con los números del 1 al 100
            suma += arreglo[i]; // Sumar cada número al total
            System.out.println(arreglo[i]);
        }
        
        System.out.println("La suma de los números del 1 al 100 es: " + suma);
    }
}
