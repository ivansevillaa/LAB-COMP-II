package TP5;


public class Facultad {

    private String nombreFacultad; //Nombre de la facultad
    private int cantMaximaEstudiantes; //Cantidad de maxima de estudiantes (vacantes)
    private Estudiante[] estudiantes; //Arreglo de clase Estudiante para almacenar a los objetos de clase Estudiante que asisten a la facultad
    private static int nroEstudiante; //Numero de estudiante que es asignado cuando se agrega un estudiante
    private int cantidadEstudiantes; //Cantidad de estudiantes que asisten a la facultad

    public Facultad (String nombreFacultad, int cantMaximaEstudiantes) { //Constructor

        this.cantMaximaEstudiantes = cantMaximaEstudiantes;
        this.nombreFacultad = nombreFacultad;
        estudiantes = new Estudiante[this.cantMaximaEstudiantes]; //El tamaño del arreglo sera la cantidad de vacantes disponibles
        nroEstudiante = 1; //El numero de estudiante se inicializa en 1 cuando se crea la facultad
        cantidadEstudiantes = 0; //Cantidad de estudiantes cuando se crea la facultad
    }

    public String getNombreFacultad (){ //obtener nombre de la facultad
        return this.nombreFacultad;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
        //obtener el arreglo de estudiantes, para ser usado tanto en los metodos de la clase Facultad como en los de la clase Estudiante
    }

    public void agregarEstudiante (Estudiante est) { //metodo para agregar un estudiante , recibe un objeto de la clase Estudiante

        if (cantidadEstudiantes == this.cantMaximaEstudiantes) { //comprueba que haya vacantes disponibles
            System.out.println("No hay mas vacantes en la facultad");
            return;
        }

        for (int i = 0; i < getEstudiantes().length; i++) {
            if (getEstudiantes()[i] == null) { //la posicion del arreglo esta vacia si es "null"
                getEstudiantes()[i] = est; //se guarda al estudiante agregado en esa posicion
                getEstudiantes()[i].setNroEstudiante(nroEstudiante); //se le asigna un numero de estudiante
                nroEstudiante++; //se incrementa en 1 el numero de estudiante, para ser usado por el proximo estudiante que se agregue
                cantidadEstudiantes++; //se incrementa en 1 la cantidad de estudiantes que asisten a la facultad
                break;
            }
        }
        //se imprime un mensaje si el estudiante fue agregado y las vacantes disponibles
        System.out.println("Estudiante "+est.getNombre()+" agregado, vacantes disponibles: "+(this.cantMaximaEstudiantes-this.cantidadEstudiantes));
    }

    public void listar () { //metodo para listar

        System.out.println("---------LISTA DE ESTUDIANTES-----");

        for (int i = 0; i < getEstudiantes().length; i++) { //se recorre el arreglo de estudiantes
            if (getEstudiantes()[i] == null) continue; //si la posicion esta vacia, se la omite para que no haya un error de ejecucion
            //se imprime a modo de lista cada estudiante con su informacion
            System.out.print("NOMBRE: "+ getEstudiantes()[i].getNombre()+"\tNOTA MEDIA: "+ getEstudiantes()[i].getNotaMedia()+"\tNUMERO DE ESTUDIANTE: "+ getEstudiantes()[i].getNroEstudiante()+"\n\n");
        }
    }

    public void buscarEstudiante (String nombre) { //funcion para buscar estudiante

        boolean encontrado = false; //variable para saber si fue encontrado o no
        for (int i = 0; i < getEstudiantes().length; i++) { //se recorre el arreglo de estudiantes

            if (getEstudiantes()[i] == null) continue; //se saltean las posiciones vacias

            if (getEstudiantes()[i].getNombre().equals(nombre)) {
                encontrado = true; //si lo encuentra la variable se vuelve verdadera y se imprime la info del estudiante
                System.out.println("Se encontro al estudiante: ");
                System.out.print("NOMBRE: "+ getEstudiantes()[i].getNombre()+"\tNOTA MEDIA: "+ getEstudiantes()[i].getNotaMedia()+"\tNUMERO DE ESTUDIANTE: "+ getEstudiantes()[i].getNroEstudiante()+"\n\n");
            }
        }

        if (!encontrado) { //si no lo encuentra, la variable sigue siendo falsa e imprime un mensaje de error
            System.out.println("No se encontro a ningun estudiante con ese nombre");
        }

    }


    public void borrarEstudiante (int nroEstudiante) { //metodo para borrar, recibe el numero de estudiante

        for (int i = 0; i < getEstudiantes().length; i++) { //se recorre el arreglo
            if (getEstudiantes()[i] == null) continue; //se ignoran las posiciones vacias

            if (getEstudiantes()[i].getNroEstudiante() == nroEstudiante) { //si coincide con el numero de estudiante que fue pasado como parametro
                System.out.println("El alumno: "+ getEstudiantes()[i].getNombre()+", fue borrado."); //se imprime un mensaje
                getEstudiantes()[i] = null; //se vacia esa posicion
                this.cantidadEstudiantes--; //se decrementa en 1 la cantidad de alumnos que asisten a la facultad
                break; //se da por terminado el proceso
            }
        }
    }

    public void modificarNota (String nombre, double nota) { //metodo para modificar nota, recibe el nombre y la nota nueva del estudiante.

        boolean encontrado = false; //variable para saber si el estudiante existe o no

        for (int i = 0; i < getEstudiantes().length; i++) { //se recorre el arreglo

            if (getEstudiantes()[i] == null) continue; //se ignoran las posiciones vacias

            if (getEstudiantes()[i].getNombre().equals(nombre)) { //si coincide con el nombre pasado como parametro

                getEstudiantes()[i].setNotaMedia(nota); //se setea la nueva nota media del estudiante (pasando la variable 'nota' que se paso como parametro anteriormente)

                System.out.println("Nota modificada"); //se imprime la nueva informacion
                System.out.print("NOMBRE: "+ getEstudiantes()[i].getNombre()+"\tNOTA MEDIA: "+ getEstudiantes()[i].getNotaMedia()+"\tNUMERO DE ESTUDIANTE: "+ getEstudiantes()[i].getNroEstudiante()+"\n\n");

                encontrado = true;
            }
        }

        if (!encontrado) { //si no se encuentra al estudiante
            System.out.println("No se encontro al estudiante");
        }
    }

}
