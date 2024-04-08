package com.softtek.modelo.Ej3;

public class Conductor {
    private IVehiculo vehiculo;

    public String conducir() {
        return vehiculo.moverse();
    }

    public Conductor() {
    }

    public Conductor(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}

