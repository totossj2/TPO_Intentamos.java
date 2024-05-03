import ControladorCarrera.Carrera;
import ControladorCurso.ControladorCursos;
import ControladorCurso.Curso;
import ControladorAlumno.Alumno;
import ControladorInscripciones.ControladorInscripciones;
import ControladorMateria.Materia;
import ControladorMateria.ControladorMateria;
import ControladorAlumno.ControladorAlumno;
import ControladorPago.ControladorPago;
import ControladorInformes.ControladorInformes;
import ControladorInformes.PDF;
import ControladorInformes.Informe;
import Docentes.Docente;


public class main {
    public static void main(String[] args) {

        Alumno alumno1 = new Alumno(1,"Juan", "juanpedro@gmail.com", 452311314);
        Alumno alumno2 = new Alumno(2,"Pedro", "pedro@gmail.com",452311222);

        Materia programacionI = new Materia(1, "Programacion I", 40, "Programacion II", null);
        Materia programacionII = new Materia(2, "Programacion II", 42,"Programacion III", programacionI);
        Materia programacionIII = new Materia(3, "Programacion III", 45, null, programacionII);
        Materia calculoI = new Materia(4, "Calculo I", 35, null, null);

        Carrera carrera = new Carrera("Ingenieria en Sistemas", 5, 120);

        ControladorMateria controladorMateria = ControladorMateria.getInstance();
        controladorMateria.agregarMateria(programacionI);
        controladorMateria.agregarMateria(programacionII);
        controladorMateria.agregarMateria(programacionIII);
        controladorMateria.agregarMateria(calculoI);

        ControladorCursos controladorCursos = ControladorCursos.getInstance();
        ControladorAlumno controladorAlumno = ControladorAlumno.getInstance();
        ControladorPago controladorPago = ControladorPago.getInstance();

        controladorAlumno.agregarAlumno(alumno1);
        controladorAlumno.agregarAlumno(alumno2);
        controladorAlumno.aprobarMateria(1, "Programacion I");

        Curso curso1 = new Curso(1, 1, "Aula 1", "14:00-17:00", "Programacion I");
        controladorCursos.addCurso(curso1);
        Docente tua = new Docente("David", "Tua",12345678);
        tua.asignarDocente(curso1);
        Curso curso2 = new Curso(2, 2, "Aula 2", "18:00-20:00", "Programacion II");
        controladorCursos.addCurso(curso2);
        Docente aquino = new Docente("Felipe", "De Aquino",421231223);
        tua.asignarDocente(curso2);
        Curso curso3 = new Curso(3, 3, "Aula 1", "18:00-20:00", "Programacion III");
        controladorCursos.addCurso(curso3);
        Docente wehbe = new Docente("Ricardo", "Wehbe",427231223);
        wehbe.asignarDocente(curso3);
        Curso curso4 = new Curso(4, 4, "Aula 2", "14:00-17:00","Calculo I" );
        controladorCursos.addCurso(curso4);
        Docente edga = new Docente("Edgardo", "Crespo",427211223);
        edga.asignarDocente(curso4);

        tua.getCursosAsignados();
        tua.getCronograma();

        ControladorInformes controladorInformes = ControladorInformes.getInstance();
        controladorInformes.generarInforme(tua);


        controladorAlumno.aprobarMateria(1, "Programacion I");

        ControladorInscripciones controladorInscripciones = ControladorInscripciones.getInstance();
        controladorInscripciones.inscribirse(1, 2);
        controladorInscripciones.inscribirse(1, 3);
        controladorInscripciones.inscribirse(1, 4);


        controladorPago.pagar(1, "MercadoPago");



    }
}