/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author jorge
 */


public class Evaluacion{
    public static void main(String[] args) {
        int altura = 5; 
        
        int n = altura / 2; 
        int espacios = n; 
        int asteriscos = 1; 
        
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("* ");
            }
            System.out.println();
            espacios--;
            asteriscos += 2;
        }
        
        espacios = 1; 
        asteriscos = altura - 2; 
        
        
        for (int i = n-1; i >= 0; i--) {
            for (int j = 0; j < espacios; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("* ");
            }
            System.out.println();
            espacios++;
            asteriscos -= 2;
        }
    }
}
