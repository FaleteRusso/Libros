package com.corenetworks.Persistencia;

import com.corenetworks.Modelo.Autor;
import com.corenetworks.Modelo.Libros;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoAutor extends com.corenetworks.Persistencia.Conexion {
    public Autor obtenerUno(String id) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "Select * from Autores where DNI =" +"'"+ id + "'";
        abrirConexion();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);
        Autor a1 = null;

        if (resultado.next()) {
            a1 = new Autor(resultado.getString("Dni"),
                    resultado.getString("Nombre"));

        }
        return a1;
    }
}
