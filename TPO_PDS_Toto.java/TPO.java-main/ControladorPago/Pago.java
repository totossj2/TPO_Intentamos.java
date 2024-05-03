package ControladorPago;

import java.util.*;

public class Pago implements MedioPago{

    private MercadoPago mercadoPago;

    public Pago() {
    }
    
    public Pago(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
    }

    private float monto;
    
    @Override
    public void Pagar(Float monto) {
        mercadoPago.RealizarPago(monto);
    }
}

