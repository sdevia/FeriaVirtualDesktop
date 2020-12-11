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
public class RespuestaOrden {

    private boolean Exito;
    private String Mensaje;
    private Orden Orden;

    public RespuestaOrden() {

    }

    public RespuestaOrden(boolean Exito, String Mensaje, Orden Orden) {
        this.Exito = Exito;
        this.Mensaje = Mensaje;
        this.Orden = Orden;
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

    public Orden getOrden() {
        return Orden;
    }

    public void setOrden(Orden Orden) {
        this.Orden = Orden;
    }

}
