package Clase_2.Loops;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio18 {
    static void main(String[] args) {
        //  Dada una matriz de n x m elementos. Debes de encontrar el valor máximo de la matriz.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas...");
        int filas = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas...");
        int columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];
        int inicial = 1;

        System.out.println("Ingrese el número a buscar...");
        int numBuscado = sc.nextInt();

        System.out.println("Ordenar por filas o columnas? Ingrese F o C...");
        char filaColumna = sc.next().charAt(0);

        if (filaColumna=='F'){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = inicial;
                    inicial++;
                }
            }
        }else {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int i = 0; i < matriz.length; i++) {
                    matriz[i][j] = inicial;
                    inicial++;
                }
            }
        }


        System.out.println(matriz);
        System.out.println(Arrays.toString(matriz));
        System.out.println(Arrays.deepToString(matriz));

        int posicion = 0;
        int vuelta = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==numBuscado){
                    posicion = vuelta;
                }
                vuelta++;
            }
        }
        System.out.println("El número se encontró en la posición "+posicion);
    }
}
