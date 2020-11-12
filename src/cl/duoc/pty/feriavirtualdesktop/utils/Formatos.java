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
public class Formatos {

    public static String PrimeraMayuscula(String frase) {

        frase = frase.substring(0, 1).toUpperCase() + frase.substring(1);

        char[] cfr = frase.toCharArray();

        for (int i = 0; i < cfr.length; i++) {

            if (cfr[i] == ' ' || cfr[i] == '.' || cfr[i] == ',') {

                cfr[i + 1] = Character.toUpperCase(cfr[i + 1]);

                frase = String.copyValueOf(cfr);
            }

            System.out.print(cfr[i]);
        }
        return frase;
    }

}
