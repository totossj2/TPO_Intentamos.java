package ControladorMateria;

import ControladorCurso.Curso;

import java.util.*;

public class Materia {

    public Materia(int idMateria, String nombre, int cargaHoraria, String correlativaPosterior, Materia correlativaAnterior) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.correlativaPosterior = correlativaPosterior;
        this.correlativaAnterior = correlativaAnterior;
    }

    private int idMateria;

    private List<Curso> listaCursos = new ArrayList<Curso>();

    private String nombre;

    private float cargaHoraria;

    private String correlativaPosterior;

    private Materia correlativaAnterior;

    private Date fechaInicio;

    private Date fechaFinal;

    private float arancel;

    public int getIdMateria() {
        return idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public String getCorrelativaPosterior(){
        return correlativaPosterior;
    }

    public String getCorrelativaAnterior(){
        if (correlativaAnterior == null){
            return "No tiene correlativas anteriores";
        }else{
            return correlativaAnterior.nombre;
        }
    }

    public void setCorrelativaAnteriores(Materia anterior){
        correlativaAnterior = (anterior);
    }

    public void setCorrelativaPosteriores(String posterior){
        correlativaPosterior = (posterior);
    }


}