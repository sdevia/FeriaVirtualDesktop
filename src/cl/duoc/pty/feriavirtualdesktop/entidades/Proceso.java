/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.util.Date;

/**
 *
 * @author Administrator
 */
public class Proceso {
    private int IdProceso;
    private int Comision;
    private int ValorAduana;
    private int PagoPorServicio;
    private int PagoTransportista;
    private Date FechaProceso;
    private Date FechaFinProceso;
    private String EstadoProceso;
    private int IdOrden;
    private int IdUsuario;
    private Date FechaMaxSubasta;
    
    public Proceso() {
        
    }

    public Proceso(int IdProceso, int Comision, int ValorAduana, int PagoPorServicio, int PagoTransportista, Date FechaProceso, Date FechaFinProceso, String EstadoProceso, int IdOrden, int IdUsuario, Date FechaMaxSubasta) {
        this.IdProceso = IdProceso;
        this.Comision = Comision;
        this.ValorAduana = ValorAduana;
        this.PagoPorServicio = PagoPorServicio;
        this.PagoTransportista = PagoTransportista;
        this.FechaProceso = FechaProceso;
        this.FechaFinProceso = FechaFinProceso;
        this.EstadoProceso = EstadoProceso;
        this.IdOrden = IdOrden;
        this.IdUsuario = IdUsuario;
        this.FechaMaxSubasta = FechaMaxSubasta;
    }

    public int getIdProceso() {
        return IdProceso;
    }

    public void setIdProceso(int IdProceso) {
        this.IdProceso = IdProceso;
    }

    public int getComision() {
        return Comision;
    }

    public void setComision(int Comision) {
        this.Comision = Comision;
    }

    public int getValorAduana() {
        return ValorAduana;
    }

    public void setValorAduana(int ValorAduana) {
        this.ValorAduana = ValorAduana;
    }

    public int getPagoPorServicio() {
        return PagoPorServicio;
    }

    public void setPagoPorServicio(int PagoPorServicio) {
        this.PagoPorServicio = PagoPorServicio;
    }

    public int getPagoTransportista() {
        return PagoTransportista;
    }

    public void setPagoTransportista(int PagoTransportista) {
        this.PagoTransportista = PagoTransportista;
    }

    public Date getFechaProceso() {
        return FechaProceso;
    }

    public void setFechaProceso(Date FechaProceso) {
        this.FechaProceso = FechaProceso;
    }

    public Date getFechaFinProceso() {
        return FechaFinProceso;
    }

    public void setFechaFinProceso(Date FechaFinProceso) {
        this.FechaFinProceso = FechaFinProceso;
    }

    public String getEstadoProceso() {
        return EstadoProceso;
    }

    public void setEstadoProceso(String EstadoProceso) {
        this.EstadoProceso = EstadoProceso;
    }

    public int getIdOrden() {
        return IdOrden;
    }

    public void setIdOrden(int IdOrden) {
        this.IdOrden = IdOrden;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    
     public Date getFechaMaxSubasta() {
        return FechaMaxSubasta;
    }

    public void setFechaMaxSubasta(Date FechaMaxSubasta) {
        this.FechaMaxSubasta = FechaMaxSubasta;
    }
    
    
}

