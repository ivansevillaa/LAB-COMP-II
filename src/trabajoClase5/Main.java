package trabajoClase5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        CuentaCorriente cr = new CuentaCorriente("Ivan", 25);

        do {
            System.out.println("Que desea hacer:");
            System.out.println("1. Ingresar dinero en su cuenta");
            System.out.println("2. Sacar dinero de su cuenta");
            System.out.println("3. Mirar el saldo de su cuenta");
            System.out.println("4. Mirar los datos de su cuenta");
            System.out.println("5. Hacer transferencia");
            switch (sn.nextInt()) {
                case 1:
                    System.out.println("Cuanto va a ingresar?");
                    cr.ingresarDinero(sn.nextInt());
                    break;
                case 2:
                    System.out.println("Cuanto dinero va a sacar");
                    cr.sacarDinero(sn.nextInt());
                    break;
                case 3:
                    System.out.println("Usted tiene en su cuenta: $" + cr.getSaldo());
                    break;
                case 4:
                    System.out.println(cr.mostrarDatos());
                    break;
                default:
                    System.out.println("La opcion ingresada no existe :(");
            }
            System.out.println("Si quiere salir presione 0. Si desea seguir presione cualquier numero");
        } while(sn.nextInt() != 0);
    }
}
