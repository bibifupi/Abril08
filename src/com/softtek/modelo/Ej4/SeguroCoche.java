package com.softtek.modelo.Ej4;

public class SeguroCoche {
    private ITaller taller;
    private String aseguradora;

    public String reparar(){
        return taller.reparar();
    }

    public ITaller getTaller() {
        return taller;
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}
