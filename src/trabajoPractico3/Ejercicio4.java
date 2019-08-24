package trabajoPractico3;

import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int [][] numeros = new int [3][3];
        int [] aux = new int [9];
        int posAux = 0;

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int)((Math.random() * 9) + 1);
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
        posAux = 0;
        System.out.println();
        System.out.println("Matriz ordenada");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = aux[posAux];
                posAux++;
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

    }
}
