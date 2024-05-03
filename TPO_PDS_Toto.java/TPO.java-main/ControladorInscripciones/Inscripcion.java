package ControladorInscripciones;

import java.time.LocalDate;
import java.util.*;

public class Inscripcion {
    private LocalDate fechaLimite;

    public Inscripcion(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

}