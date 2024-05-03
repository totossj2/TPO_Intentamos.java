package ControladorMateria;

import ControladorCurso.ControladorCursos;
import ControladorCurso.Curso;

import java.util.*;

public class ControladorMateria {

    public ControladorMateria() {
    }

    private ControladorCursos controladorCurso;

    private List<Materia> listaMaterias = new ArrayList<Materia>();

    private Materia materia;

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
        return null;
    }

    public int getMateria() {
        return materia.getIdMateria();
    }

    public float getHorasAcumuladas(int idMateria){
        for (Materia materia : listaMaterias){
            if (materia.getIdMateria() == idMateria){ // te encuentra la materia de la q queres ver las correlativas
                return materia.getCargaHoraria();
            }
        }
        return 0;
    }

}