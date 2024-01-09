package com.corenetworks.Persistencia;

import com.corenetworks.Modelo.Autor;
import com.corenetworks.Modelo.Libro_Autor;
import com.corenetworks.Modelo.Tiendas;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoTiendas extends Conexion{
    public boolean insertarTienda(Tiendas t1) throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        int resultado = 0;

        String sql = "INSERT INTO Tiendas (tienda_id, direccion_id, ventas)  VALUES(?, ?, ?);";
        abrirConexion();
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setInt(1, t1.getId_tienda());
        sentencia.setString(2, t1.getDireccion());
        sentencia.setBigDecimal(3, t1.getVentas());
        resultado = sentencia.executeUpdate();


        return resultado > 0;
    }

    public boolean modificarDireccion(Tiendas id, String direccion ) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        int resultado = 0;
        String sql = "UPDATE Tiendas SET direccion_id= '" + direccion + "' WHERE tienda_id = '" + id.getId_tienda()+ "'";
        abrirConexion();
        sentencia = miConexion.createStatement();

        resultado = sentencia.executeUpdate(sql);

        return resultado > 0;
    }
    public boolean modificarVentas(Tiendas id, BigDecimal ventas) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        int resultado = 0;
        String sql = "UPDATE Tiendas SET ventas = '" + ventas + "' WHERE tienda_id = '" + id.getId_tienda()+ "'";
        abrirConexion();
        sentencia = miConexion.createStatement();

        resultado = sentencia.executeUpdate(sql);

        return resultado > 0;
    }



    public boolean eliminarTienda(int id) throws SQLException, ClassNotFoundException {
        PreparedStatement sentencia;
        int resultado = 0;
        String sql = "DELETE FROM Tiendas WHERE tienda_id = ?";
        abrirConexion();
        sentencia = miConexion.prepareStatement(sql);
        sentencia.setInt(1, id);
        resultado = sentencia.executeUpdate();
        return resultado > 0;
    }
    public Tiendas obtenerUno(int id) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "Select * from Tiendas where tienda_id =" +"'"+ id + "'";
        abrirConexion();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);
        Tiendas t = null;

        if (resultado.next()) {
            String valormoney= resultado.getString("ventas");
            valormoney = valormoney.replace("€","").replace(".","").replace(",","");
            System.out.println(valormoney);
            t = new Tiendas(resultado.getInt("tienda_id"),
                    resultado.getString("direccion_id"),
            resultado.getBigDecimal("ventas"));

        }
        return t;
    }
    public List<Tiendas> obtenertodos() throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "Select * from Tiendas";
        abrirConexion();
        List <Tiendas> t1= new ArrayList<>();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        while (resultado.next()){
            t1.add(new Tiendas(resultado.getInt("tienda_id"),
                    resultado.getString("direccion_id"),
                    resultado.getBigDecimal("ventas")));

        }
        return t1;

}
    }
