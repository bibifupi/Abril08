package com.softtek.modelo.Ej2;

public class Avion extends Vehiculo implements ObjetoVolador {
    //Atributos
    //Metodos
    public boolean despegar(){
        boolean despegando=false;
        if(despegando){despegando=false;}
        return despegando;
    }
    public String aterrizar(){
        String suelo ="Aterrizado...";
        return suelo;
    }
    public String volar(){
        String aire ="Volando...";
        return aire;
    }
    //Constructores

    public Avion() {
    }

    //Getters y Setters
}

