package com.softtek.presentacion;

import com.softtek.modelo.Ej5.Director;
import com.softtek.modelo.Ej5.InformeTrimestre1;
import com.softtek.modelo.Ej5.InformeTrimestre2;
import com.softtek.modelo.Ej5.Jefe;
import com.softtek.modelo.Ej5.Secretario;
import com.softtek.modelo.Ej5.Informe;
import com.softtek.modelo.Ej5.Empleado;

public class PruebaEmpleado {
    public static void main(String[] args) {

        InformeTrimestre1 i1 = new InformeTrimestre1();
        InformeTrimestre2 i2 = new InformeTrimestre2();
Empleado director = new Director(i1);

        Informe informeDelJefe = new Informe() {
            @Override
            public String getInforme() {
                return i1.getInforme();
            }
        };

        Jefe jefe = new Jefe(informeDelJefe);
        System.out.println("Tareas del Jefe: " + jefe.getTareas());
        System.out.println("Informe del Jefe: " + jefe.getInforme());

        Informe informeDelDirector = new Informe() {
            public String getInforme() {
                return i2.getInforme();
            }
        };

        Director dire = new Director(informeDelDirector);
        System.out.println("Tareas del Director: " + dire.getTareas());
        System.out.println("Informe del Director: " + dire.getInforme());

        Secretario secre = new Secretario(i1, "Softtek", "secretario@softtek.com");
        System.out.println("Tareas del Secretario: " + secre.getTareas());
        System.out.println("Informe del Secretario: " + secre.getInforme());
    }

}

