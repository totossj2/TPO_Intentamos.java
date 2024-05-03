package ControladorAlumno;

import java.util.ArrayList;
import java.util.List;

public class ControladorAlumno {

    private static ControladorAlumno instance;
    private List<Alumno> listaAlumnos = new ArrayList<Alumno>();

    private ControladorAlumno() {
        // private constructor
    }

    public static ControladorAlumno getInstance() {
        if (instance == null) {
            instance = new ControladorAlumno();
        }
        return instance;
    }

    public void agregarAlumno(Alumno alumno){
        listaAlumnos.add(alumno);
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public List<String> getMateriasAprobadas(int legajo) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getLegajo() == legajo) {
                return alumno.getListaMateriasAprobadas();
            }
        }
        System.out.println("No se encontró al alumno con el ID proporcionado");
        return null;
    }

    public void aprobarMateria(int legajo, String materia) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getLegajo() == legajo) {
                alumno.aprobarMateria(materia);
                return;
            }
        }
        System.out.println("No se encontró al alumno con el ID proporcionado");
    }
}