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
    
    public static boolean SoloLetras(String cadena) {

        cadena = cadena;

        char[] cfr = cadena.toCharArray();

        for (int i = 0; i < cadena.length(); i++)
		{
			char caracter = cadena.toUpperCase().charAt(i);
			int valorASCII = (int)caracter;
			if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90) && valorASCII !=32 )
				return false;
		}
 
	return true;
    }

}
