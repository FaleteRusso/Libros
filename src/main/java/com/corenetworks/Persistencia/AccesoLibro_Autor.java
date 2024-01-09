package com.corenetworks.Persistencia;

import com.corenetworks.Modelo.Autor;
import com.corenetworks.Modelo.Libro_Autor;
import com.corenetworks.Modelo.Libros;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoLibro_Autor extends Conexion {
    public List<Libro_Autor> obtenertodos(String DNI) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "Select la.isbn, titulo ,la.dni, nombre from public.libros_autores la\n" +
                "join public.libros l\n" +
                "on l.isbn = la.isbn\n" +
                "join public.autores a\n" +
                "on la.dni = a.dni\n" +
                "where la.dni=" +"'"+ DNI +"'";
        abrirConexion();
        List <Libro_Autor> l1= new ArrayList<>();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        while (resultado.next()){
            l1.add(new Libro_Autor(resultado.getString("dni"),
                    resultado.getString("titulo"),
                    resultado.getString("isbn"),
            resultado.getString("nombre")));

        }
        return l1;
}
    }
