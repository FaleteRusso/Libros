package com.corenetworks.Presentacion;

import com.corenetworks.Persistencia.AccesoLibro_Autor;

import java.sql.SQLException;
import java.util.Scanner;

public class ProbarLibro_autor {
    public static void main(String[] args) {
        AccesoLibro_Autor al= new AccesoLibro_Autor();
        Scanner teclado= new Scanner(System.in);
        String DNI= teclado.next();
        try {
            System.out.println(al.obtenertodos(DNI));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
