package com.softtek.modelo.Ej5;

public class Director implements Empleado{
    private Informe informe;

    @Override
    public String getTareas() {
        return "Tareas de Director";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public Director(Informe informe) {
        this.informe = informe;
    }

    public Director() {
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }
}
