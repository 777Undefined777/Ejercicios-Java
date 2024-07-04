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
public class PromedioArrayNum {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double arreglo[] = new double[2];
        double promedio = 0.0;
        double suma = 0;
        int count = 0;
        
        for(int i = 0; i < arreglo.length ; i++){
            count++;
            System.out.println("Ingrese nota numero° : " + count + ": ");
            arreglo[i] = scanner.nextDouble();
            suma += arreglo[i];
            
        }promedio = suma / arreglo.length;
        System.out.println("El promedio de las notas es " + promedio);
        
    }
    
}
