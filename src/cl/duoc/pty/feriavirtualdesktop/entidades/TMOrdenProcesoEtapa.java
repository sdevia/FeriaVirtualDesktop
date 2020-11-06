/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Eduardo
 */
public class TMOrdenProcesoEtapa implements TableModel {
    
    private List<OrdenProcesoEtapa> ordenProcesoEtapas;
    
    public TMOrdenProcesoEtapa(List<OrdenProcesoEtapa> lista){
        ordenProcesoEtapas = lista;
    }

    @Override
    public int getRowCount() {
        return ordenProcesoEtapas.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
            switch (columnIndex) {
                case 0: {
                    titulo = "ID USUARIO";
                    break;
                }
                case 1: {
                    titulo = "ESTADO";
                    break;
                }
                case 2: {
                    titulo = "PRECIO VENTA";
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
        return columnIndex !=0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        OrdenProcesoEtapa o = ordenProcesoEtapas.get(rowIndex);
            String valor = null;
            
            switch (columnIndex) {
                case 0: {
                    valor = Integer.toString(o.getIdUsuario());
                    break;
                }
                case 1: {
                    valor = o.getEstado();
                    break;
                }
                case 2: {
                    valor = Double.toString(o.getPrecioVenta());
                    break;
                }
            }
            return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        OrdenProcesoEtapa o = ordenProcesoEtapas.get(rowIndex);
            switch (columnIndex) {
                case 0: {
                    o.setIdUsuario(aValue.hashCode());
                    break;
                }
                case 1: {
                    o.setEstado(aValue.toString());
                    break;
                }
                case 2: {
                    o.setPrecioVenta(aValue.hashCode());
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
