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
public class Menu extends Padre{
    
    private Producto plato1;
    private Producto plato2;
    private Producto bebida;

    public Menu(Producto plato1, Producto plato2, Producto bebida, int precio, String idioma) {
        this.plato1 = plato1;
        this.plato2 = plato2;
        this.bebida = bebida;
        this.idioma = idioma;
        if(idioma.equals("gal"))
            this.nombreParaPedido = ("MENU: " + plato1.getNombreGallego()+ ", " + plato2.getNombreGallego()+ ", " + bebida.getNombreGallego()).toUpperCase();
        else
            this.nombreParaPedido = ("MENU: " + plato1.getNombre() + ", " + plato2.getNombre() + ", " + bebida.getNombre()).toUpperCase();
        this.precio = precio;
        this.cantidad = 1;
    }

    public Menu(Producto plato1, Producto plato2, Producto bebida, int precio, boolean infantilOferta, String idioma) {
        this.plato1 = plato1;
        this.plato2 = plato2;
        this.bebida = bebida;
        this.idioma = idioma;
        if(infantilOferta){
            if(idioma.equals("gal"))
                this.nombreParaPedido = ("Oferta: " + plato1.getNombreGallego()+ ", " + plato2.getNombreGallego()+ ", " + bebida.getNombreGallego()).toUpperCase();
            else
                this.nombreParaPedido = ("Oferta: " + plato1.getNombre() + ", " + plato2.getNombre() + ", " + bebida.getNombre()).toUpperCase();
        }
        else{
            if(idioma.equals("gal"))
                this.nombreParaPedido = ("Menu infantil: " + plato1.getNombreGallego()+ ", " + plato2.getNombreGallego()+ ", " + bebida.getNombreGallego()).toUpperCase();
            else
                this.nombreParaPedido = ("Menu infantil: " + plato1.getNombre() + ", " + plato2.getNombre() + ", " + bebida.getNombre()).toUpperCase();
            
        }
        this.precio = precio;
        this.cantidad = 1;
    }

    public Menu(Menu menu) {
        this.plato1 = new Producto(menu.plato1);
        this.plato2 = new Producto(menu.plato2);
        this.bebida = new Producto(menu.bebida);
        this.idioma = menu.getIdioma();
        if(menu.nombreParaPedido.equals(""))
            this.nombreParaPedido = "";
        else{
            if(idioma.equals("gal"))
                this.nombreParaPedido = ("MENU: " + plato1.getNombreGallego()+ ", " + plato2.getNombreGallego()+ ", " + bebida.getNombreGallego()).toUpperCase();
            else
                this.nombreParaPedido = ("MENU: " + plato1.getNombre() + ", " + plato2.getNombre() + ", " + bebida.getNombre()).toUpperCase();
        }
        this.precio = menu.precio;
        this.cantidad = menu.cantidad;
    }

    public Menu(Menu menu, boolean infantilOferta) {
        this.plato1 = new Producto(menu.plato1);
        this.plato2 = new Producto(menu.plato2);
        this.bebida = new Producto(menu.bebida);
        this.idioma = menu.getIdioma();
        if(menu.nombreParaPedido.equals(""))
            this.nombreParaPedido = "";
        else{
            if(infantilOferta){
                if(idioma.equals("gal"))
                    this.nombreParaPedido = ("Oferta: " + plato1.getNombreGallego()+ ", " + plato2.getNombreGallego()+ ", " + bebida.getNombreGallego()).toUpperCase();
                else
                    this.nombreParaPedido = ("Oferta: " + plato1.getNombre() + ", " + plato2.getNombre() + ", " + bebida.getNombre()).toUpperCase();
            }
            else{
                if(idioma.equals("gal"))
                    this.nombreParaPedido = ("Menu infantil: " + plato1.getNombreGallego()+ ", " + plato2.getNombreGallego()+ ", " + bebida.getNombreGallego()).toUpperCase();
                else
                    this.nombreParaPedido = ("menu infantil: " + plato1.getNombre() + ", " + plato2.getNombre() + ", " + bebida.getNombre()).toUpperCase();
            }
        }
        this.precio = menu.precio;
        this.cantidad = menu.cantidad;
    }

    public Menu() {
        this.plato1 = new Producto();
        this.plato2 = new Producto();
        this.bebida = new Producto();
        this.idioma = "es";
        this.nombreParaPedido = "";
        this.precio = 0;
        this.cantidad = 1;
    }

