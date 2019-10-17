package TFI01;

import java.util.Arrays;

public class Salas {
    private int capacidad;
    private String pelicula;
    private String nombre;
    private Espectadores[] espectadores;

    public Salas(int capacidad, String nombre) {
        this.capacidad = capacidad;
        this.nombre = nombre;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setEspectadores(Espectadores[] espectadores) {
        this.espectadores = espectadores;

    }

    public String getEspectadores() {
        return Arrays.toString(espectadores);
    }

    @Override
    public String toString() {
        return "Salas{" +
                "capacidad=" + capacidad +
                ", pelicula='" + pelicula + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
