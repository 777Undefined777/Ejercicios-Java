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
public class NameYmas {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int filas = 0;
        int columnas = 0;
        String Buscar_name;
        System.out.print("Ingresa el numero de filas");
        filas = scanner.nextInt();
        System.out.println("Ingresa la cantidad de columnas");
        columnas  = scanner.nextInt();
        
        String arreglo[][] = new String[filas][columnas];
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo.length; j++){
                System.out.println("Ingresa un Nombre para la posicion [" + i + "][" + j + "]: ");
                arreglo[i][j] = scanner.next();
                
            }
        }System.out.println("Buscar Nombre en el arreeglo: ");
        Buscar_name = scanner.next();
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo.length; j++){
                if(arreglo[i][j].equals(Buscar_name)){
                     System.out.println("Nombre encontrado = " + Buscar_name + "Encontrado en la posicion [" + i + "][" + j + "]: ");
                }else{
                    System.out.println("Nombre no encontrado");
                }
                
            }
        }
        
                
      
    }
    
}
