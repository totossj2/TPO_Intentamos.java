package ControladorAlumno;

import java.util.*;
public class Alumno {

    public Alumno(int legajo, String nombre, String email, int Dni) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.email = email;
        this.Dni = Dni;

    }
    private List<String> listaMateriasAprobadas = new ArrayList<String>();
    private int legajo;
    private String nombre;
    private String email;
    private int Dni;


    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateriaAprobada(String nombreMateria) {
        listaMateriasAprobadas.add(nombreMateria);
    }
    public List<String> getListaMateriasAprobadas() {
        return listaMateriasAprobadas;
    }
    public void aprobarMateria(String materia) {
        listaMateriasAprobadas.add(materia);
    }

}