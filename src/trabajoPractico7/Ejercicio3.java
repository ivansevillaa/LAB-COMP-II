package trabajoPractico7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero = 0;
        boolean error = false;

        do {
            error = false;
            Scanner sn = new Scanner(System.in);
            System.out.println("Ingrese un número");
            try {
                numero = sn.nextInt();
                if (numero % 2 == 0) System.out.println("El número ingresado es par");
                else System.out.println("El número ingresado es impar");
            } catch (InputMismatchException e) {
                System.out.println("El valor ingresado no es númerico. Intenta otra vez.");
                error = true;
            }
        } while(error);
    }
}
