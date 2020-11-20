/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.negocio;

import cl.duoc.pty.feriavirtualdesktop.entidades.Parametro;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaUsuarioListar;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 *
 * @author s1mu2
 */
public class ApiController {

    private String urlApi = "https://localhost:44302/api/";

    public String Get(String recurso) {
        List<Parametro> parametros = new ArrayList<Parametro>();
        return Get(recurso, parametros);
    }

    public String Get(String recurso, List<Parametro> parametros) {

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
            HostnameVerifier allHostsValid = new HostnameVerifier() {
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            };
            HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
            String param = "?";
            for (final Parametro myparam : parametros) {
                param += myparam.Name + "=" + myparam.Value+"&";
            }
            URL url = new URL(urlApi + recurso+param);//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestProperty("Content-Type", "application/json;charset=UTF-16");
            conn.setRequestMethod("GET");

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

            
            conn.disconnect();
            return data.toString();
        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }
        return null;
    }

    // Todo lo del get y el post aca.
    public String Post(String recurso, String objetoJson, List<Parametro> parametros) {

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
            String param = "?";
            for (final Parametro myparam : parametros) {
                param += myparam.Name + "=" + myparam.Value+"&";
            }
            URL url = new URL(urlApi + recurso+param);//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            //conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/json;charset=UTF-16");
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");
            //String jsonInputString = "{Rut: \"" + login.getRut() + "\", Clave: \"" + login.getClave() + "\", TipoPerfil: 1}";            
            String jsonInputString = objetoJson;
            if (objetoJson.length()!=0){
                try (OutputStream os = conn.getOutputStream()) {
                    byte[] input = jsonInputString.getBytes("UTF-16");
                    os.write(input, 0, input.length);
                }
            }
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
            
            conn.disconnect();
            return data.toString();
        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }
        return null;
    }
}
