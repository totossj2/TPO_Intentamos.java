package ControladorCurso;

import java.sql.Time;
import java.util.*;

public class Curso {

    public Curso(int idCurso, int idMateria) {
        this.idCurso = idCurso;
        this.idMateria = idMateria;
    }

    private int idCurso;
    private int idMateria;
    private Time horarioInicio;
    private Time horarioFin;
    private Aula aula;
    private List<Docente> docentes;
    private Map<Curso,String> cronogramaSemanal;

    public void findAula(String nombre) {

    }

    public int getIdMateria(){
        return idMateria;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }
}