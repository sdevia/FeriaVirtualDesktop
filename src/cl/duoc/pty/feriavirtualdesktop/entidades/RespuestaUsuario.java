/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

/**
 *
 * @author Samuel
 */
public class RespuestaUsuario {

    private boolean Exito;
    private String Mensaje;
    private Usuario Usuario;

    public RespuestaUsuario() {
    }

    public RespuestaUsuario(boolean Exito, String Mensaje, Usuario Usuario) {
        this.Exito = Exito;
        this.Mensaje = Mensaje;
        this.Usuario = Usuario;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
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

}
