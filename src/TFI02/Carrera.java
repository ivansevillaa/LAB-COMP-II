package TFI02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Carrera implements Informacion {
    private String nombre;
    private Set<Materia> coleccionMaterias;

    public Carrera(String nombre, Set<Materia>coleccionMaterias) {
        this.nombre = nombre;
        this.coleccionMaterias = coleccionMaterias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getColeccionMaterias() {
        return coleccionMaterias;
    }

    public void setColeccionMaterias(Set<Materia> coleccionMaterias) {
        this.coleccionMaterias = coleccionMaterias;
    }

    public void agregarMateria(Materia materia) {
        coleccionMaterias.add(materia);
        System.out.println("La materia " + materia.getNombre() + " fue agregada satisfactoriamente.");
    }

    public void eliminarMateria(String nombreMateria) {
        Iterator<Materia> iterador = coleccionMaterias.iterator();
        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println("La materia " + nombre + " fue eliminada satisfactoriamente.");
            } else {
                System.out.println("Hmm no encontramos la materia que queres eliminar");
            }
        }
    }

    public void encontrarMateria(String nombre) {
        Scanner sn = new Scanner(System.in);
        for (Materia materia : coleccionMaterias) {
            if(materia.getNombre().equals(nombre)) {
                System.out.println("La materia " + materia.getNombre() + " fue encontrada.");
                System.out.println("Desea eliminar la materia?");
                System.out.println("Si desea eliminar presione 's' o 'S', sino presione cualquier tecla");
                try {
                    String opcion = sn.next();
                    if (opcion.equals('s') || opcion.equals(('S'))) {
                        eliminarMateria(nombre);
                    }
                } catch(Exception e) {
                    System.out.println("Hmmm que raro, algo salió mal :/");
                }
            } else {
                System.out.println("Hmmm no encontramos la materia que buscaste");
            }
        }
    }

    @Override
    public int verCantidad() {
        int cantidad = 0;
        for (Materia materia : coleccionMaterias) {
            cantidad++;
        }
        return cantidad;
    }

    @Override
    public void listarContenidos() {
        System.out.println("LISTADO DE MATERIAS:");
        for (Materia materia : coleccionMaterias) {
            System.out.println(materia.toString());
        }
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", coleccionMaterias=" + coleccionMaterias +
                '}';
    }
}
