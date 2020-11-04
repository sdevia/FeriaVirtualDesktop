/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.util.List;

/**
 *
 * @author bruunildo
 */
public class RespuestaOrdenListar {
    private boolean Exito;
    private String Mensaje;
    private List<Orden> Ordenes;

    public RespuestaOrdenListar(boolean Exito, String Mensaje, List<Orden> Ordenes) {
        this.Exito = Exito;
        this.Mensaje = Mensaje;
        this.Ordenes = Ordenes;
    }

    public RespuestaOrdenListar() {
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

    public List<Orden> getOrdenes() {
        return Ordenes;
    }

    public void setOrdenes(List<Orden> Ordenes) {
        this.Ordenes = Ordenes;
    }

    
    
    
}
