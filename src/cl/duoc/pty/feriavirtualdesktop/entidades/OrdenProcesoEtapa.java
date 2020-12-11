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
public class OrdenProcesoEtapa {

    private int IdOrden;
    private Date FechaOrden;
    private boolean FirmaContrato;
    private Date FechaFirmaContrato;
    private String Estado;
    private double PrecioVenta;
    private int IdClienteExterno;
    private int IdClienteInterno;
    private List<DetalleOrden> DetalleOrden;
    private int IdProceso;
    private int Comision;
    private int ValorAduana;
    private int PagoPorServicio;
    private int PagoTransportista;
    private Date FechaProceso;
    private Date FechaFinProceso;
    private String EstadoProceso;
    private int IdUsuario;
    private int IdEtapa;
    private String EstadoEtapa;
    private Date FechaEtapa;
    private String Observacion;

    public OrdenProcesoEtapa() {
    }

    public OrdenProcesoEtapa(int IdOrden, Date FechaOrden, boolean FirmaContrato, Date FechaFirmaContrato, String Estado, double PrecioVenta, int IdClienteExterno, int IdClienteInterno, List<DetalleOrden> DetalleOrden, int IdProceso, int Comision, int ValorAduana, int PagoPorServicio, int PagoTransportista, Date FechaProceso, Date FechaFinProceso, String EstadoProceso, int IdUsuario, int IdEtapa, String EstadoEtapa, Date FechaEtapa, String Observacion) {
        this.IdOrden = IdOrden;
        this.FechaOrden = FechaOrden;
        this.FirmaContrato = FirmaContrato;
        this.FechaFirmaContrato = FechaFirmaContrato;
        this.Estado = Estado;
        this.PrecioVenta = PrecioVenta;
        this.IdClienteExterno = IdClienteExterno;
        this.IdClienteInterno = IdClienteInterno;
        this.DetalleOrden = DetalleOrden;
        this.IdProceso = IdProceso;
        this.Comision = Comision;
        this.ValorAduana = ValorAduana;
        this.PagoPorServicio = PagoPorServicio;
        this.PagoTransportista = PagoTransportista;
        this.FechaProceso = FechaProceso;
        this.FechaFinProceso = FechaFinProceso;
        this.EstadoProceso = EstadoProceso;
        this.IdUsuario = IdUsuario;
        this.IdEtapa = IdEtapa;
        this.EstadoEtapa = EstadoEtapa;
        this.FechaEtapa = FechaEtapa;
        this.Observacion = Observacion;
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

    public boolean isFirmaContrato() {
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

    public List<DetalleOrden> getDetalleOrden() {
        return DetalleOrden;
    }

    public void setDetalleOrden(List<DetalleOrden> DetalleOrden) {
        this.DetalleOrden = DetalleOrden;
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

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public int getIdEtapa() {
        return IdEtapa;
    }

    public void setIdEtapa(int IdEtapa) {
        this.IdEtapa = IdEtapa;
    }

    public String getEstadoEtapa() {
        return EstadoEtapa;
    }

    public void setEstadoEtapa(String EstadoEtapa) {
        this.EstadoEtapa = EstadoEtapa;
    }

    public Date getFechaEtapa() {
        return FechaEtapa;
    }

    public void setFechaEtapa(Date FechaEtapa) {
        this.FechaEtapa = FechaEtapa;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

}
