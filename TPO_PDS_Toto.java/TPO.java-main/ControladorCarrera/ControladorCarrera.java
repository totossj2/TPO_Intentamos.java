package ControladorCarrera;

import ControladorMateria.ControladorMateria;

public class ControladorCarrera {

    private Carrera carrera;

    ControladorMateria controladorMateria = new ControladorMateria();

    public ControladorCarrera() {
    }

    public int getIdMateria() {
        return controladorMateria.getMateria();
    }

    public Float getCargaHorariamaxima() {
        return carrera.getCargaHorariaMaxima();
    }
}