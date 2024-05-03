package ControladorCarrera;

import ControladorMateria.ControladorMateria;

public class ControladorCarrera {

    private ControladorMateria controladorMateria = ControladorMateria.getInstance();

    private static ControladorCarrera instance;

    private ControladorCarrera() {
    }

    public static ControladorCarrera getInstance() {
        if (instance == null) {
            instance = new ControladorCarrera();
        }
        return instance;
    }

    private Carrera carrera;

    public int getIdMateria() {
        return controladorMateria.getMateria();
    }

    public Float getCargaHorariamaxima() {
        return carrera.getCargaHorariaMaxima();
    }
}