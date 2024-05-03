package ControladorPago;

import ControladorAlumno.ControladorAlumno;

import java.util.*;

public class ControladorPago {

    private static ControladorPago instance;

    private ControladorPago() {
        controladorAlumno = ControladorAlumno.getInstance();
    }

    public static ControladorPago getInstance() {
        if (instance == null) {
            instance = new ControladorPago();
        }
        return instance;
    }

    ControladorAlumno controladorAlumno;


    public void pagar(int legajo, String medioPago) {
        float monto= controladorAlumno.montoPagar(legajo);
        if (medioPago.equals("MercadoPago")) {
            Pago pago = new Pago(new MercadoPago());
            pago.Pagar(monto);
            System.out.println("Se realizo un pago por MercadoPago de: "+monto);
        }


    }
}