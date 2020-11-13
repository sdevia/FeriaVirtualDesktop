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
//            case 8: {
//                titulo = "CLAVE";
//                break;
//            }
//            case 9: {
//                titulo = "INTENTOS";
//                break;
//            }
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
//                case 15: {
//                    titulo = "RECLAVE";
//                    break;
//                }
//                case 16: {
//                    titulo = "SESIÓN ID";
//                    break;
//                }
//                case 17: {
//                    titulo = "ESTADO EDITADO";
//                    break;
//                }

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
                valor = Boolean.toString(u.isEstado());
                break;
            }
            case 6: {
                valor = Boolean.toString(u.isActivo());
                break;
            }
            case 7: {
                valor = u.getDireccion();
                break;
            }
//            case 8: {
//                valor = u.getClave();
//                break;
//            }
//            case 9: {
//                valor = Integer.toHexString(u.getIntentos());
//                break;
//            }
            case 8: {
                valor = Boolean.toString(u.isCambiaClave());
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
                valor = Integer.toHexString(u.getIdPerfil());
                break;
            }
            case 12: {
                valor = u.getTelefono();
                break;
            }
//                case 15: {
//                    valor = u.getReClave();
//                    break;
//                }
//                case 16: {
//                    valor = u.getSesionId();
//                    break;
//                }
//                case 17: {
//                    valor = u.getEstadoEdit();
//                    break;
//                }

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
                u.setEstado(aValue.equals(aValue));
                break;
            }
            case 6: {
                u.setActivo(aValue.equals(aValue));
                break;
            }
            case 7: {
                u.setDireccion(aValue.toString());
                break;
            }
//            case 8: {
//                u.setClave(aValue.toString());
//                break;
//            }
//            case 9: {
//                u.setIntentos(aValue.hashCode());
//                break;
//            }
            case 8: {
                u.setCambiaClave(aValue.equals(aValue));
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
                u.setIdPerfil(aValue.hashCode());
                break;
            }
            case 12: {
                u.setTelefono(aValue.toString());
                break;
            }
//                case 15: {
//                    u.setReClave(aValue.toString());
//                    break;
//                }
//                case 16: {
//                    u.setSesionId(aValue.toString());
//                    break;
//                }
//                case 17: {
//                    u.setEstadoEdit(aValue.toString());
//                    break;
//                }

        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }

}
