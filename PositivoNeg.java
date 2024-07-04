/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author jorge
 */
import java.util.Scanner;
public class PositivoNeg {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero de filas : ");
        int filas = scanner.nextInt();
        int arreglo[] = new int[filas];
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("Ingresa un numero : ");
            arreglo[i] = scanner.nextInt();
                    
        }for(int i = 0 ; i < arreglo.length; i++){
            if(arreglo[i] < 0){
                System.out.println("Numeros negativos : "+arreglo[i]);
            }else{
                System.out.println("No hay numeros negativos");
            }
            
        }
        
        
    }
    
    
}
