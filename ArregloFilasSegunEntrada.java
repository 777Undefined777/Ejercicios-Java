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
public class ArregloFilasSegunEntrada {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int EntradaUser = 0;
        int suma = 0;
        System.out.println("Introduce la cantidad de numeros que quieres almacenar : ");
        EntradaUser = scanner.nextInt();
        int arreglo[] = new int[EntradaUser];
        for(int i = 0 ; i < arreglo.length; i++){
            System.out.println("Ingresa el numero que quieres almacenar : ");
            arreglo[i] = scanner.nextInt();
            
        }for(int i = 0; i < arreglo.length; i++){
            System.out.println("Numeros almacenados : "+ arreglo[i]);
            suma += arreglo[i];
            
        }System.out.println("La suma total de los numeros dentro de el arreglo es : " + suma );
        
        
        
        
    }
    
}
