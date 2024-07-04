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
public class BuscarNumeroArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[5];
        int buscar_num;
        boolean encontrado = false;
        
        for(int i = 0 ; i < arreglo.length; i++){
            System.out.println("Ingresa un Numero : ");
            arreglo[i] = scanner.nextInt();
            
                    
        }System.out.println("Buscar Numero : ");
        buscar_num = scanner.nextInt();
        
        for(int i = 0 ; i < arreglo.length; i++){
            if(arreglo[i] == buscar_num){
                
                encontrado = true;
                
                System.out.println("El numero encontrado fue : "+ buscar_num + " Y la posicion en la cual se encontro es : " + i);
                
                
                
            }else{
                System.out.println("No Se ha encontrado el numero en el Arreglo");
                
               
            }
            
            
        }
                
    }
    
}
