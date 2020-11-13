/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author s1mu2
 */
public class Usuario {

    private int IdUsuario;
    private String Rut;
    private String Nombre;
    private String Apellido;
    private String Email;
    private boolean Estado;
    private String Activo;
    private String Direccion;
    private String Clave;
    private int Intentos;
    private boolean CambiaClave;
    private String FechaCreacion;
    private String FechaModificacion;
    private String IdPerfil;
    private String Telefono;
    private String ReClave;
    private String SesionId;
    private String EstadoEdit;

    public Usuario() {
    }

    public Usuario(int IdUsuario, String Rut, String Nombre, String Apellido, String Email, boolean Estado, String Activo, String Direccion, String Clave, int Intentos, boolean CambiaClave, String FechaCreacion, String FechaModificacion, String IdPerfil, String Telefono, String ReClave, String SesionId, String EstadoEdit) {
        this.IdUsuario = IdUsuario;
        this.Rut = Rut;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Email = Email;
        this.Estado = Estado;
        this.Activo = Activo;
        this.Direccion = Direccion;
        this.Clave = Clave;
        this.Intentos = Intentos;
        this.CambiaClave = CambiaClave;
        this.FechaCreacion = FechaCreacion;
        this.FechaModificacion = FechaModificacion;
        this.IdPerfil = IdPerfil;
        this.Telefono = Telefono;
        this.ReClave = ReClave;
        this.SesionId = SesionId;
        this.EstadoEdit = EstadoEdit;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public String getActivo() {
        return Activo;
    }

    public void setActivo(String Activo) {
        this.Activo = Activo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public int getIntentos() {
        return Intentos;
    }

    public void setIntentos(int Intentos) {
        this.Intentos = Intentos;
    }

    public boolean isCambiaClave() {
        return CambiaClave;
    }

    public void setCambiaClave(boolean CambiaClave) {
        this.CambiaClave = CambiaClave;
    }

    public String getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(String FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public String getFechaModificacion() {
        return FechaModificacion;
    }

    public void setFechaModificacion(String FechaModificacion) {
        this.FechaModificacion = FechaModificacion;
    }

    public String getIdPerfil() {
        return IdPerfil;
    }

    public void setIdPerfil(String IdPerfil) {
        this.IdPerfil = IdPerfil;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getReClave() {
        return ReClave;
    }

    public void setReClave(String ReClave) {
        this.ReClave = ReClave;
    }

    public String getSesionId() {
        return SesionId;
    }

    public void setSesionId(String SesionId) {
        this.SesionId = SesionId;
    }

    public String getEstadoEdit() {
        return EstadoEdit;
    }

    public void setEstadoEdit(String EstadoEdit) {
        this.EstadoEdit = EstadoEdit;
    }

}