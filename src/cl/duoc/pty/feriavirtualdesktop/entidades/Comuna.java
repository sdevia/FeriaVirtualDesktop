/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

/**
 *
 * @author s1mu2
 */
public class Comuna {
    private int IdComuna;
    private int IdRegion;
    private int CodigoComuna;
    private String NombreComuna;
    private String NombreCiudad;
    private String NombreRegion;

    public Comuna() {
    }

    public Comuna(int IdComuna, int IdRegion, int CodigoComuna, String NombreComuna, String NombreCiudad, String NombreRegion) {
        this.IdComuna = IdComuna;
        this.IdRegion = IdRegion;
        this.CodigoComuna = CodigoComuna;
        this.NombreComuna = NombreComuna;
        this.NombreCiudad = NombreCiudad;
        this.NombreRegion = NombreRegion;
    }

    public int getIdComuna() {
        return IdComuna;
    }

    public void setIdComuna(int IdComuna) {
        this.IdComuna = IdComuna;
    }

    public int getIdRegion() {
        return IdRegion;
    }

    public void setIdRegion(int IdRegion) {
        this.IdRegion = IdRegion;
    }

    public int getCodigoComuna() {
        return CodigoComuna;
    }

    public void setCodigoComuna(int CodigoComuna) {
        this.CodigoComuna = CodigoComuna;
    }

    public String getNombreComuna() {
        return NombreComuna;
    }

    public void setNombreComuna(String NombreComuna) {
        this.NombreComuna = NombreComuna;
    }

    public String getNombreCiudad() {
        return NombreCiudad;
    }

    public void setNombreCiudad(String NombreCiudad) {
        this.NombreCiudad = NombreCiudad;
    }

    public String getNombreRegion() {
        return NombreRegion;
    }

    public void setNombreRegion(String NombreRegion) {
        this.NombreRegion = NombreRegion;
    }
    
    
}
