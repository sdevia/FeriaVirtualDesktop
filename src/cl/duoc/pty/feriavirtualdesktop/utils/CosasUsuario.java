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
public class CosasUsuario {
    
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
    
    public static int perfilUsuarioInt(String idperfil){
            int nombrePerfil=0;
            
            switch (idperfil) {
                case "Administrador": {
                    nombrePerfil=1;
                    break;
                }
                case "Productor": {
                    nombrePerfil=2;
                    break;
                }
                case "Cliente Externo": {
                    nombrePerfil=3;
                    break;
                }
                case "Cliente Interno": {
                    nombrePerfil=4;
                    break;
                }
                case "Transportista": {
                    nombrePerfil=5;
                    break;
                }
                case "Consultor": {
                    nombrePerfil=6;
                    break;
                }

            }
            return nombrePerfil;
    }
}
