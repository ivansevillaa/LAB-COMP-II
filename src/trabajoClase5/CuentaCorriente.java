package trabajoClase5;

public class CuentaCorriente {
    private String nombreDelTitular;
    private double saldo;
    private long nroCuenta;

    public CuentaCorriente(String nombreDelTitular, double saldo) {
        this.saldo = saldo;
        this.nombreDelTitular = nombreDelTitular;
        this.nroCuenta = (long)(Math.random() * 100) + 10;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void ingresarDinero(double dinero) {
        if (dinero > 0) {
            this.saldo += dinero;
            System.out.println("Usted ahora tiene en su cuenta: $" + this.saldo);
        } else {
            System.out.println("No podes menos de $0.1");
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
}
