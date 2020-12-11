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
 * @author Eduardo
 */
public class TMSubasta implements TableModel {

    public List<Subasta> subastas;

    public TMSubasta(List<Subasta> lista) {
        subastas = lista;
    }

    @Override
    public int getRowCount() {
        return subastas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        switch (columnIndex) {
            case 0: {
                titulo = "ID PROCESO";
                break;
            }
            case 1: {
                titulo = "ID SUBASTA";
                break;
            }
            case 2: {
                titulo = "FECHA INICIO";
                break;
            }
            case 3: {
                titulo = "FECHA TERMINO";
                break;
            }
            case 4: {
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
        return columnIndex != 0;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Subasta s = subastas.get(rowIndex);
        String valor = null;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        switch (columnIndex) {
            case 0: {
                valor = Integer.toString(s.getIdProceso());
                break;
            }
            case 1: {
                valor = Integer.toString(s.getIdSubasta());
                break;
            }
            case 2: {
                valor = format.format(s.getFechaSubasta());
                break;
            }
            case 3: {
                // valor = p.getFechaProceso().toString();
                valor = format.format(s.getFechaTermino());
                break;
            }
            case 4: {
                if (s.isEstado() == true) {
                    valor = "VIGENTE";
                } else {
                    valor = "NO VIGENTE";
                }

                break;
            }
        }
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Subasta s = subastas.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                s.setIdProceso(aValue.hashCode());
                break;
            }
            case 1: {
                s.setIdSubasta(aValue.hashCode());
                break;
            }
            case 2: {
                s.setFechaSubasta((Date) aValue);
                break;
            }
            case 3: {
                s.setFechaTermino((Date) aValue);
                break;
            }
            case 4: {
                if (aValue.toString() == "VIGENTE") {
                    s.setEstado(true);
                } else {
                    s.setEstado(false);
                };
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
