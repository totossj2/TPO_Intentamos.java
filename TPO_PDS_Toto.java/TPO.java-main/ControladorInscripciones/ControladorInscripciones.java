package ControladorInscripciones;

import ControladorAlumno.ControladorAlumno;
import ControladorCarrera.ControladorCarrera;
import ControladorMateria.ControladorMateria;
import ControladorCurso.ControladorCursos;

import java.time.LocalDate;
import java.util.List;

public class ControladorInscripciones {

    private static ControladorInscripciones instance;
    private Inscripcion inscripcion;
    private LocalDate fechaActual;

    ControladorMateria controladorMateria;
    ControladorCarrera controladorCarrera;
    ControladorAlumno controladorAlumno;
    ControladorCursos controladorCursos;

    private ControladorInscripciones() {
        controladorMateria = ControladorMateria.getInstance();
        controladorCursos = ControladorCursos.getInstance();
        controladorAlumno = ControladorAlumno.getInstance(); // Uncomment this line if ControladorAlumno is a Singleton
        controladorCarrera = ControladorCarrera.getInstance(); // Uncomment this line if ControladorCarrera is a Singleton
    }

    public static ControladorInscripciones getInstance() {
        if (instance == null) {
            instance = new ControladorInscripciones();
        }
        return instance;
    }

    public void inscribirse(int legajo, int idCurso){
        int idMateria = controladorCursos.getIdMateria(idCurso);

        if (checkCorrelativas(idMateria, legajo) != null) {
            System.out.println("No cumple con las correlativas");
            //System.out.println(controladorMateria.getCorrelativasAnteriores(idMateria));
            return;
        }
        if (!esFechaValida()) {
            System.out.println("No es fecha valida");
            return;
        }

        if (!controlarCargaHorariaXLegajo(legajo)) {
            System.out.println("No cumple con la carga horaria");
            return;
        }

        //verCursos(idMateria); // solo para ver si funciona
        System.out.println("Inscripcion exitosa");
        // falta q pago, q se aumente la carga horaria en cuatrimestre y q se agregue la materia a la lista de materias  del alumno

        float horasAcumuladas = controladorMateria.getHorasAcumuladas(idMateria);
        controladorAlumno.setHorasAcumuladas(legajo, horasAcumuladas);
        controladorAlumno.agregarCursada(legajo, idMateria);
    }

    /**public void verCursos(int materiaID) {
        List<Integer> cursos = controladorMateria.getCursosAsignados(materiaID);
        for (int curso : cursos) {
            System.out.println(curso);
        }
    }**/

    public String checkCorrelativas(int idMateria, int idAlumno) {
        // buscas las materias aprobadas del alumno x y las correlativas de la materia q quiere inscribirse


        List <String> materiasAprobadas = controladorAlumno.getMateriasAprobadas(idAlumno);
        String correlativa = controladorMateria.getCorrelativasAnteriores(idMateria);


        if (materiasAprobadas.contains(correlativa)) {
            return null;
        } else {
            System.out.println("Debes: "+ correlativa);
            return correlativa;
        }
    }
    public boolean esFechaValida(){
        fechaActual = LocalDate.now();
        LocalDate fechaLimite = LocalDate.of(2024, 5, 11);
        if (fechaActual.isBefore(fechaLimite)) {
            return true;
        } else {
            return false;
        }
    } // estara adentro d inscribirse

    public boolean controlarCargaHorariaXLegajo(int legajo) {
        float horasAcumuladas = controladorAlumno.getHorasAcumuladas(legajo); // Cuando hagamos Inscribirse, hay q aumentar las horas en cuatrimestre con cuatrimeste.sumarHoras();
        float HorasMaximas = 150;//controladorCarrera.getCargaHorariamaxima();
        if (horasAcumuladas > HorasMaximas) {
            return false;
        } else {
            return true;
        }
    }

}