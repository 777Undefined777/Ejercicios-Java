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
public class RepeticionEnteroArray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[6];
        int Buscar_Numero;
        int cont = 0;
        for(int i = 0 ; i < arreglo.length; i++ ){
            System.out.println("ingresar Un numero: ");
            arreglo[i]  = scanner.nextInt();
            
        }
        System.out.println("Buscar un Numero : ");
        Buscar_Numero = scanner.nextInt();
        for(int i = 0; i<arreglo.length ; i++){
            if(arreglo[i] == Buscar_Numero){
                cont++;
                
                
            }
        }System.out.println("Las veces que se repite el numero"+Buscar_Numero+" Es: "+cont);
        
    }
    
}
