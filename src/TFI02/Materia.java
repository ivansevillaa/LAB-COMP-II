package TFI02;

import java.util.Iterator;
import java.util.Set;

public class Materia implements Informacion{
    private String nombre;
    private Profesor titular;
    private Set<Estudiante> coleccionEstudiantes;

    public Materia(String nombre, Set<Estudiante>coleccionEstudiantes) {
        this.nombre = nombre;
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void setTitular(Profesor titular) {
        this.titular = titular;
    }

    public Set<Estudiante> getColeccionEstudiantes() {
        return coleccionEstudiantes;
    }

    public void setColeccionEstudiantes(Set<Estudiante> coleccionEstudiantes) {
        this.coleccionEstudiantes = coleccionEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        coleccionEstudiantes.add(estudiante);
        System.out.println("El estudiante " + estudiante.toString() + " fue agregado satisfactoriamente.");
    }

    public void eliminarEstudiante(String nombre) {
        Iterator<Estudiante> iterador = coleccionEstudiantes.iterator();
        while(iterador.hasNext()) {
            String buscado = iterador.next().getNombre();
            if(buscado.equals(nombre)) {
                iterador.remove();
                System.out.println("El estudiante " + nombre + " fue eliminado satisfactoriamente.");
            } else {
                System.out.println("Hmm no encontramos el estudiante que queres eliminar");
            }
        }
    }

    public void modificarTitular(Profesor profesor) {
        this.titular = profesor;
        System.out.println("El profesor de la materia fue cambiado satisfactoriamente");
    }

    @Override
    public int verCantidad() {
        int cantidad = 0;
        for (Estudiante estudiante : coleccionEstudiantes) {
            cantidad++;
        }
        return cantidad;
    }

    @Override
    public void listarContenidos() {
        System.out.println("LISTADO DE CARRERAS:");
        for (Estudiante estudiante : coleccionEstudiantes) {
            System.out.println(estudiante.toString());
        }
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +
                ", coleccionEstudiantes=" + coleccionEstudiantes +
                '}';
    }
}
