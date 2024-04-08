package com.softtek.modelo.Ej3;

public class Coche implements IVehiculo{
    private int deposito;

    @Override
    public String moverse() {
        if(deposito>0) {
            return "Moviéndose";
        } else {
            return "Quieto";
        }
    }

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    public Coche() {
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
