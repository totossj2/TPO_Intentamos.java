package ControladorCurso;

import java.sql.Time;
import java.util.*;

public class Curso {

    public Curso(int idCurso, int idMateria, String aula, String horario, String nombre) {
        this.idCurso = idCurso;
        this.idMateria = idMateria;
        this.aula = aula;
        this.horario= horario;
        this.nombre = nombre;
    }

    private String nombre;
    private int idCurso;
    private int idMateria;
    private String horario;
    private String aula;
    private int legajoDocentes;



    public int getIdMateria(){
        return idMateria;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setLegajoDocente(int legajoDocentes) {
        this.legajoDocentes = legajoDocentes;
    }


    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHorario() {
        return horario;
    }

    public String getAulaAsignada() {
        return aula;
    }

}