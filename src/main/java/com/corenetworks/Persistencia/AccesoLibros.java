package com.corenetworks.Persistencia;

import com.corenetworks.Modelo.Libros;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoLibros extends com.corenetworks.Persistencia.Conexion {
    public Libros obtenerUno(String id) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "Select * from Libros where ISBN =" +"'"+ id + "'";
        abrirConexion();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);
        Libros L1 = null;

        if (resultado.next()) {
            L1 = new Libros(resultado.getString("ISBN"),
                    resultado.getString("titulo"));

        }
        return L1;
    }
}
