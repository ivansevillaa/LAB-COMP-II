package TP5;

public class Estudiante {

    private String nombre; //nombre del estudiante
    private int nroEstudiante; //numero de estudiante (es asignado por la facultad)
    private double notaMedia; //nota media del estudiante

    public Estudiante (String nombre, double notaMedia) { //constructor

        this.setNombre(nombre);
        this.setNotaMedia(notaMedia);
    }

    //gets y sets de todos los atributos de la clase

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroEstudiante() {
        return nroEstudiante;
    }

    public void setNroEstudiante(int nroEstudiante) {
        this.nroEstudiante = nroEstudiante;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }


    public void asistirFacultad (Facultad facu) { //metodo para saber si el estudiante asiste a una facultad

        boolean asiste = false;

        for (int i = 0; i < facu.getEstudiantes().length; i++) { //se recorre el arreglo de estudiantes contenido en el objeto facultad
            if (facu.getEstudiantes()[i].getNombre() == this.nombre) {
                asiste = true; //se vuelve verdadero si encuentra al estudiante
            }
        }

            if (asiste) {
                //si es verdadero, significa que asiste a esa facultad e imprime el siguente mensaje
                System.out.println("El estudiante " + this.getNombre() + " asiste a la facultad " + facu.getNombreFacultad());
            }
            else {
                //si es falso, significa que no asiste a esa facultad
                System.out.println("El estudiante "+this.getNombre()+" no asiste a la facultad "+facu.getNombreFacultad());
            }
        }

}
