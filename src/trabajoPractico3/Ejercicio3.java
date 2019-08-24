package trabajoPractico3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        String [][] personas = new String [3][3];

        for (int i = 0; i < personas.length; i++) {
            System.out.println("Ingresar nombre: ");
            personas[i][0] = sn.next();
            System.out.println("Ingresar DNI: ");
            personas[i][1] = sn.next();
            System.out.println("Ingresar edad: ");
            personas[i][2] = sn.next();
        }

        System.out.println("-------------------");
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println(personas[i][j] + " ");
            }
            System.out.println("-------------------");
        }
    }
}
