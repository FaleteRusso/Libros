package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Libros;
import com.corenetworks.Persistencia.AccesoLibros;

import java.sql.SQLException;

public class ProbarLibros {
    public static void main(String[] args) {
        AccesoLibros L1= new AccesoLibros();
        try {
            System.out.println(L1.obtenerUno("123456789"));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());;
        }

    }


}
