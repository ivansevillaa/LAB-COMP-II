package tp8;

import java.util.Scanner;

public class Menu {

    public void desplegarMenu() {
        int opcionElegida = 0;
        do {
            System.out.println("1. Crear moto o Auto");
            System.out.println("2. Listar motos y autos creados");
            System.out.println("3. Cerrar programa");
            Scanner sn = new Scanner(System.in);
            opcionElegida = sn.nextInt();
            switch (opcionElegida) {
                case 1:
                    crearVehiculo();
                    break;
                case 2:
                    System.out.println("listar xd");
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Esa opcion no existe. Volve a intentar");
            }
        } while(opcionElegida != 3);
    }

    public void crearVehiculo() {
        Scanner sn = new Scanner(System.in);
        System.out.println("1. Crear auto");
        System.out.println("2. Crear moto");
        switch (sn.nextInt()) {
            case 1:
                System.out.println("Vas a crear un auto");
                break;
            case 2:
                System.out.println("Vas a crear una moto");
                break;
            default:
                System.out.println("No existe esa opcion. Lo 100to");
        }
    }
}
