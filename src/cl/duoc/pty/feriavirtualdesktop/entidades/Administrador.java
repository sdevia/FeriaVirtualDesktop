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
public class Administrador {

    private boolean Exito;
    private int Motivo;
    private String Mensaje;
    private Usuario Usuario;

    public Administrador() {
    }

    public Administrador(boolean Exito, int Motivo, String Mensaje, Usuario Usuario) {
        this.Exito = Exito;
        this.Motivo = Motivo;
        this.Mensaje = Mensaje;
        this.Usuario = Usuario;
    }

    public boolean isExito() {
        return Exito;
    }

    public void setExito(boolean Exito) {
        this.Exito = Exito;
    }

    public int getMotivo() {
        return Motivo;
    }

    public void setMotivo(int Motivo) {
        this.Motivo = Motivo;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

}
