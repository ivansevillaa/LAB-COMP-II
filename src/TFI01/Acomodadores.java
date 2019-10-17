package TFI01;

public class Acomodadores extends Empleados implements ParaAcomodadores{
    private Salas sala;

    Acomodadores(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public Salas getSala() {
        return sala;
    }

    @Override
    public void setSala(Salas sala) {
        this.sala = sala;
    }

    @Override
    public String getTipo() {
        return "Acomodador";
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\nEdad: " + getEdad() + "\nTipo: " + this.getTipo() + "\nSala en la que esta: " + this.getSala();
    }
}
