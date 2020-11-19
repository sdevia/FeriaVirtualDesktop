/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.utils;

/**
 *
 * @author s1mu2
 */
public class perfilUsuario {
    
/**
 * Convierte un ID de Usario en Un String con la descripcion
 * @param idperfil
 * @return 
 */    
    
    public static String perfilUsuarioString(int idperfil){
            String nombrePerfil="";
            
            switch (idperfil) {
                case 1: {
                    nombrePerfil="Administrador";
                    break;
                }
                case 2: {
                    nombrePerfil="Productor";
                    break;
                }
                case 3: {
                    nombrePerfil="Cliente Externo";
                    break;
                }
                case 4: {
                    nombrePerfil="Cliente Interno";
                    break;
                }
                case 5: {
                    nombrePerfil="Transportista";
                    break;
                }
                case 6: {
                    nombrePerfil="Consultor";
                    break;
                }

            }
            return nombrePerfil;
    }
    
    
    /**
     * Convierte la descripcion de un susuario en un int como ID de Perfil
     * @param idperfil
     * @return 
     */
    public static int perfilUsuarioInt(String idperfil){
            int idPerfil=0;
            
            switch (idperfil) {
                case "Administrador": {
                    idPerfil=1;
                    break;
                }
                case "Productor": {
                    idPerfil=2;
                    break;
                }
                case "Cliente Externo": {
                    idPerfil=3;
                    break;
                }
                case "Cliente Interno": {
                    idPerfil=4;
                    break;
                }
                case "Transportista": {
                    idPerfil=5;
                    break;
                }
                case "Consultor": {
                    idPerfil=6;
                    break;
                }

            }
            return idPerfil;
    }
}
