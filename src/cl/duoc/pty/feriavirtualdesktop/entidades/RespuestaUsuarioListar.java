/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.util.List;

/**
 *
 * @author s1mu2
 */
public class RespuestaUsuarioListar {

    private boolean Exito;
    private String Mensaje;
    private List<Usuario> Usuarios;

    public RespuestaUsuarioListar() {
    }

    public RespuestaUsuarioListar(boolean Exito, String Mensaje, List<Usuario> Usuarios) {
        this.Exito = Exito;
        this.Mensaje = Mensaje;
        this.Usuarios = Usuarios;
    }

    public boolean isExito() {
        return Exito;
    }

    public void setExito(boolean Exito) {
        this.Exito = Exito;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public List<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(List<Usuario> Usuarios) {
        this.Usuarios = Usuarios;
    }

}
