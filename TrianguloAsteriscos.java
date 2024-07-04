package com.mycompany.ejercicio1;

public class TrianguloAsteriscos{
    public static void main(String[] args) {
        int altura = 7; // Altura total del rombo, debe ser un número impar
        
        int n = altura / 2; // La mitad de la altura, para calcular la parte superior e inferior
        int espacios = n; // Espacios iniciales para la parte superior
        int asteriscos = 1; // Asteriscos iniciales para la parte superior
        
        // Parte superior del rombo
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
        
        espacios = 1; // Espacios iniciales para la parte inferior
        asteriscos = altura - 2; // Asteriscos iniciales para la parte inferior
        
        // Parte inferior del rombo
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
