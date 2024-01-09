package com.corenetworks.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Tiendas {
    protected int id_tienda;
    protected String direccion;
    protected BigDecimal ventas;

    @Override
    public String toString() {
        return "Tiendas{" +
                "id_tienda=" + id_tienda +
                ", direccion='" + direccion + '\'' +
                ", ventas=" + ventas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiendas tiendas = (Tiendas) o;
        return id_tienda == tiendas.id_tienda && Objects.equals(direccion, tiendas.direccion) && Objects.equals(ventas, tiendas.ventas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_tienda, direccion, ventas);
    }
}
