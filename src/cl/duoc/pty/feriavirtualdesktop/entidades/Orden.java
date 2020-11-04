/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.util.Date;

/**
 *
 * @author s1mu2
 */
public class Orden {
        private int IdOrden;
        private Date FechaOrden;
        private boolean FirmaContrato;
        private Date FechaFirmaContrato;
        private String Estado;
        private double PrecioVenta;
        private int IdClienteExterno;
        private int IdClienteInterno;
        //private List<DetalleOrden> DetalleOrden;

    public Orden(int IdOrden, Date FechaOrden, boolean FirmaContrato, Date FechaFirmaContrato, String Estado, double PrecioVenta, int IdClienteExterno, int IdClienteInterno) {
        this.IdOrden = IdOrden;
        this.FechaOrden = FechaOrden;
        this.FirmaContrato = FirmaContrato;
        this.FechaFirmaContrato = FechaFirmaContrato;
        this.Estado = Estado;
        this.PrecioVenta = PrecioVenta;
        this.IdClienteExterno = IdClienteExterno;
        this.IdClienteInterno = IdClienteInterno;
    }

    public int getIdOrden() {
        return IdOrden;
    }

    public void setIdOrden(int IdOrden) {
        this.IdOrden = IdOrden;
    }

    public Date getFechaOrden() {
        return FechaOrden;
    }

    public void setFechaOrden(Date FechaOrden) {
        this.FechaOrden = FechaOrden;
    }

    public boolean getFirmaContrato() {
        return FirmaContrato;
    }

    public void setFirmaContrato(boolean FirmaContrato) {
        this.FirmaContrato = FirmaContrato;
    }

    public Date getFechaFirmaContrato() {
        return FechaFirmaContrato;
    }

    public void setFechaFirmaContrato(Date FechaFirmaContrato) {
        this.FechaFirmaContrato = FechaFirmaContrato;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public int getIdClienteExterno() {
        return IdClienteExterno;
    }

    public void setIdClienteExterno(int IdClienteExterno) {
        this.IdClienteExterno = IdClienteExterno;
    }

    public int getIdClienteInterno() {
        return IdClienteInterno;
    }

    public void setIdClienteInterno(int IdClienteInterno) {
        this.IdClienteInterno = IdClienteInterno;
    }
    
        
    
    
}
