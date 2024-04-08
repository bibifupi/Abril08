package com.softtek.modelo.Ej6;

public class AccesoProduccion implements IDAO{
    public String insertar(Cliente cliente) {
        return "Producción"+cliente.toString();
    }

    public AccesoProduccion() {
    }

    @Override
    public String toString() {
        return "AccesoProduccion{}";
    }
}

