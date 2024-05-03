package ControladorInscripciones;

import java.util.*;
import java.time.LocalDate;
public class Cuatrimestre {

    public Cuatrimestre() {
    }

    private Float horasAcumuladas;

    private Float arancel;

    private List<Integer> listaMateriasInscriptas;

    public Float getCargaHoraria() {
        return null;
    }

    public void aumentarHoras(float horas) {
        this.horasAcumuladas += horas;
    }
    public void agregarCursada(int materiaId) {
        listaMateriasInscriptas.add(materiaId);
    }
}