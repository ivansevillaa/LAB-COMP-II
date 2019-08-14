package trabajoPractico2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        float numeros [] = new float [10];
        float sumaTotalPosicionPar = 0, contPosicionesPares = 0;
        float media = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un numero: ");
            numeros[i] = sn.nextInt();
            if (i % 2 == 0) {
                sumaTotalPosicionPar += numeros[i];
                contPosicionesPares++;
            }

        }

        media = sumaTotalPosicionPar / contPosicionesPares;

        System.out.println("La media de los numeros introducidas en las posiciones pares del array es de " + media);
    }
}
