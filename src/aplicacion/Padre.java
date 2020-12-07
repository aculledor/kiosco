/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

/**
 *
 * @author aculledor
 */
public class Padre {
    public int precio;
    public int cantidad;
    public String nombreParaPedido;
    public String idioma;

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombreParaPedido() {
        return nombreParaPedido;
    }
    
    public void aumentarCantidad(){
        this.cantidad++;
    }
    
    public void disminuirCantidad(){
        if(this.cantidad > 1){
            this.cantidad--;
        }
    }

    public String getIdioma() {
        return idioma;
    }
    
    public int total(){
        return this.precio * this.cantidad;
    }
}
