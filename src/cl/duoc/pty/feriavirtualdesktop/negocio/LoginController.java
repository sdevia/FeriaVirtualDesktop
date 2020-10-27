/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.negocio;

import cl.duoc.pty.feriavirtualdesktop.entidades.Administrador;
import cl.duoc.pty.feriavirtualdesktop.entidades.Login;
import cl.duoc.pty.feriavirtualdesktop.entidades.Parametro;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import com.google.gson.Gson;
import java.util.ArrayList;

/**
 *
 * @author s1mu2
 */
public class LoginController {

    public static Administrador login(Login login) {

        boolean accesoCorrecto = false;
        Administrador admin = new Administrador();
        
        try {

            Gson g = new Gson();
            String jsonInputString = g.toJson(login);//"{Rut: \"" + login.getRut() + "\", Clave: \"" + login.getClave() + "\", TipoPerfil: 1}";
            //String jsonString = g.toJson(login);
            String resultado = new ApiController().Post("login", jsonInputString, new ArrayList<Parametro>());
            //String jsonString = g.toJson(admin);
            admin = g.fromJson(resultado, Administrador.class);

            if (admin != null) {
                if(admin.isExito()){
                    accesoCorrecto = true;         
                }

            } 
            //conn.disconnect();

        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }

        return admin;
    }

}
