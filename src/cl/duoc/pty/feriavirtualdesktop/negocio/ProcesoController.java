/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.negocio;

import cl.duoc.pty.feriavirtualdesktop.entidades.Parametro;
import cl.duoc.pty.feriavirtualdesktop.entidades.Proceso;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaProceso;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaProcesoListar;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ProcesoController {
    
    public static RespuestaProcesoListar listarProceso() {

        RespuestaProcesoListar listaProceso = new RespuestaProcesoListar();

        try {

            ApiController servicioApi = new ApiController();
            List<Parametro> parametros = new ArrayList<Parametro>();
            String resultado = "";
            //Gson g = new Gson();
            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
            
            parametros.add(new Parametro("idSession", "session"));
            resultado = servicioApi.Get("Admin/Proceso/Listar", parametros);

            listaProceso = g.fromJson(resultado, RespuestaProcesoListar.class);
                if (listaProceso != null) {
                    if (listaProceso.isExito()) {

                       /* List<Orden> ordenes = new ArrayList<Orden>();
                        ordenes.add(orden.getOrden());
                        listaOrden.setOrdenes(ordenes);*/
                        return listaProceso;
                    }
                }

        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }

        return listaProceso;
    }
    
    public static RespuestaProceso crearModificarProceso(Proceso proceso) {
        RespuestaProceso creaProceso = new RespuestaProceso();
        
        try {
            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
            String jsonInputString = g.toJson(proceso);//"{Rut: \"" + login.getRut() + "\", Clave: \"" + login.getClave() + "\", TipoPerfil: 1}";
            //String jsonString = g.toJson(login);
            List<Parametro> parametros = new ArrayList<Parametro>();
            parametros.add(new Parametro("idSession", "session"));
            String resultado = new ApiController().Post("Admin/Proceso", jsonInputString, parametros);
            //String jsonString = g.toJson(admin);
            creaProceso = g.fromJson(resultado, RespuestaProceso.class);
            
            
        } catch (Exception e) {
            System.out.println("No fue posible crear el proceso " + e);
        }
                
        return creaProceso;
    }
}
