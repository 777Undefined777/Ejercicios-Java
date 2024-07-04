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
public class MayorMenorArray {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos Numeros desea ingresar? : ");
        int filas = scanner.nextInt();
        int arreglo [] = new int[filas];
        for(int i = 0; i < arreglo.length; i ++){
            System.out.print("Ingrese un numerp : ");
            arreglo[i] = scanner.nextInt();
            
            
        }int maximo = arreglo[0];
        int minimo = arreglo[0];
        for(int i = 0 ; i  < arreglo.length; i++){
            if(arreglo[i] > maximo){
                maximo = arreglo[i];
                
            }if(arreglo[i] < minimo){
                minimo = arreglo[i];
            }
        }System.out.println("El maximo es " + maximo + "Y el minimo es : " +  minimo);
    }
}
