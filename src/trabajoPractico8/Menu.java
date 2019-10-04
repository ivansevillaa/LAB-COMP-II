package trabajoPractico8;

import java.util.Scanner;

public class Menu {
    private Vehiculo[] vehiculos;

    public void desplegarMenu() {
        int opcionElegida = 0;
        do {
            System.out.println("1. Crear vehiculos");
            System.out.println("2. Listar motos y autos creados");
            System.out.println("3. Cerrar programa");
            Scanner sn = new Scanner(System.in);
            opcionElegida = sn.nextInt();
            switch (opcionElegida) {
                case 1:
                    crearVehiculo();
                    break;
                case 2:
                    mostrarInformacion();
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Esa opcion no existe. Volve a intentar");
            }
        } while(opcionElegida != 3);
    }

    private void crearVehiculo() {
        Scanner sn = new Scanner(System.in);
        System.out.println("Cuantos vehiculos queres crear?");
        int cantidadVehiculos = sn.nextInt();
        vehiculos = new Vehiculo[cantidadVehiculos];
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println("1. Crear auto");
            System.out.println("2. Crear moto");
            switch (sn.nextInt()) {
                case 1:
                    System.out.println("Ingrese velocidad inicial");
                    vehiculos[i] = new Coche(sn.nextInt());
                    break;
                case 2:
                    System.out.println("Ingrese velocidad inicial");
                    vehiculos[i] = new Moto(sn.nextInt());
                    break;
                default:
                    i--;
                    System.out.println("No existe esa opcion. Lo 100to");
            }
        }
    }

    private void mostrarInformacion() {
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i].toString());
        }
    }
}
