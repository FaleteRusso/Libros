package com.corenetworks.Presentacion;

import com.corenetworks.Modelo.Tiendas;
import com.corenetworks.Persistencia.AccesoTiendas;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Scanner;

public class ProbarTiendas {
    public static void main(String[] args) {
        AccesoTiendas t1= new AccesoTiendas();
        Scanner teclado= new Scanner(System.in);
        System.out.println("Hola que quieres 1.Insertar Tienda, 2.Modificar direccion, 3.Modificar ventas, 4.Eliminar tienda, 5.Obtener una tienda, 6.Obtener todos");
        int caso= teclado.nextInt();
        switch (caso){
            case 1:
                System.out.println("Escribe id");
                int id= teclado.nextInt();
                teclado.nextLine();
                System.out.println("Escribe la direccion");
                String direccion= teclado.nextLine();
                System.out.println("Escribe las ventas");
                BigDecimal ventas= teclado.nextBigDecimal();
                Tiendas t= new Tiendas(id,direccion,ventas);
                try {
                    System.out.println(t1.insertarTienda(t));
                } catch (SQLException e) {
                    System.out.println(e.toString());
                } catch (ClassNotFoundException e) {
                    System.out.println(e.toString());
                }
                break;
            case 2:
                System.out.println("Escribe id");
                int ide= teclado.nextInt();
                teclado.nextLine();
                System.out.println("Escribe la direccion nueva");
                String d= teclado.nextLine();
                Tiendas cd= new Tiendas();
                cd.setId_tienda(ide);
                try {
                    System.out.println(t1.modificarDireccion(cd,d));
                } catch (SQLException e) {
                    System.out.println(e.toString());
                } catch (ClassNotFoundException e) {
                    System.out.println(e.toString());;
                }
                break;
            case 3:
                System.out.println("Escribe id");
                int idi= teclado.nextInt();
                System.out.println("Escribe el numero de ventas");
                BigDecimal v= teclado.nextBigDecimal();
                Tiendas cv= new Tiendas();
                cv.setId_tienda(idi);
                try {
                    System.out.println(t1.modificarVentas(cv,v));
                } catch (SQLException e) {
                    System.out.println(e.toString());
                } catch (ClassNotFoundException e) {
                    System.out.println(e.toString());;
                }
                break;
            case 4:
                System.out.println("Escribe el id");
                int io= teclado.nextInt();
                try {
                    System.out.println(t1.eliminarTienda(io));
                } catch (SQLException e) {
                    System.out.println(e.toString());
                } catch (ClassNotFoundException e) {
                    System.out.println(e.toString());;
                }
                break;
            case 5:
                System.out.println("Escribe el id de la tienda");
                int su= teclado.nextInt();
                try {
                    System.out.println(t1.obtenerUno(su));
                } catch (SQLException e) {
                    System.out.println(e.toString());
                } catch (ClassNotFoundException e) {
                    System.out.println(e.toString());
                }
                break;
            case 6:
                try {
                    System.out.println(t1.obtenertodos());
                } catch (SQLException e) {
                    System.out.println(e.toString());
                } catch (ClassNotFoundException e) {
                    System.out.println(e.toString());;
                }


        }



    }
}
