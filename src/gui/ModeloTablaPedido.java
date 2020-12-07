/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import aplicacion.Padre;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author aculledor
 */
public class ModeloTablaPedido extends AbstractTableModel {

    private java.util.List<Padre> pedido;

    public ModeloTablaPedido() {
        this.pedido = new java.util.ArrayList<>();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public int getRowCount() {
        return pedido.size();
    }

    @Override
    public String getColumnName(int col) {
        String nombre = "";

        switch (col) {
            case 0:
                nombre = "Descripción";
                break;
            case 1:
                nombre = "Cantidad";
                break;
            case 2:
                nombre = "Precio";
                break;
        }
        return nombre;
    }

    @Override
    public Class getColumnClass(int col) {
        Class clase = null;

        switch (col) {
            case 0:
                clase = java.lang.String.class;
                break;
            case 1:
                clase = java.lang.Integer.class;
                break;
            case 2:
                clase = java.lang.Integer.class;
                break;
        }
        return clase;
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        return false;
    }

    public Object getValueAt(int row, int col) {
        Object resultado = null;

        switch (col) {
            case 0:
                resultado = pedido.get(row).getNombreParaPedido();
                break;
            case 1:
                resultado = pedido.get(row).getCantidad();
                break;
            case 2:
                resultado = pedido.get(row).getPrecio() * pedido.get(row).getCantidad();
                break;
        }
        return resultado;
    }

    public void setFilas(java.util.List<Padre> pedido) {
        this.pedido = pedido;
        fireTableDataChanged();
    }

    public java.util.List<Padre> getFilas() {
        return this.pedido;
    }

    public Padre obtenerElemento(int i) {
        return this.pedido.get(i);
    }
}