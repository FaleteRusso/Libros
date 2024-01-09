package com.corenetworks.Presentacion;

import com.corenetworks.Persistencia.AccesoAutor;

import java.sql.SQLException;
import java.util.Scanner;

public class ProbarAutor {
    public static void main(String[] args) {
        AccesoAutor a1= new AccesoAutor();
        Scanner teclado= new Scanner(System.in);
        String autor;
        System.out.println("Escriba el DNI del autor");
        autor= teclado.nextLine();
        try {
            System.out.println(a1.obtenerUno(autor));
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }

}
