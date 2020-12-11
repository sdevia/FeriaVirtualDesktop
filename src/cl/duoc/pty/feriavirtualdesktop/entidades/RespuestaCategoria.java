/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

/**
 *
 * @author Javier
 */
public class RespuestaCategoria {

    private boolean Exito;
    private String Mensaje;
    private Proceso Proceso;

    public RespuestaCategoria() {
    }

    public RespuestaCategoria(boolean Exito, String Mensaje, Proceso Proceso) {
        this.Exito = Exito;
        this.Mensaje = Mensaje;
        this.Proceso = Proceso;
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

    public Proceso getProceso() {
        return Proceso;
    }

    public void setProceso(Proceso Proceso) {
        this.Proceso = Proceso;
    }

}
