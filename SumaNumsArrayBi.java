/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;
import java.util.Scanner;

public class SumaNumsArrayBi {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int filas = 3;
        int columnas = 3;
        int suma = 0;
        int arreglo [][] = new int[filas][columnas];
        
        // Llenar la matriz y calcular la suma
        for(int i = 0; i < filas; i++){
            for(int j = 0 ; j < columnas; j++){
                System.out.println("Ingresa un numero para la posicion [" + i + "][" + j + "]: ");
                arreglo[i][j] = scanner.nextInt();
                suma += arreglo[i][j];
            }
        }
        
        // Imprimir la matriz completa
        System.out.println("Matriz completa:");
        for(int i = 0; i < filas; i++){
            for(int j = 0 ; j < columnas; j++){
                System.out.print(arreglo[i][j] + "\t"); // \t para tabular los elementos
            }
            System.out.println(); // Salto de línea después de cada fila
        }
        
        System.out.println("Suma total de todos los numeros: " + suma);
    }
}

    

