package ControladorCurso;

import java.util.*;


public class ControladorCursos {

    public ControladorCursos() {
    }

    private List<Curso> listaCursos = new ArrayList<Curso>();

    public void asignarDocente(Docente docente) {
        // TODO implement here
    }

    public int getIdMateria(int idCurso) {
        for (Curso curso : listaCursos) {
            if (curso.getIdCurso() == idCurso) {
                return curso.getIdMateria();
            }
        }
        return -1;
    }

    public void getCronogramaSemanal() {
        // TODO implement here
    }

    public void addCurso(Curso curso) {
        listaCursos.add(curso);
    }

    public List<Curso> getCursos() {
        return listaCursos;
    }

    private Curso curso;
    private ControladorCursos controladorCursos;

    public List<Integer> obtenerCursoXMateria(int idMateria) {
        List<Curso> cursos = controladorCursos.getCursos();
        List<Integer> cursos_materia = null;
        for (Curso curso : cursos) {
            if (curso.getIdMateria() == idMateria) {
                cursos_materia.add(curso.getIdCurso());
            }

        }
        return cursos_materia;
    }
}