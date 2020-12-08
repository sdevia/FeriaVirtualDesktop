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
 * @author Administrator
 */
public class TMProceso implements TableModel {
    private List<Proceso> procesos;

    public TMProceso(List<Proceso> lista) {
        procesos = lista;
    }

    @Override
    public int getRowCount() {
        return procesos.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        switch (columnIndex) {
            case 0: {
                titulo = "ORDEN";
                break;
            }
            case 7: {
                titulo = "COMISION";
                break;
            }
            case 6: {
                titulo = "VALOR ADUANA";
                break;
            }
            case 3: {
                titulo = "PAGO POR SERVICIO";
                break;
            }
            case 4: {
                titulo = "PAGO TRANSPORTISTA";
                break;
            }
            case 5: {
                titulo = "FECHA PROCESO";
                break;
            }
            case 2: {
                titulo = "ESTADO";
                break;
            }
            case 1: {
                titulo = "PROCESO";
                break;
            }
            case 8: {
                titulo = "ID CLIENTE";
                break;
            }
            case 9: {
                titulo = "FECHA FIN PROCESO";
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
        Proceso p = procesos.get(rowIndex);
        String valor = null;

        switch (columnIndex) {
            case 0: {
                valor = Integer.toString(p.getIdOrden());
                break;
            }
            case 7: {
                /*SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                valor = formatter.format(o.getFechaOrden());*/
                valor = Integer.toString(p.getComision());
                break;
            }
            case 6: {
                valor = Integer.toString(p.getValorAduana());
                break;
            }
            case 3: {
                valor = Integer.toString(p.getPagoPorServicio());
                break;
            }
            case 4: {
                valor = Integer.toString(p.getPagoTransportista());
                break;
            }
            case 5: {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                valor = sdf.format(p.getFechaProceso());

                break;
            }
            case 2: {
                valor = (p.getEstadoProceso());
                break;
            }
            case 1: {
                valor = Integer.toString(p.getIdProceso());
                break;
            }
            case 8: {
                valor = Integer.toString(p.getIdUsuario());
                break;
            }
            case 9: {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                valor = sdf.format(p.getFechaFinProceso());
                break;
            }
        }
        return valor;

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Proceso p = procesos.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                p.setIdOrden(aValue.hashCode());
                break;
            }
            case 1: {
                p.setComision(aValue.hashCode());
                break;
            }
            case 6: {
                p.setValorAduana(aValue.hashCode());
                break;
            }
            case 3: {
                p.setPagoPorServicio(aValue.hashCode());
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