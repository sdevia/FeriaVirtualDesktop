/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.util.Date;

/**
 *
 * @author Eduardo
 */
public class DetalleSubasta {

    private int IdDetalle;
    private int MontoOferta;
    private Date Fecha;
    private String Estado;
    private int IdSubasta;
    private int IdUsuario;

    public DetalleSubasta() {
        Estado = "EN_PROCESO";
    }

    public int getIdDetalle() {
        return IdDetalle;
    }

    public void setIdDetalle(int IdDetalle) {
        this.IdDetalle = IdDetalle;
    }

    public int getMontoOferta() {
        return MontoOferta;
    }

    public void setMontoOferta(int MontoOferta) {
        this.MontoOferta = MontoOferta;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public int getIdSubasta() {
        return IdSubasta;
    }

    public void setIdSubasta(int IdSubasta) {
        this.IdSubasta = IdSubasta;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

}
