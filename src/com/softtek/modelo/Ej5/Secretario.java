package com.softtek.modelo.Ej5;

public class Secretario implements Empleado{
    private Informe informe;
    private String empresa;
    private String email;

    @Override
    public String getTareas() {
        return "Tareas de Secretario";
    }

    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public Secretario(Informe informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    public Secretario() {
    }

    public void setInforme(Informe informe) {
        this.informe = informe;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
