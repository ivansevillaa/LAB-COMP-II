package trabajoPractico1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.println("Ingrese su nobre");
        nombre = sn.nextLine();

        do {
            System.out.println("Ingrese su edad ");
            edad = sn.nextInt();
            if(edad != 0) {
                if(edad > 17) System.out.println(nombre + " es mayor de edad");
                else System.out.println(nombre + " es menor de edad");
            }
        } while(edad != 0);

        System.out.println("fin.");
    }
}
