/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.util.ArrayList;

/**
 *
 * @author aculledor
 */
public class Pedido {
    private ArrayList<Padre> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }
    
    public int getTotal(){
        int suma = 0;
        for (var elem : this.productos){
            suma += elem.getPrecio()*elem.getCantidad();
        }
        return suma;
    }
    
    public void anhadirElemento(Padre elemento){
        if(elemento.nombreParaPedido.equals("")){
            return;
        }
        for (int i = 0; i < this.productos.size(); i++){
            if (this.productos.get(i).equals(elemento)){
                this.productos.get(i).aumentarCantidad();
                return;
            }
        }
        this.productos.add(elemento);
    }
    
    public void disminuirElemento(Padre elemento){
        if(elemento.nombreParaPedido.equals("")){
            return;
        }
        for (int i = 0; i < this.productos.size(); i++){
            if (this.productos.get(i).equals(elemento)){
                this.productos.get(i).disminuirCantidad();
                return;
            }
        }
    }
    
    public void borrarElemento(Padre elemento){
        if(elemento.nombreParaPedido.equals("")){
            return;
        }
        for (int i = 0; i < this.productos.size(); i++){
            if (this.productos.get(i).equals(elemento)){
                this.productos.remove(i);
                return;
            }
        }
    }

    public ArrayList<Padre> getProductos() {
        return productos;
    }
    
    @Override
    public String toString(){
        String toret = "";
        for( int i = 0; i < this.productos.size(); i++){
            toret += this.productos.get(i).toString();
            toret += "\n";
        }
        return toret;
    }
    
}
