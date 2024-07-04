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
public class ComparacionArray {
    public static void main(String args[]){
     Scanner scanner = new Scanner(System.in);
     int filas = 0;
      System.out.println("Ingresa la cantidad de filas de el arreglo: ");
      filas = scanner.nextInt();
      int arreglo [] = new int[filas];
      for(int i  = 0 ; i < arreglo.length; i++){
          System.out.println("Ingresa un numero: ");
          arreglo[i] = scanner.nextInt();
      }for(int i = 0; i < arreglo.length - 1; i++){
          if(arreglo[i] < arreglo[i + 1]){
              System.out.println("El número en la posicion " + i + " (" + arreglo[i] + ") es menor que el número en la posicion " + (i + 1) + " (" + arreglo[i + 1] + ").");
          }else{
              System.out.println("El número en la posicion " + i + " (" + arreglo[i] + ") NO es menor que el número en la posicion " + (i + 1) + " (" + arreglo[i + 1] + ").");
          }
      }
     
        }
    }
    

