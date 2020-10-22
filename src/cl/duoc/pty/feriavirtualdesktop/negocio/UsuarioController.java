/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.negocio;

import cl.duoc.pty.feriavirtualdesktop.entidades.Administrador;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaUsuarioListar;
import cl.duoc.pty.feriavirtualdesktop.entidades.Login;
import cl.duoc.pty.feriavirtualdesktop.entidades.Parametro;
import cl.duoc.pty.feriavirtualdesktop.entidades.Usuario;
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
import java.util.List;

/**
 *
 * @author s1mu2
 */
public class UsuarioController {

    public static RespuestaUsuarioListar buscarUsuario(String idPerfil, String idSession, String servicio){
        
        RespuestaUsuarioListar listaUsuario = new RespuestaUsuarioListar();

         try {

            ApiController servicioApi= new ApiController();
            List<Parametro> parametros = new ArrayList<Parametro>();
            parametros.add(new Parametro("idperfil","0"));
            parametros.add(new Parametro("idSession","session"));
            parametros.add(new Parametro("servicio","FRT"));
            String resultado = servicioApi.Get("usuario/perfil", parametros);

           if (resultado == null){
               
               listaUsuario.setExito(false);
               listaUsuario.setMensaje("No fue posbible traer los datos");
               return listaUsuario;
               
               
           }
            Gson g = new Gson();
            //String jsonString = g.toJson(Usuarios);
            listaUsuario = g.fromJson(resultado, RespuestaUsuarioListar.class);

            if (listaUsuario != null) {
                if(listaUsuario.isExito()){
                    return listaUsuario;
                    
                }

            } 
           // conn.disconnect();

        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }
        
        return null;
    }

}
