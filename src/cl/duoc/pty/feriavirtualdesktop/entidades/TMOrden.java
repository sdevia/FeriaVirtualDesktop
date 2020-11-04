/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import static java.lang.String.valueOf;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrator
 */
    
public class TMOrden implements TableModel {

    private List<Orden> ordenes;

    public TMOrden(List<Orden> lista) {
        ordenes = lista;
    }

    @Override
    public int getRowCount() {
        return ordenes.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        switch (columnIndex) {
            case 0: {
                titulo = "ID";
                break;
            }
            case 1: {
                titulo = "FECHA";
                break;
            }
            case 2: {
                titulo = "CLIENTE";
                break;
            }
            case 3: {
                titulo = "ESTADO";
                break;
            }
        }
        return titulo;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Orden o = ordenes.get(rowIndex);
        String valor = null;

        switch (columnIndex) {
            case 0: {
                valor = Integer.toString(o.getIdOrden());
                break;
            }
            case 1: {  
                valor = (o.getFechaOrden()).toString();
                break;
            }
            case 2: {
                valor = Integer.toString(o.getIdClienteExterno());
                break;
            }
            case 3: {
                valor = o.getEstado();
                break;
            }
        }
        return valor;

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Orden o = ordenes.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                o.setIdOrden(aValue.hashCode());
                break;
            }
            case 1: {
                o.setFechaOrden((Date)aValue);
                break;
            }
            case 2: {
                o.setIdClienteExterno(aValue.hashCode());
                break;
            }
            case 3: {
                o.setEstado(aValue.toString());
                break;
            }
        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}
