package com.softtek.presentacion;

import com.softtek.modelo.Ej4.Coche;
import com.softtek.modelo.Ej4.SeguroCoche;

public class PruebaTaller {
    public static void main(String[] args) {
        SeguroCoche seguro = new SeguroCoche();
        System.out.println(seguro.reparar());
    }

}
