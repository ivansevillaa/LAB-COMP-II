package trabajoPractico2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        int numeros [] = new int [10];

        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un numero: ");
            numeros[i] = sn.nextInt();
            if (numeros[i] > 0) positivos++;
                else if (numeros[i] < 0) negativos++;
                    else ceros++;
        }

        System.out.println("Hay " + positivos + " numeros positivos en el array.");
        System.out.println("Hay " + negativos + " numeros negativos en el array.");
        System.out.println("Hay " + ceros + " ceros en el array");
    }
}
