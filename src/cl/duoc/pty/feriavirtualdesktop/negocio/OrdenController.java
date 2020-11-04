/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.negocio;

import cl.duoc.pty.feriavirtualdesktop.entidades.Parametro;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaOrdenListar;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class OrdenController {
    
    public static RespuestaOrdenListar listarOrden() {

        RespuestaOrdenListar listaOrden = new RespuestaOrdenListar();

        try {

            ApiController servicioApi = new ApiController();
            List<Parametro> parametros = new ArrayList<Parametro>();
            String resultado = "";
            //Gson g = new Gson();
            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
            
            parametros.add(new Parametro("idSession", "session"));
            resultado = servicioApi.Get("orden/Listar", parametros);

            listaOrden = g.fromJson(resultado, RespuestaOrdenListar.class);
                if (listaOrden != null) {
                    if (listaOrden.isExito()) {

                       /* List<Orden> ordenes = new ArrayList<Orden>();
                        ordenes.add(orden.getOrden());
                        listaOrden.setOrdenes(ordenes);*/
                        return listaOrden;
                    }
                }
            //Si 

            //Validar si el campo idUsuario no está vacio o que no sea nulo
           /* if (idUsuario != null && !idUsuario.isEmpty()) {
                parametros.add(new Parametro("idSession", "session"));
                resultado = servicioApi.Get("orden/Listar", parametros);

                orden = g.fromJson(resultado, RespuestaOrden.class);
                if (orden != null) {
                    if (orden.isExito()) {

                        List<Orden> ordenes = new ArrayList<Orden>();
                        ordenes.add(orden.getOrden());
                        listaOrden.setOrdenes(ordenes);
                        return listaOrden;
                    }
                }

            } else {
                parametros.add(new Parametro("idperfil", "0"));
                parametros.add(new Parametro("idSession", "session"));
                parametros.add(new Parametro("servicio", "FRT"));
                resultado = servicioApi.Get("usuario/perfil", parametros);

                listaUsuario = g.fromJson(resultado, RespuestaUsuarioListar.class);
                if (listaUsuario != null) {
                    if (listaUsuario.isExito()) {
                        return listaUsuario;

                    }
                }
            }  // conn.disconnect();

            if (resultado == null) {
                listaUsuario.setExito(false);
                listaUsuario.setMensaje("No fue posbible traer los datos");
                return listaUsuario;
            }*/

        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }

        return listaOrden;
    }
}
