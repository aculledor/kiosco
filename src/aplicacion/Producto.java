/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.Objects;

/**
 *
 * @author aculledor
 */
public class Producto extends Padre{
    
    private final String nombre;
    private final String nombreGallego;
    private boolean bebida;

    public Producto(String nombre, String nombreGallego, int precio, boolean bebida, String idioma) {
        this.nombre = nombre;
        this.nombreGallego = nombreGallego;
        this.bebida = bebida;
        this.idioma = idioma;
        if(bebida){
            if(idioma.equals("gal"))
                this.nombreParaPedido = ("Bebida: " + this.nombreGallego).toUpperCase();
            else
                this.nombreParaPedido = ("Bebida: " + this.nombre).toUpperCase();
        }
        else{
            if(idioma.equals("gal"))
                this.nombreParaPedido = ("Prato: " + this.nombreGallego).toUpperCase();
            else
                this.nombreParaPedido = ("Plato: " + this.nombre).toUpperCase();
        }
        this.precio = precio;
        this.cantidad = 1;
    }

    public Producto(Producto producto) {
        this.nombre = producto.nombre;
        this.nombreGallego = producto.nombreGallego;
        this.nombreParaPedido = producto.nombre;
        this.bebida = producto.bebida;
        this.idioma = producto.idioma;
        if(bebida){
            if(idioma.equals("gal"))
                this.nombreParaPedido = ("Bebida: " + this.nombreGallego).toUpperCase();
            else
                this.nombreParaPedido = ("Bebida: " + this.nombre).toUpperCase();
        }
        else{
            if(idioma.equals("gal"))
                this.nombreParaPedido = ("Prato: " + this.nombreGallego).toUpperCase();
            else
                this.nombreParaPedido = ("Plato: " + this.nombre).toUpperCase();
        }
        this.precio = producto.precio;
        this.cantidad = producto.cantidad;
    }

    public Producto() {
        this.nombre = "";
        this.nombreGallego = "";
        this.nombreParaPedido = "";
        this.bebida = false;
        this.idioma = "es";
        this.bebida = false;
        this.precio = 0;
        this.cantidad = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreGallego() {
        return nombreGallego;
    }

    public boolean isBebida() {
        return bebida;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0){
            this.cantidad = cantidad;
        }
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        return this.nombre.equals(((Producto)obj).getNombre()) && this.nombreGallego.equals(((Producto)obj).getNombreGallego()) && this.precio == ((Producto)obj).getPrecio();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + Objects.hashCode(this.nombreGallego);
        hash = 11 * hash + this.precio;
        return hash;
    }

}
