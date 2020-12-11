/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class Subasta {

    private int IdSubasta;
    private Date FechaSubasta;
    private Date FechaTermino;
    private boolean Estado;
    private int IdProceso;
    private List<DetalleSubasta> DetalleSubasta;

    public Subasta() {
    }

    public Subasta(int IdSubasta, Date FechaSubasta, Date FechaTermino, boolean Estado, int IdProceso, List<DetalleSubasta> DetalleSubasta) {
        this.IdSubasta = IdSubasta;
        this.FechaSubasta = FechaSubasta;
        this.FechaTermino = FechaTermino;
        this.Estado = Estado;
        this.IdProceso = IdProceso;
        this.DetalleSubasta = DetalleSubasta;
    }

    public int getIdSubasta() {
        return IdSubasta;
    }

    public void setIdSubasta(int IdSubasta) {
        this.IdSubasta = IdSubasta;
    }

    public Date getFechaSubasta() {
        return FechaSubasta;
    }

    public void setFechaSubasta(Date FechaSubasta) {
        this.FechaSubasta = FechaSubasta;
    }

    public Date getFechaTermino() {
        return FechaTermino;
    }

    public void setFechaTermino(Date FechaTermino) {
        this.FechaTermino = FechaTermino;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public int getIdProceso() {
        return IdProceso;
    }

    public void setIdProceso(int IdProceso) {
        this.IdProceso = IdProceso;
    }

    public List<DetalleSubasta> getDetalleSubasta() {
        return DetalleSubasta;
    }

    public void setDetalleSubasta(List<DetalleSubasta> DetalleSubasta) {
        this.DetalleSubasta = DetalleSubasta;
    }

}
