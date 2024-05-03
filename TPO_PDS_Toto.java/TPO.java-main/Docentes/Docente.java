package Docentes;

import ControladorCurso.ControladorCursos;
import ControladorCurso.Curso;

import java.util.ArrayList;
import java.util.List;

public class Docente {

    private String nombre;
    private String apellido;
    private int legajo;
    private ControladorCursos controladorCursos = ControladorCursos.getInstance();
    private List<Curso> cursosAsignados = new ArrayList();

    public Docente(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public void asignarDocente(Curso curso) {
        controladorCursos.asignarDocente(curso, this.legajo);
        cursosAsignados.add(curso);
    }

    public List<Curso> getCursosAsignados() {
        return cursosAsignados;

    }

    public void getCronograma() {
        System.out.println("Cronograma semanal de cursos.");
    }

}

