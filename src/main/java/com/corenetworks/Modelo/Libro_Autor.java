package com.corenetworks.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Libro_Autor {
    protected String DNI;
    protected String ISBN;
    protected String nombre;
    protected String titulo;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public String toString() {
        return "Libro_Autor{" +
                "DNI='" + DNI + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }

}
