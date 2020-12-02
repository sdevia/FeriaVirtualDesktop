/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author s1mu2
 */
public class FormatoString {

    /**
     * Método para mostrar texto con la primera mayúscula
     * @param frase
     * @return 
     */
    public static String PrimeraMayuscula(String frase) {
        frase = frase.substring(0, 1).toUpperCase() + frase.substring(1);
        char[] cfr = frase.toCharArray();
        for (int i = 0; i < cfr.length; i++) {
            if (cfr[i] == ' ' || cfr[i] == '.' || cfr[i] == ',') {
                cfr[i + 1] = Character.toUpperCase(cfr[i + 1]);
                frase = String.copyValueOf(cfr);
            }
        }
        return frase;
    }

    /**
     * Método que valida que solo se digitaron letras
     * @param cadena
     * @return 
     */
    public static boolean SoloLetras(String cadena) {
        cadena = cadena;
        char[] cfr = cadena.toCharArray();
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.toUpperCase().charAt(i);
            int valorASCII = (int) caracter;
            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90) && valorASCII != 32) {
                return false;
            }
        }
        return true;
    }

    /**
     * Da formato a la fecha que se mostrará
     *
     * @param fecha
     * @return
     */
    public static String FechasFormato(String fecha) {
        String anno = fecha.substring(0, 4);
        String mes = fecha.substring(5, 7);
        String dia = fecha.substring(8, 10);
        String fechaFormateada = dia + "-" + mes + "-" + anno;
        return fechaFormateada;
    }

    /**
     * Da formato al número telefónico que se mostrará
     *
     * @param fono
     * @return
     */
    public static String fonoFormato(String fono) {
        String codigo = fono.substring(0, 2);
        String numero = fono.substring(3);
        String fonoformateado = "+" + codigo + " " + numero;
        return fonoformateado;
    }

    /**
     * Valida que el Email está escrito correctamente
     *
     * @param email
     * @return
     */
    public static boolean validaEmail(String email) {
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(email);
        if (mather.find() == true) {
            return true;
        } else {
            return false;
        }
    }
}
