package Clase_3;

import java.util.Arrays;
import java.util.Random;

public class ArraysBidimensionales {
    static void main(String[] args) {
        int[][] arrayBidimensional1 = new int[3][4];
        int[][] arrayBidimensional2 = {{1,4,5,2,3}, {23,5,1}, {93,24,54,3}};

        int tam1 = arrayBidimensional2.length;
        for(int i = 0; i < tam1; i++) {
            int tam2 = arrayBidimensional2[i].length;
            for(int e = 0; e < tam2; e++) {
                System.out.println(arrayBidimensional2[i][e]);
            }
        }

        Random random = new Random();
        //  llenar de valores aleatorios el arrayBidimensional1
        for (int i = 0; i < arrayBidimensional1.length ; i++) {
            for (int j = 0; j < arrayBidimensional1[i].length ; j++) {
                arrayBidimensional1[i][j] = random.nextInt(1,100);
            }
        }

        System.out.println(Arrays.deepToString(arrayBidimensional1));

        System.out.println("================================");
        for (int i = 0; i < arrayBidimensional1.length; i++) {
            for (int j = 0; j < arrayBidimensional1[i].length; j++) {
                System.out.print(arrayBidimensional1[i][j]+"  ");
            }
            System.out.println("\n");
        }
        System.out.println("================================");

    }
}
