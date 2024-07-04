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
public class RepeticionNombresArray {
    public static void main(String args []){
        Scanner scanner = new  Scanner(System.in);
        int cont = 0;
        boolean encontrar = false;
        String Buscar_Nombre;
       
        String arreglo[] = new String[5];
        
        for(int i = 0; i<arreglo.length; i++){
            System.out.println("Igresa un nombre : ");
            arreglo[i] = scanner.next();
        }System.out.println("Que nombre quieres saber si se repite : ");
        Buscar_Nombre = scanner.next();
        
        
        for(int i = 0; i < arreglo.length ; i++){
            if(arreglo[i].equals(Buscar_Nombre)){
                cont++;
                
            }
        }System.out.println("El nombre encontrado fue " + Buscar_Nombre + " Y la cantidad de veces que se repite son "+ cont);
        
    }
    
}
