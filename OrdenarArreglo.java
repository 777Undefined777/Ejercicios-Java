/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class OrdenarArreglo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("iNGRESA LA CANTIDAD DE FILAS : ");
        int filas = scanner.nextInt();
        int arreglo[] = new int[filas];
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingresa un numero");
            arreglo[i] = scanner.nextInt();
        }Arrays.sort(arreglo);
        System.out.println("Arreglo en orden ");
        System.out.println(Arrays.toString(arreglo));
    }
    
}
