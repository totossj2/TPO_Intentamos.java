package ControladorCarrera;

import java.util.*;

public class Carrera {
    ControladorCarrera controladorCarrera = ControladorCarrera.getInstance();

    public Carrera(String nombre, int duracion, float cargaHorariaMaxima) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.cargaHorariaMaxima = cargaHorariaMaxima;
    }

    private String nombre;

    private int duracion;

    private Float cargaHorariaMaxima;

    private List<Integer> listaMateria = new ArrayList<Integer>();

    public Float getCargaHorariaMaxima() {
        return cargaHorariaMaxima;
    }

    public void agregarMateria(){
        int idMateria = controladorCarrera.getIdMateria();
        listaMateria.add(idMateria);
    }


}