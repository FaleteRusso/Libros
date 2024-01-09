package com.corenetworks.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@NoArgsConstructor
@Data
@AllArgsConstructor

public class Libros {
    protected String ISBN;
    protected String titulo;

    @Override
    public String toString() {
        return "Libros{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libros libros = (Libros) o;
        return ISBN == libros.ISBN && Objects.equals(titulo, libros.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, titulo);
    }

    public String getISBN() {
        return ISBN;
    }


    }

