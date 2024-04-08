package com.softtek.modelo.Ej6;

public class ClienteDAO {
    private IDAO conexion;

    public ClienteDAO(IDAO conexion) {
        this.conexion = conexion;
    }

    public String insertar(Cliente cliente) {
        return conexion.insertar(cliente);
    }

    @Override
    public String toString() {
        return "ClienteDAO{" +
                "conexion=" + conexion +
                '}';
    }
}
