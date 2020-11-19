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
 * @author bruunildo
 */
public class Categoria {
    private int IdCategoria;
    private String NombreCategoria;
    private String NombreIngles;
    private String Descripcion;
    private String DescripcionIngles;
    private boolean Estado;
    private Date FechaCreacion;
    private Date FechaModificacion;
    private int IdUsuario;

    public Categoria() {
    }

    public Categoria(int IdCategoria, String NombreCategoria, String NombreIngles, String Descripcion, String DescripcionIngles, boolean Estado, Date FechaCreacion, Date FechaModificacion, int IdUsuario,List<DetalleCategoria> DetalleCategoria) {
        this.IdCategoria = IdCategoria;
        this.NombreCategoria = NombreCategoria;
        this.NombreIngles = NombreIngles;
        this.Descripcion = Descripcion;
        this.DescripcionIngles = DescripcionIngles;
        this.Estado = Estado;
        this.FechaCreacion = FechaCreacion;
        this.FechaModificacion = FechaModificacion;
        this.IdUsuario = IdUsuario;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }

    public String getNombreCategoriaIngles() {
        return NombreIngles;
    }

    public void setNombreCategoriaIngles(String NombreCategoriaIngles) {
        this.NombreIngles = NombreCategoriaIngles;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescripcionIngles() {
        return DescripcionIngles;
    }

    public void setDescripcionIngles(String DescripcionIngles) {
        this.DescripcionIngles = DescripcionIngles;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public Date getFechaModificacion() {
        return FechaModificacion;
    }

    public void setFechaModificacion(Date FechaModificacion) {
        this.FechaModificacion = FechaModificacion;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }


}
