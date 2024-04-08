package com.softtek.modelo.Ej2;

public class Hidroavion extends Avion implements Nautico{
    @Override
    public boolean atracar() {
        return false;
    }

    @Override
    public String navegar() {
        return null;
    }

    @Override
    public boolean despegar() {
        return super.despegar();
    }

    @Override
    public String aterrizar() {
        return super.aterrizar();
    }

    @Override
    public String volar() {
        return super.volar();
    }

    public Hidroavion() {
    }
}