    public Menu(String idioma) {
        this.plato1 = new Producto();
        this.plato2 = new Producto();
        this.bebida = new Producto();
        this.idioma = idioma;
        this.nombreParaPedido = "";
        this.precio = 0;
        this.cantidad = 1;
    }

    public Producto getPlato1() {
        return plato1;
    }

    public void cambiarPlato1(Producto plato1) {
        this.precio = this.precio - this.plato1.getPrecio();
        this.plato1 = plato1;
        this.precio = this.precio + this.plato1.getPrecio();
        this.resetNombreParaPedido();
    }

    public void cambiarPlato1(Producto plato1, boolean infantilOferta) {
        this.precio = this.precio - this.plato1.getPrecio();
        this.plato1 = plato1;
        this.precio = this.precio + this.plato1.getPrecio();
        this.resetNombreParaPedido(infantilOferta);
    }

    public Producto getPlato2() {
        return plato2;
    }

    public void cambiarPlato2(Producto plato2) {
        this.precio = this.precio - this.plato2.getPrecio();
        this.plato2 = plato2;
        this.precio = this.precio + this.plato2.getPrecio();
        this.resetNombreParaPedido();
    }

    public void cambiarPlato2(Producto plato2, boolean infantilOferta) {
        this.precio = this.precio - this.plato2.getPrecio();
        this.plato2 = plato2;
        this.precio = this.precio + this.plato2.getPrecio();
        this.resetNombreParaPedido(infantilOferta);
    }

    public Producto getBebida() {
        return bebida;
    }
    
    public void cambiarBebida(Producto bebida) {
        this.precio = this.precio - this.bebida.getPrecio();
        this.bebida = bebida;
        this.precio = this.precio + this.bebida.getPrecio();
        this.resetNombreParaPedido();
    }

    public void cambiarBebida(Producto bebida, boolean infantilOferta) {
        this.precio = this.precio - this.bebida.getPrecio();
        this.bebida = bebida;
        this.precio = this.precio + this.bebida.getPrecio();
        this.resetNombreParaPedido(infantilOferta);
    }

    public void resetNombreParaPedido() {
        if(idioma.equals("gal"))
            this.nombreParaPedido = ("MENU: " + plato1.getNombreGallego()+ ", " + plato2.getNombreGallego()+ ", " + bebida.getNombreGallego()).toUpperCase();
        else
            this.nombreParaPedido = ("MENU: " + plato1.getNombre() + ", " + plato2.getNombre() + ", " + bebida.getNombre()).toUpperCase();
    }

    public void resetNombreParaPedido(boolean infantilOferta) {
        if(infantilOferta){
            if(idioma.equals("gal"))
                this.nombreParaPedido = ("Oferta: " + plato1.getNombreGallego()+ ", " + plato2.getNombreGallego()+ ", " + bebida.getNombreGallego()).toUpperCase();
            else
                this.nombreParaPedido = ("Oferta: " + plato1.getNombre() + ", " + plato2.getNombre() + ", " + bebida.getNombre()).toUpperCase();
        }
        else{
            if(idioma.equals("gal"))
                this.nombreParaPedido = ("Menu infantil: " + plato1.getNombreGallego()+ ", " + plato2.getNombreGallego()+ ", " + bebida.getNombreGallego()).toUpperCase();
            else
                this.nombreParaPedido = ("menu infantil: " + plato1.getNombre() + ", " + plato2.getNombre() + ", " + bebida.getNombre()).toUpperCase();
        }
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0){
            this.cantidad = cantidad;
        }
    }
    
    
    
    @Override
    public String toString(){
        return this.plato1.toString() + "//" + this.plato2.toString() + "//" + this.bebida.toString() + "//"+ this.precio + "//"+ this.cantidad;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        return (this.plato1.equals(((Menu)obj).getPlato1()) && this.plato2.equals(((Menu)obj).getPlato2()) || 
                this.plato2.equals(((Menu)obj).getPlato1()) && this.plato1.equals(((Menu)obj).getPlato2())
                ) && this.bebida.equals(((Menu)obj).getBebida()) && this.precio == ((Menu)obj).getPrecio();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.plato1);
        hash = 61 * hash + Objects.hashCode(this.plato2);
        hash = 61 * hash + Objects.hashCode(this.bebida);
        hash = 61 * hash + this.precio;
        return hash;
    }
    
    
    

    
    
    
    
}
