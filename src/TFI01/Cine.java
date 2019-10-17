package TFI01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cine {

    public static void main(String[] args) {
        /*
             3. Falta
             11.
                c. Falta
        */
        Scanner sn = new Scanner(System.in);
        String nombre;
        int edad;
        String fila;
        int silla;
        Espectadores[] espectadores = new Espectadores[5];
        try {
            System.out.println("Vamos a cargar espectadores:");
            System.out.println("Ingrese nombre: ");
            nombre = sn.next();
            System.out.println("Ingrese edad:");
            edad = sn.nextInt();
            System.out.println("Ingrese fila:");
            fila = sn.next();
            System.out.println("Ingrese silla:");
            silla = sn.nextInt();
            espectadores[0] = new Espectadores(nombre, edad, fila, silla);
        } catch ( Exception e) {
            System.out.print("ERROR EN EL INGRESO DE DATOS");
            System.exit(0);
        }



        Salas sala01 = new Salas(3, "Sala 01");
        sala01.setPelicula("Jocker");
        sala01.setEspectadores(espectadores);
        System.out.println("Los espectadores que se encuentran en la sala son: ");
        System.out.println(sala01.getEspectadores());

        System.out.println("Vamos a cargar acomodadores:");
        System.out.println("Ingrese su nombre:");
        nombre = sn.next();
        System.out.println("Ingrese su edad");
        edad = sn.nextInt();

        Acomodadores acomodador = new Acomodadores(nombre, edad);
        acomodador.setSala(sala01);
        acomodador.setSueldo(50000);
        System.out.println("Los datos del acomodador son:");
        System.out.println(acomodador.toString());

        System.out.println("Vamos a cargar empleados:");
        System.out.println("Ingrese su nombre:");
        nombre = sn.next();
        System.out.println("Ingrese su edad");
        edad = sn.nextInt();

        Empleados empleado = new Empleados(nombre, edad);
        empleado.toString();
    }
}
