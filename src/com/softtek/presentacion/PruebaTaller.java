package com.softtek.presentacion;

import com.softtek.modelo.Ej4.Coche;
import com.softtek.modelo.Ej4.SeguroCoche;
import com.softtek.modelo.Ej4.TallerMecanica;
import com.softtek.modelo.Ej4.TallerPintura;

public class PruebaTaller {
    public static void main(String[] args) {
        SeguroCoche seguro = new SeguroCoche();
        TallerMecanica taller = new TallerMecanica();
        seguro.setTaller(taller);
        System.out.println(seguro.reparar());
        TallerPintura taller2 = new TallerPintura();
        seguro.setTaller(taller2);
        System.out.println(seguro.reparar());
    }

}
