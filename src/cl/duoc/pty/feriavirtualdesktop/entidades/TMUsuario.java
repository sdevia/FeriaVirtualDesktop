/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import cl.duoc.pty.feriavirtualdesktop.utils.ValidacionRut;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author s1mu2
 */
public class TMUsuario implements TableModel {

    private List<Usuario> usuarios;

    public TMUsuario(List<Usuario> lista) {
        usuarios = lista;
    }

    @Override
    public int getRowCount() {
        return usuarios.size();
    }

    @Override
    public int getColumnCount() {
        return 13;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String titulo = null;
        switch (columnIndex) {
            case 0: {
                titulo = "CÓDIGO USUARIO";
                break;
            }
            case 1: {
                titulo = "RUT";
                break;
            }
            case 2: {
                titulo = "NOMBRE";
                break;
            }
            case 3: {
                titulo = "APELLIDO";
                break;
            }
            case 4: {
                titulo = "EMAIL";
                break;
            }
            case 5: {
                titulo = "ESTADO";
                break;
            }
            case 6: {
                titulo = "ACTIVO";
                break;
            }
            case 7: {
                titulo = "DIRECCIÓN";
                break;
            }
            case 8: {
                titulo = "CAMBIO CLAVE";
                break;
            }
            case 9: {
                titulo = "CREACIÓN";
                break;
            }
            case 10: {
                titulo = "MODIFICACIÓN";
                break;
            }
            case 11: {
                titulo = "IDPERFIL";
                break;
            }
            case 12: {
                titulo = "TELÉFONO";
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
        Usuario u = usuarios.get(rowIndex);
        String valor = null;

        switch (columnIndex) {
            case 0: {
                valor = Integer.toString(u.getIdUsuario());
                break;
            }
            case 1: {
                valor = u.getRut();
                break;
            }
            case 2: {
                valor = u.getNombre();
                break;
            }
            case 3: {
                valor = u.getApellido();
                break;
            }
            case 4: {
                valor = u.getEmail();
                break;
            }
            case 5: {
                valor = u.getEstado();
                break;
            }
            case 6: {
                valor = u.getActivo();
                break;
            }
            case 7: {
                valor = u.getDireccion();
                break;
            }
            case 8: {
                valor = u.getCambiaClave();
                break;
            }
            case 9: {
                valor = u.getFechaCreacion();
                break;
            }
            case 10: {
                valor = u.getFechaModificacion();
                break;
            }
            case 11: {
                valor = u.getIdPerfil();
                break;
            }
            case 12: {
                valor = u.getTelefono();
                break;
            }
        }
        return valor;

    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Usuario u = usuarios.get(rowIndex);
        switch (columnIndex) {
            case 0: {
                u.setIdUsuario(aValue.hashCode());
                break;
            }
            case 1: {
                u.setRut(aValue.toString());
                break;
            }
            case 2: {
                u.setNombre(aValue.toString());
                break;
            }
            case 3: {
                u.setApellido(aValue.toString());
                break;
            }
            case 4: {
                u.setEmail(aValue.toString());
                break;
            }
            case 5: {
                u.setEstado(aValue.toString());
                break;
            }
            case 6: {
                u.setActivo(aValue.toString());
                break;
            }
            case 7: {
                u.setDireccion(aValue.toString());
                break;
            }
            case 8: {
                u.setCambiaClave(aValue.toString());
                break;
            }
            case 9: {
                u.setFechaCreacion(aValue.toString());
                break;
            }
            case 10: {
                u.setFechaModificacion(aValue.toString());
                break;
            }
            case 11: {
                u.setIdPerfil(aValue.toString());
                break;
            }
            case 12: {
                u.setTelefono(aValue.toString());
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
