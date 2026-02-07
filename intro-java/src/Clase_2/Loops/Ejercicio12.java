package Clase_2.Loops;

import java.util.Scanner;

public class Ejercicio12 {
    static void main(String[] args) {
        //  Crea un programa que cuente cuántas veces aparece una letra específica en una cadena.
        String frase = "Java es un lenguaje de programacion";

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra a buscar...");
        char a = sc.next().charAt(0);
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == a){
                contador++;
            }
        }
        System.out.println("Cantidad de veces encontrada: "+contador);
        //   mensaje de prueba para detectar el cambio en git
    }
}