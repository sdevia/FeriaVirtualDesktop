/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.negocio;

import cl.duoc.pty.feriavirtualdesktop.entidades.Parametro;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaFirmarOrden;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaOrden;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaOrdenListar;
import cl.duoc.pty.feriavirtualdesktop.grafica.VistaGeneralAdministrador;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Katherine
 */
public class OrdenController {

    public static RespuestaOrdenListar listarOrden() {

        RespuestaOrdenListar listaOrden = new RespuestaOrdenListar();

        try {

            ApiController servicioApi = new ApiController();
            List<Parametro> parametros = new ArrayList<Parametro>();
            String resultado = "";
            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

            parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
            resultado = servicioApi.Get("orden/Listar", parametros);

            listaOrden = g.fromJson(resultado, RespuestaOrdenListar.class);
            if (listaOrden != null) {
                if (listaOrden.isExito()) {

                    return listaOrden;
                }
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }

        return listaOrden;
    }

    public static RespuestaFirmarOrden firmarOrden(String idOrden) {
        RespuestaFirmarOrden firmaOrden = new RespuestaFirmarOrden();

        try {
            Gson g = new Gson();
            String jsonInputString = g.toJson(firmaOrden);
            List<Parametro> parametros = new ArrayList<Parametro>();
            parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
            String resultado = new ApiController().Post("Admin/" + idOrden + "/Firmar", jsonInputString, parametros);
            firmaOrden = g.fromJson(resultado, RespuestaFirmarOrden.class);

        } catch (Exception e) {
            System.out.println("No fue posible firmar la orden " + e);
        }

        return firmaOrden;
    }

    public static RespuestaOrden buscarOrden(String idOrden) {

        RespuestaOrden orden = new RespuestaOrden();

        try {
            ApiController servicioApi = new ApiController();
            List<Parametro> parametros = new ArrayList<Parametro>();
            String resultado = "";
            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

            parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
            resultado = servicioApi.Get("orden/" + idOrden, parametros);

            orden = g.fromJson(resultado, RespuestaOrden.class);
            if (orden != null) {
                if (orden.isExito()) {
                    return orden;
                }
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }

        return orden;
    }
}
