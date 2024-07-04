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
public class EncontrarEnteroArrays {
    
    public static void main(String[] args) {
        int arreglos[] = new int[7];
        Scanner scanner  = new Scanner(System.in);
        boolean encontrado = false;
        
        for(int i  = 0 ; i < arreglos.length; i++){
            System.out.println("Ingresar Un numero: ");
            arreglos[i] = scanner.nextInt();
            
        }
        System.out.println("Buscar un numero : ");
        int SearchNum = scanner.nextInt();
        
        
        for(int i = 0; i < arreglos.length; i++){
            if(SearchNum == arreglos[i]){
                System.out.println("el numero encontrado es " + arreglos[i]);
                encontrado = true;
                
            }else{
                System.out.println("Numero no encontrado");
            }
            
        }
        
        
        
    }
    
}
