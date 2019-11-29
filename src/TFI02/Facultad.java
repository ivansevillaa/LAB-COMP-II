package TFI02;

import java.util.Iterator;
import java.util.Set;

public class Facultad implements Informacion {
    private String nombre;
    private Set<Carrera> coleccionCarreras;

    public Facultad(String nombre, Set<Carrera>coleccionCarreras) {
        this.nombre = nombre;
        this.coleccionCarreras = coleccionCarreras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Carrera> getColeccionCarreras() {
        return coleccionCarreras;
    }

    public void setColeccionCarreras(Set<Carrera> coleccionCarreras) {
        this.coleccionCarreras = coleccionCarreras;
    }

    public void agregarCarrera(Carrera carrera) {
        coleccionCarreras.add(carrera);
        System.out.println("La carrera " + carrera.getNombre() + " fue agregada satisfactoriamente.");
    }

    public void eliminarCarrera(String nombre) {
        Iterator<Carrera> iterador = coleccionCarreras.iterator();
        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println("La carrera " + nombre + " fue eliminada satisfactoriamente.");
            } else {
                System.out.println("Hmm no encontramos la carrera que queres eliminar");
            }
        }
    }

    @Override
    public int verCantidad() {
        int cantidad = 0;
        for (Carrera carrera : coleccionCarreras) {
            cantidad++;
        }
        return cantidad;
    }

    @Override
    public void listarContenidos() {
        System.out.println("LISTADO DE CARRERAS:");
        for (Carrera carrera : coleccionCarreras) {
            System.out.println(carrera.toString());
        }
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "nombre='" + nombre + '\'' +
                ", coleccionCarreras=" + coleccionCarreras +
                '}';
    }
}
