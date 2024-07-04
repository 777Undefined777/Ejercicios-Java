/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        int arreglo[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        
       
        
        for(int i  = 0; i < arreglo.length ; i++){
            System.out.println("Ingresa un numero para almacenar en esta posicion: " +i+ ": " );
            arreglo[i] = scanner.nextInt();
            
        }
        System.out.println("Aqui me muestra la posicion y el valor");
        
        for(int i = 0; i < arreglo.length; i++){
            System.out.println("La posicion en el arreglo es : "+ i+ " el valor es : "+ arreglo[i]);
        }
        
        
        
        

        
        
        
       
        
        
        
    }
}
