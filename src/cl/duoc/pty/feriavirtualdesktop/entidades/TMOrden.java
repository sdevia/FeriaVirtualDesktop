/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Javier
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
        return 8;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        switch (columnIndex) {
            case 0: {
                titulo = "ORDEN";
                break;
            }
            case 1: {
                titulo = "FECHA";
                break;
            }
            case 2: {
                titulo = "FIRMACONTRATO";
                break;
            }
            case 3: {
                titulo = "FECHAFIRMACONTRATO";
                break;
            }
            case 4: {
                titulo = "ESTADO";
                break;
            }
            case 5: {
                titulo = "PRECIO VENTA";
                break;
            }
            case 6: {
                titulo = "IDCLIENTEEXTERNO";
                break;
            }
            case 7: {
                titulo = "IDCLIENTEINTERNO";
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
        return columnIndex != 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Orden o = ordenes.get(rowIndex);
        String valor = null;
        Date valorfecha = null;

        switch (columnIndex) {
            case 0: {
                valor = Integer.toString(o.getIdOrden());
                break;
            }
            case 1: {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                valor = sdf.format(o.getFechaOrden());

                break;
            }
            case 2: {
                valor = Boolean.toString(o.isFirmaContrato());
                break;
            }
            case 3: {
                SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
                valor = sdf2.format(o.getFechaFirmaContrato());
                break;
            }
            case 4: {
                valor = o.getEstado();
                break;
            }
            case 5: {
                valor = Double.toString(o.getPrecioVenta());
                break;
            }
            case 6: {
                valor = Integer.toString(o.getIdClienteExterno());
                break;
            }
            case 7: {
                valor = Integer.toString(o.getIdClienteInterno());
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
                o.setFechaOrden((Date) aValue);
                break;
            }
            case 2: {
                o.setFirmaContrato((boolean) aValue);
                break;
            }
            case 3: {
                o.setFechaFirmaContrato((Date) aValue);
                break;
            }
            case 4: {
                o.setEstado(aValue.toString());
                break;
            }
            case 5: {
                o.setPrecioVenta((double) aValue);
                break;
            }
            case 6: {
                o.setIdClienteExterno((int) aValue);
                break;
            }
            case 7: {
                o.setIdClienteInterno((int) aValue);
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
