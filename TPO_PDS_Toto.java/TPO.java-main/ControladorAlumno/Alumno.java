package ControladorAlumno;

import java.util.*;
public class Alumno {

    public Alumno(int legajo, String nombre, String email, int dni) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.email = email;
        this.dni = dni;
    }
    private List<String> listaMateriasAprobadas = new ArrayList<String>();
    private int legajo;
    private String nombre;
    private String email;
    private int dni;
    private List<Integer> listaMateriasInscriptas = new ArrayList<Integer>();
    private float horasAcumuladas;
    private float arancelxMateria = 25000;

    public void setHorasAcumuladas(float horas){
        this.horasAcumuladas = this.horasAcumuladas + horas;
    }

    public float getHorasAcumuladas(){
        return horasAcumuladas;
    }

    public void agregarCursada(int materiaId) {
        listaMateriasInscriptas.add(materiaId);
    }

    public float getArancel() {
        return arancelxMateria;
    }

    public List<Integer> getListaMateriasInscriptas() {
        return listaMateriasInscriptas;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getListaMateriasAprobadas() {
        return listaMateriasAprobadas;
    }

    public void aprobarMateria(String materia) {
        listaMateriasAprobadas.add(materia);
    }

}