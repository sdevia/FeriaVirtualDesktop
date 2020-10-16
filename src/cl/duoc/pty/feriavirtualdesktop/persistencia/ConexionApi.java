/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.persistencia;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.security.cert.X509Certificate;
/**
 *
 * @author s1mu2
 */
public class ConexionApi {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws Exception {
        // TODO code application logic here
        TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
               public java.security.cert.X509Certificate[] getAcceptedIssuers() { return null; }
               public void checkClientTrusted(X509Certificate[] certs, String authType) { }
               public void checkServerTrusted(X509Certificate[] certs, String authType) { }

        }};
        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        // Create all-trusting host name verifier
        HostnameVerifier allHostsValid = new HostnameVerifier() {
            public boolean verify(String hostname, SSLSession session) { return true; }
        };
        // Install the all-trusting host verifier
        HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);
        /* End of the fix*/
           
        try {
            URL url = new URL("https://localhost:44302/api/region/13");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();

        }
        catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
       
        /*POST*/
        try {
            URL url = new URL("https://localhost:44302/api/login");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            //conn.setDoInput(true);
            conn.setRequestProperty("Content-Type", "application/json;charset=UTF-16");
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");
            String jsonInputString = "{Rut: \"15538372-0\", Clave: \"12345a\", TipoPerfil: 1}";
            try(OutputStream os = conn.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("UTF-16");
                os.write(input, 0, input.length);
            }
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream(), "UTF-16");
            BufferedReader br = new BufferedReader(in);
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();

        }
        catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
       
       
       
       
    }
   
}
