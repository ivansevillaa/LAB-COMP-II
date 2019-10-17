package TFI01;

public class Empleados extends Personas {
    private double sueldo;

    public Empleados(String nombre, int edad) {
        super(nombre, edad);
    }

    public void setSueldo(double sueldo) {
        if (sueldo > 0) {
            this.sueldo = sueldo;
        } else {
            System.out.println("Tenes que pagarle mas de $0");
        }

    }

    @Override
    public String getTipo() {
        return "Empleado";
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nEdad: " + getEdad() + "Tipo: " + this.getTipo() + "\nSueldo: " + this.sueldo;
    }
}
