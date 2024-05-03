package ControladorCurso;

import java.util.*;


public class ControladorCursos {

    private static ControladorCursos instance;

    private ControladorCursos() {
    }

    public static ControladorCursos getInstance() {
        if (instance == null) {
            instance = new ControladorCursos();
        }
        return instance;
    }

    private List<Curso> listaCursos = new ArrayList<Curso>();


    public int getIdMateria(int idCurso) {
        for (Curso curso : listaCursos) {
            if (curso.getIdCurso() == idCurso) {
                return curso.getIdMateria();
            }
        }
        return -1;
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

    public void getCronogramaSemanal() {
    }

    public void asignarDocente(Curso curso, int legajo) {
        for (Curso cursos : listaCursos) {
            if (cursos == curso) {
                curso.setLegajoDocente(legajo);
            }
        }

    }



}