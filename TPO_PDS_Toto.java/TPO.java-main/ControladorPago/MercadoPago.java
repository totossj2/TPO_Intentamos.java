package ControladorPago;

import java.util.*;

public class MercadoPago {

    public MercadoPago() {
    }

    private int cvu;

    private String alias;

    public String RealizarPago(Float monto) {
        return "El monto" + monto + "fue pagado con Mercado Pago";
    }

}