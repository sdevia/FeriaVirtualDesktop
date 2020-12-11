/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

/**
 *
 * @author Katherine
 */
public class RespuestaFirmarOrden {

    private boolean Exito;
    private String Mensaje;

    public RespuestaFirmarOrden() {

    }

    public RespuestaFirmarOrden(boolean Exito, String Mensaje) {
        this.Exito = Exito;
        this.Mensaje = Mensaje;
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
