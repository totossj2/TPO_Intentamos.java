package ControladorPago;

import java.util.*;

public class ControladorPago {

    public ControladorPago() {
    }

    public void Pagar(int legajo, int idCurso, float monto, String medioPago) {
        if (medioPago.equals("MercadoPago")) {
            Pago pago = new Pago(new MercadoPago());
            pago.Pagar(monto);
        }
    }
}