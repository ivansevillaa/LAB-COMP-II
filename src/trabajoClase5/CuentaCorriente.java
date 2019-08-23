package trabajoClase5;

import java.util.Scanner;

public class CuentaCorriente {
    private String nombreDelTitular;
    private double saldo;
    private int nroCuenta;

    public CuentaCorriente () {

    }

    public CuentaCorriente(String nombreDelTitular, double saldo, int nroCuenta) {
        this.saldo = saldo;
        this.nombreDelTitular = nombreDelTitular;
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void ingresarDinero(double dinero) {
        if (dinero > 0) {
            this.saldo += dinero;
            System.out.println("Usted ahora tiene en su cuenta: $" + this.saldo);
        } else {
            System.out.println("No podes sacar menos de $0.1");
        }

    }

    public void sacarDinero(double dinero) {
        if (dinero > 0 && dinero <= this.saldo) {
            this.saldo -= dinero;
            System.out.println("Usted ha retirado $" + dinero);
            System.out.println("Usted ahora tiene en su cuenta: $" + this.saldo);
        } else if(dinero <= 0) {
            System.out.println("No podes retirar menos de $0.1");
        } else {
            System.out.println("No podes retirar mas plata de la que tenes en la cuenta");
        }
    }

    public String mostrarDatos() {
        return "Datos de la cuenta" +
                "\nNombre del titular: " + this.nombreDelTitular +
                "\nSaldo: $" + this.saldo + "" +
                "\nNumero de cuenta:" + this.nroCuenta;
    }

    public static void TransferirDinero(CuentaCorriente origen, CuentaCorriente destino, double dinero) {
        origen.sacarDinero(dinero);
        destino.ingresarDinero(dinero);
    }

    public static void CargarCuentas(CuentaCorriente[] cuentas) {
        Scanner sn = new Scanner(System.in);
        for (int i=0; i<cuentas.length; i++) {
            System.out.println("Nombre: ");
            String nombre = sn.next();
            System.out.println("Saldo inicial: ");
            double saldo = sn.nextDouble();
            System.out.println("Numero de cuenta: ");
            int nroCuenta = sn.nextInt();
            CuentaCorriente cuenta = new CuentaCorriente(nombre, saldo, nroCuenta);
            cuentas[i] = cuenta;
        }
    }

    public static void ListarCuentas(CuentaCorriente[] cuentas) {
        for (CuentaCorriente cuenta:cuentas) {
            System.out.println("Nombre: " + cuenta.nombreDelTitular);
            System.out.println("Saldo inicial: $" + cuenta.saldo);
            System.out.println("Numero de cuenta: " + cuenta.nroCuenta);
        }
    }

    public static CuentaCorriente BuscarCuenta(CuentaCorriente[] cuentas, int nroCuenta) {
        CuentaCorriente cuentaSalida = new CuentaCorriente();
        for (CuentaCorriente cuenta:cuentas) {
            if(nroCuenta == cuenta.nroCuenta) {
                cuentaSalida = cuenta;
                break;
            }
        }
        return cuentaSalida;
    }
}
