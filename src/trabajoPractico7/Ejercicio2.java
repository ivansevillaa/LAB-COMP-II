package trabajoPractico7;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        askForNumber();
        System.out.println("Fin del programa");
    }

    public static void askForNumber() throws outOfRange{
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 100");
        int number = sn.nextInt();
        if(number < 1 || number > 100) {
            outOfRange mio = new outOfRange("El numero ingresado está fuera rango");
            throw mio;
        }
    }
}

class outOfRange extends RuntimeException {
    public outOfRange() {

    }

    public outOfRange(String message) {
        super(message);
    }
}