package trabajoPractico3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int [][] numeros = new int [3][3];
        int [] aux = new int [9];
        int posAux = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Ingrese un numero: ");
                numeros[i][j] = sn.nextInt();
            }
        }
        System.out.println("Matriz desordenada");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                aux[posAux] = numeros[i][j];
                posAux++;
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }


        Arrays.sort(aux);
        System.out.println();
        System.out.println("Matriz ordenada");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = aux[posAux - 1];
                posAux--;
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

    }
}
