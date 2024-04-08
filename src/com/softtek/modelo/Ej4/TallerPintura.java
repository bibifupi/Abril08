package com.softtek.modelo.Ej4;

public class TallerPintura implements ITaller{
    @Override
    public <coche> String reparar() {
        return "Pintando";
    }

    public TallerPintura() {
    }
}
