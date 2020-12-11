/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.util.List;

/**
 *
 * @author Katherine
 */
public class RespuestaProcesoListar {

    private boolean Exito;
    private String Mensaje;
    private List<Proceso> Procesos;

    public RespuestaProcesoListar() {

    }

    public RespuestaProcesoListar(boolean Exito, String Mensaje, List<Proceso> Procesos) {
        this.Exito = Exito;
        this.Mensaje = Mensaje;
        this.Procesos = Procesos;
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

    public List<Proceso> getProcesos() {
        return Procesos;
    }

    public void setProcesos(List<Proceso> Procesos) {
        this.Procesos = Procesos;
    }

}
