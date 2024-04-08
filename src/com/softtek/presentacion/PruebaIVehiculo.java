package com.softtek.presentacion;

import com.softtek.modelo.Ej3.Coche;
import com.softtek.modelo.Ej3.Conductor;

public class PruebaIVehiculo {
    public static void main(String[] args) {
        Conductor conductor = new Conductor();
        Coche coche = new Coche(87);
        System.out.println(conductor.conducir());
        System.out.println(coche.moverse());
    }
}
