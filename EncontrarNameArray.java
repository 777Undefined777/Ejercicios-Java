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
public class EncontrarNameArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Encontrar_Nombre ;
        String arreglo[] = new String[5];  
        boolean encontrado = false;
        
        for(int i = 0 ; i < arreglo.length; i++){
            System.out.print("Ingresa Un nombre: ");
            arreglo[i] = scanner.next();
            
        }
        System.out.print("Buscar Nombre : ");
        Encontrar_Nombre = scanner.next();
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i].equals(Encontrar_Nombre)){
                encontrado = true;
                System.out.println("El nombre fue encontrado con exito en la posicion " + i + " Y el nombre es " + Encontrar_Nombre);
                break;
            }
        }
        
        
        
        
    }
    
}
