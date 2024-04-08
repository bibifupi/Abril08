package com.softtek.presentacion;
import com.softtek.modelo.Ej2.Avion;
import com.softtek.modelo.Ej2.Barcaza;
import com.softtek.modelo.Ej2.Helicoptero;
import com.softtek.modelo.Ej2.Hidroavion;

public class PruebaVehiculoNauticoVolador {
    public static void main(String[] args) {
        Barcaza barcaza = new Barcaza();
        Avion avion = new Avion();
        Hidroavion hidroavion = new Hidroavion();
        Helicoptero helicoptero = new Helicoptero();
        System.out.println(barcaza.atracar());
        System.out.println(barcaza.navegar());
        System.out.println(avion.despegar());
        System.out.println(avion.aterrizar());
        System.out.println(avion.volar());
        System.out.println(hidroavion.atracar());
        System.out.println(hidroavion.navegar());
        System.out.println(hidroavion.despegar());
        System.out.println(hidroavion.aterrizar());
        System.out.println(hidroavion.volar());
        System.out.println(helicoptero.aterrizar());
        System.out.println(helicoptero.volar());
        System.out.println(helicoptero.aterrizar());
    }


}
