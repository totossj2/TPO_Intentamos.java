package ControladorAlumno;

import ControladorMateria.ControladorMateria;
import java.util.ArrayList;
import java.util.List;

public class ControladorAlumno {

    private List<Alumno> listaAlumnos = new ArrayList<Alumno>();

    public void agregarAlumno(Alumno alumno){
        listaAlumnos.add(alumno);}

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public List<String> getMateriasAprobadas(int legajo) {
        System.out.println("Tamaño de listaAlumnos: " + listaAlumnos.size());

        for (Alumno alumno : listaAlumnos) {
            System.out.println("ALumno "+alumno.getLegajo());
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
