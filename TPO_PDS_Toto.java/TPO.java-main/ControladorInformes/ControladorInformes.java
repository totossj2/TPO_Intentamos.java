package ControladorInformes;
import ControladorCurso.Curso;
import Docentes.Docente;

import javax.print.Doc;
import java.util.*;

public class ControladorInformes {

    private static ControladorInformes instance;

    private ControladorInformes() {
        // private constructor
    }

    public static ControladorInformes getInstance() {
        if (instance == null) {
            instance = new ControladorInformes();
        }
        return instance;
    }

    public void generarInforme(Docente docente) {
        PDF pdf = new PDF();
        pdf.generarInforme(docente);

    }


}