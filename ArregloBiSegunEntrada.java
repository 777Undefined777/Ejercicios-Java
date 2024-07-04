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
public class ArregloBiSegunEntrada {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        int suma = 0;
        System.out.println("Ingresa Cuantoas filas desea añadir");
        
        filas = scanner.nextInt();
        
        System.out.println("Ingresa el Numero de columnas : ");
        columnas = scanner.nextInt();
        
        int arreglo[][] = new int[filas][columnas];
        
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j <arreglo.length; j++){
                System.out.println("Ingresa un numero para la posicion [" + i + "][" + j + "]: ");
                arreglo[i][j] = scanner.nextInt();
                suma += arreglo[i][j];
                
                
            }
            
        }
        System.out.println("Este es el arreglo : ");
        for(int i  = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo.length; j++){
                
                System.out.print(arreglo[i][j] + "\t");
                
            }
        }
        
        System.out.print("Total de la suma : " + suma);
    }
}
