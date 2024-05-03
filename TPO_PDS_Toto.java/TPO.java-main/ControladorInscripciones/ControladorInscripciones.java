package ControladorInscripciones;

import ControladorAlumno.ControladorAlumno;
import ControladorCarrera.ControladorCarrera;
import ControladorMateria.ControladorMateria;
import ControladorCurso.ControladorCursos;

import java.time.LocalDate;
import java.util.List;

public class ControladorInscripciones {

    public ControladorInscripciones() {
    }

    private Inscripcion inscripcion;

    private Cuatrimestre cuatrimestre;

    private LocalDate fechaActual;

    ControladorMateria controladorMateria = new ControladorMateria();
    ControladorCarrera controladorCarrera = new ControladorCarrera();
    ControladorAlumno controladorAlumno = new ControladorAlumno();
    ControladorCursos controladorCursos = new ControladorCursos();


    public void inscribirse(int legajo, int idCurso){
        int idMateria = controladorCursos.getIdMateria(idCurso);
        System.out.println("entro al metodo");

        if (checkCorrelativas(idMateria, legajo) != null) {
            System.out.println("No cumple con las correlativas"); // aca
            //System.out.println(controladorMateria.getCorrelativasAnteriores(idMateria));
            return;
        }
        System.out.println("Pasó las correlativas");
        if (!esFechaValida()) {
            System.out.println("No es fecha valida");
            return;
        }
        System.out.println("Pasó la fecha valida");

        if (!controlarCargaHorariaXCurso()) {
            System.out.println("No cumple con la carga horaria");
            return;
        }
        System.out.println("Pasó la carga horaria");

        //verCursos(idMateria); // solo para ver si funciona
        System.out.println("Inscripcion exitosa");
        // falta q pago, q se aumente la carga horaria en cuatrimestre y q se agregue la materia a la lista de materias  del alumno

        float horasAcumuladas = controladorMateria.getHorasAcumuladas(idMateria);
        cuatrimestre.aumentarHoras(horasAcumuladas);
        cuatrimestre.agregarCursada(idMateria);
    }

    /**public void verCursos(int materiaID) {
        List<Integer> cursos = controladorMateria.getCursosAsignados(materiaID);
        for (int curso : cursos) {
            System.out.println(curso);
        }
    }**/

    public String checkCorrelativas(int idMateria, int idAlumno) {
        // buscas las materias aprobadas del alumno x y las correlativas de la materia q quiere inscribirse


        List <String> materiasAprobadas = controladorAlumno.getMateriasAprobadas(idAlumno); // en controlador alumno anda como el orto
        String correlativa = controladorMateria.getCorrelativasAnteriores(idMateria); // en onctrolador materia anda como el orto
        System.out.println( correlativa);

        if (materiasAprobadas.contains(correlativa)) {
            return null;
        } else {
            return correlativa;
        }
    }
    public boolean esFechaValida(){
        if (this.fechaActual.isAfter(inscripcion.getFechaLimite())) {
            return true;
        } else {
            return false;
        }
    } // estara adentro d inscribirse

    public boolean controlarCargaHorariaXCurso() {
        Float horasAcumuladas = cuatrimestre.getCargaHoraria(); // Cuando hagamos Inscribirse, hay q aumentar las horas en cuatrimestre con cuatrimeste.sumarHoras();
        Float HorasMaximas = controladorCarrera.getCargaHorariamaxima();
        if (horasAcumuladas > HorasMaximas) {
            return false;
        } else {
            return true;
        }
    }

}