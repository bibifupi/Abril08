package com.softtek.presentacion;

import com.softtek.modelo.Ej6.*;

public class PruebaDAO {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        IDAO accesoProd = new AccesoProduccion();
        IDAO accesoDev = new AccesoDesarrollo();

        ClienteDAO clienteDaoProd = new ClienteDAO(accesoProd);
        ClienteDAO clienteDaoDev = new ClienteDAO(accesoDev);

        System.out.println(clienteDaoProd.insertar(cliente));
        System.out.println(clienteDaoDev.insertar(cliente));
    }
}
