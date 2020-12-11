/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

/**
 *
 * @author Eduardo
 */
public class RespuestaSubasta {

    private boolean Exito;
    private String Mensaje;
    private Subasta Subasta;

    public RespuestaSubasta() {
    }

    public RespuestaSubasta(boolean Exito, String Mensaje, Subasta Subasta) {
        this.Exito = Exito;
        this.Mensaje = Mensaje;
        this.Subasta = Subasta;
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

    public Subasta getSubasta() {
        return Subasta;
    }

    public void setSubasta(Subasta Subasta) {
        this.Subasta = Subasta;
    }

}
