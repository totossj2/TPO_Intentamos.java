package ControladorMateria;

import ControladorCurso.ControladorCursos;
import ControladorCurso.Curso;

import java.util.*;

public class ControladorMateria {

    private static ControladorMateria instance;
    ControladorCursos controladorCurso;
    private List<Materia> listaMaterias = new ArrayList<Materia>();
    private Materia materia;

    private ControladorMateria() {
        this.controladorCurso = ControladorCursos.getInstance();
    }

    public static ControladorMateria getInstance() {
        if (instance == null) {
            instance = new ControladorMateria();
        }
        return instance;
    }


    //public List<Integer> getCursosAsignados(int materiaID){
    //    return controladorCurso.obtenerCursoXMateria(materiaID);
    //}

    public void agregarMateria(Materia materia){
        listaMaterias.add(materia);
    }

    public String getCorrelativasAnteriores(int idMateria){
        for (Materia materia : listaMaterias){
            if (materia.getIdMateria() == idMateria){ // te encuentra la materia de la q queres ver las correlativas
                return materia.getCorrelativaAnterior();
            }
        }
        System.out.println("No tiene correlativas anteriores");
        return "No tiene correlativas anteriores";
    }
    public String getNombreMateria(int idMateria){
        for (Materia materia : listaMaterias){
            if (materia.getIdMateria() == idMateria){ // te encuentra la materia de la q queres ver las correlativas
                return materia.getNombre();
            }
        }
        return null;
    }

    public int getMateria() {
        return materia.getIdMateria();
    }

    public float getCargaHoraria(int idMateria){
        for (Materia materia : listaMaterias){
            if (materia.getIdMateria() == idMateria){ // te encuentra la materia de la q queres ver las correlativas
                return materia.getCargaHoraria();
            }
        }
        return 0;
    }

}