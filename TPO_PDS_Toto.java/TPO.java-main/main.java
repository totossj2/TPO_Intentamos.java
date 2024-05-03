import ControladorCurso.ControladorCursos;
import ControladorCurso.Curso;
import ControladorAlumno.Alumno;
import ControladorInscripciones.ControladorInscripciones;
import ControladorMateria.Materia;
import ControladorMateria.ControladorMateria;
import ControladorAlumno.ControladorAlumno;
import ControladorCurso.Curso;
import java.util.Date;


public class main {
    public static void main(String[] args) {

        Date fechaInicio = new Date(2024, 2, 11);
        Date fechaFinal = new Date(2024, 6, 29);

        Alumno alumno1 = new Alumno(1,"Juan", "juanpedro@gmail.com", 452311314);
        Alumno alumno2 = new Alumno(2,"Pedro", "pedro@gmail.com",452311222);

        Materia programacionI = new Materia(1, "Programacio I", 40, "Programacion II", null);
        Materia programacionII = new Materia(2, "Programacion II", 42,"Programacion III", programacionI);
        Materia programacionIII = new Materia(3, "Programacion III", 45, null, programacionII);
        Materia calculoI = new Materia(4, "Calculo I", 35, null, null);


        ControladorMateria controladorMateria = ControladorMateria.getInstance();
        controladorMateria.agregarMateria(programacionI);
        controladorMateria.agregarMateria(programacionII);
        controladorMateria.agregarMateria(programacionIII);
        controladorMateria.agregarMateria(calculoI);
        ControladorCursos controladorCursos = ControladorCursos.getInstance();
        ControladorAlumno controladorAlumno = ControladorAlumno.getInstance();

        controladorAlumno.agregarAlumno(alumno1);
        controladorAlumno.agregarAlumno(alumno2);
        controladorAlumno.aprobarMateria(1, "Programacion I");

        Curso curso1 = new Curso(1, 1);
        controladorCursos.addCurso(curso1);
        Curso curso2 = new Curso(2, 2);
        controladorCursos.addCurso(curso2);
        Curso curso3 = new Curso(3, 3);
        controladorCursos.addCurso(curso3);

        alumno1.agregarMateriaAprobada("Programacion I");

        ControladorInscripciones controladorInscripciones = ControladorInscripciones.getInstance();
        controladorInscripciones.inscribirse(1, 2);
        controladorInscripciones.inscribirse(1, 3);



    }
}