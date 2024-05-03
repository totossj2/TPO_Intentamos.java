package ControladorInformes;

import ControladorCurso.Curso;
import ControladorInformes.Informe;
import Docentes.Docente;

import java.util.List;

public class PDF extends Informe {
    public PDF() {
    }
    public void generarInforme(Docente docente) {
        List<Curso> cursos = docente.getCursosAsignados();
        for (Curso curso : cursos) {
            String nombre = curso.getNombre();
            String horario = curso.getHorario();
            String aulaAsignada = curso.getAulaAsignada();
            // Aquí es donde realmente generas el informe PDF.
            System.out.println("Generando informe PDF para el curso " + nombre + " en el aula " + aulaAsignada + " a las " + horario);
    }

}
}
