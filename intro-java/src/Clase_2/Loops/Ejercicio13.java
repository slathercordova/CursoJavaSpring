package Clase_2.Loops;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio13 {
    static void main(String[] args) {
        //  Crea un programa que imprima la tabla de multiplicar del 1 al 10.
        int[][] lista1 = new int[10][12];

        for (int i = 0; i < lista1.length; i++) {
            for (int j = 0; j < lista1[i].length ; j++) {
                lista1[i][j] = j+1;
            }
        }

        System.out.println(Arrays.toString(lista1));
        System.out.println(Arrays.deepToString(lista1));


        for (int i = 0; i < lista1.length; i++) {
            int vuelta = i+1;
            System.out.println("Tabla de multiplicación del "+vuelta);
            for (int j = 0; j < lista1[i].length; j++) {
                System.out.println(vuelta+"x"+lista1[i][j]+"="+vuelta*lista1[i][j]);
            }
            System.out.print("\n");
        }
    }
}
