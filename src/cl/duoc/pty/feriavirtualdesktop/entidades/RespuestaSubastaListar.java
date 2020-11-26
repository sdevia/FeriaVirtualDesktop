/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.util.List;

/**
 *
 * @author Eduardo
 */
public class RespuestaSubastaListar {
    private boolean Exito;
    private String Mensaje;
    private List<Subasta> Subastas;

    public RespuestaSubastaListar() {
    }

    public RespuestaSubastaListar(boolean Exito, String Mensaje, List<Subasta> Subastas) {
        this.Exito = Exito;
        this.Mensaje = Mensaje;
        this.Subastas = Subastas;
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

    public List<Subasta> getSubastas() {
        return Subastas;
    }

    public void setSubastas(List<Subasta> Subastas) {
        this.Subastas = Subastas;
    }
    
    
}
