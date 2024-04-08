package com.softtek.modelo.Ej5;

public class Jefe implements Empleado {

    private Informe informe;

    @Override
    public String getTareas() {
        return "Tareas de jefe";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public Jefe(Informe informe) {
        this.informe = informe;
    }

    public Jefe() {
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

}

