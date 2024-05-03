package ControladorAlumno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ControladorAlumno {

    private static ControladorAlumno instance;

    private List<Alumno> listaAlumnos = new ArrayList<Alumno>();

    private ControladorAlumno() {
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


    public void setHorasAcumuladas(int legajo, float horas){
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getLegajo() == legajo) {
                alumno.setHorasAcumuladas(horas);
                return;
            }
        }
        System.out.println("No se encontró al alumno con el ID proporcionado");
    }

    public float getHorasAcumuladas(int legajo){
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getLegajo() == legajo) {
                return alumno.getHorasAcumuladas();
            }
        }
        System.out.println("No se encontró al alumno con el ID proporcionado");
        return 0;
    }

    public void agregarCursada(int legajo, int materiaId) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getLegajo() == legajo) {
                alumno.agregarCursada(materiaId);
                return;
            }
        }
        System.out.println("No se encontró al alumno con el ID proporcionado");
    } // cuando se inscribe a una materia, se agrega a la lista de materias inscriptas del alumno

    public Float montoPagar(int legajo) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getLegajo() == legajo) {
                float monto = alumno.getArancel() * alumno.getListaMateriasInscriptas().size();
                return monto;
            }
        }
        System.out.println("No se encontró al alumno con el ID proporcionado");
        return null;
    }
}