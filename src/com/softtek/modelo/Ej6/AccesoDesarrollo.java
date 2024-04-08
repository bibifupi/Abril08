package com.softtek.modelo.Ej6;

public class AccesoDesarrollo implements IDAO{

    public AccesoDesarrollo() {
    }

    @Override
    public String insertar(Cliente cliente) {
        return "Desarrollo"+cliente.toString();
    }

    @Override
    public String toString() {
        return "AccesoDesarrollo{}";
    }
}