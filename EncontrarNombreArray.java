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
public class EncontrarNombreArray {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean encontrado = false;
       String Buscar_Nombre;
       
       String arreglo[] = new String[5];
       
       for(int i = 0; i < arreglo.length ; i++){
           System.out.println("Ingresa un Nombre: ");
            arreglo[i]= scanner.next();
            
           
       }
       System.out.print("Buscar Nombre: ");
           Buscar_Nombre = scanner.next();
       for(int i = 0; i < arreglo.length; i++){
           
           
           if(arreglo[i].equals(Buscar_Nombre)){
               encontrado = true;
               System.out.println("Nombre encontrado " + Buscar_Nombre+ "en la posicion: " + i);
               
               
           }
           
       }
      
        
    }
    
    
}
