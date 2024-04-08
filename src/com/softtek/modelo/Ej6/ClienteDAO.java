package com.softtek.modelo.Ej6;

public class ClienteDAO {
    private IDAO conexion;

    public ClienteDAO(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente c1) {
        return conexion.insertar();
    }
}
