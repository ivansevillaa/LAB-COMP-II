package trabajoPractico5;

//Trabajo practico 5
//INTEGRANTES: ALVAREZ JEREMIAS , GARCIA AGUSTIN, SEVILLA IVAN , OBREGON SERGIO NICOLAS
//EQUIPO: "4 CABEZAS"

public class UsoFacultad {

    public static void main(String[] args) {


        Facultad utn = new Facultad("UTN",2); //se crea el objeto facultad, con 2 vacantes

        //se crean 3 estudiantes
        Estudiante e1 = new Estudiante("Luis",5);
        Estudiante e2 = new Estudiante("Carlos",6);
        Estudiante e3 = new Estudiante("Lucia",3);

        utn.agregarEstudiante(e1); //se agregan mas estudiantes de lo permitido.
        utn.agregarEstudiante(e2);
        utn.agregarEstudiante(e3); //e3 no se agrega porque no hay mas vacantes.

        utn.listar(); //se listan los 2 estudiantes que si se agregaron (e1 y e2)


        utn.buscarEstudiante("jose"); //se busca un estudiante que no existe
        utn.buscarEstudiante("Carlos"); //se busca un estudiante que si existe
        utn.borrarEstudiante(1); //se borra un estudiante (e1)
        utn.listar(); //se lista con los estudiantes restantes (e2)
        utn.agregarEstudiante(e3); //se agrega otro estudiante (e3) con una vacante disponible
        utn.listar(); //se lista con el nuevo estudiante (e3)

        e3.asistirFacultad(utn); //se comprueba si el estudiante asiste a esa facultad, siendo verdadero
        e1.asistirFacultad(utn); //se comprueba si el estudiante asiste a esa facultad, siendo falso
    }

}
