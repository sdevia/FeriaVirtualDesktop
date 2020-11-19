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
public class RespuestaCategoriaListar {
    private boolean Exito;
    private String Mensaje;
    private List<Categoria> Categorias;

    public RespuestaCategoriaListar() {
    }

    public RespuestaCategoriaListar(boolean Exito, String Mensaje, List<Categoria> Categorias) {
        this.Exito = Exito;
        this.Mensaje = Mensaje;
        this.Categorias = Categorias;
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

    public List<Categoria> getCategorias() {
        return Categorias;
    }

    public void setCategorias(List<Categoria> Categorias) {
        this.Categorias = Categorias;
    }
    
    
    
}
