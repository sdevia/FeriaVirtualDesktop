/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.negocio;

import cl.duoc.pty.feriavirtualdesktop.entidades.Administrador;
import cl.duoc.pty.feriavirtualdesktop.entidades.ListaUsuario;
import cl.duoc.pty.feriavirtualdesktop.entidades.Login;
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

    public static ListaUsuario buscarUsuario(String idPerfil, String idSession, String servicio){
        
        ListaUsuario listaUsuario = new ListaUsuario();

         try {

            //Aqui ponemos loginca para conectarnos a la api
            TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }

                public void checkClientTrusted(X509Certificate[] certs, String authType) {
                }

                public void checkServerTrusted(X509Certificate[] certs, String authType) {
                }

            }};
            SSLContext sc = SSLContext.getInstance("SSL");
            sc.init(null, trustAllCerts, new java.security.SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
            // Create all-trusting host name verifier
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };
            // Install the all-trusting host verifier
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
            /* End of the fix*/

            URL url = new URL("https://localhost:44302/api/usuario/perfil?idperfil=0&idSession=d1aabe67-35eb-4f57-bd2b-378082e0b3b2&servicio=FRT");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            //conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/json;charset=UTF-16");
            conn.setRequestMethod("GET");
            //conn.setRequestProperty("Accept", "application/json");
            //String jsonInputString = "{idperfil: \"" + idPerfil + "\", idSession: \"" + idSession + "\", servicio: \"" + servicio +"\"}";
//            System.out.println(">>>" + jsonInputString);
//            try (OutputStream os = conn.getOutputStream()) {
//                byte[] input = jsonInputString.getBytes("UTF-16");
//                os.write(input, 0, input.length);
//            }
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream(), "UTF-16");
            BufferedReader br = new BufferedReader(in);

            StringBuilder data = new StringBuilder();
            String output;
            while ((output = br.readLine()) != null) {
                data.append(output + '\n');         
            }

            

           
            Gson g = new Gson();
            //String jsonString = g.toJson(Usuarios);
            listaUsuario = g.fromJson(data.toString(), ListaUsuario.class);

            if (listaUsuario != null) {
                if(listaUsuario.isExito()){
                    return listaUsuario;         
                }

            } 
            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }
        
        return null;
    }

}
