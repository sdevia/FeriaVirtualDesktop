/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.negocio;

import cl.duoc.pty.feriavirtualdesktop.entidades.Parametro;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaSubasta;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaSubastaListar;
import cl.duoc.pty.feriavirtualdesktop.entidades.Subasta;
import cl.duoc.pty.feriavirtualdesktop.grafica.VistaGeneralAdministrador;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class SubastaController {

    public static RespuestaSubastaListar listarSubasta() {

        RespuestaSubastaListar listaSubasta = new RespuestaSubastaListar();

        try {

            ApiController servicioApi = new ApiController();
            List<Parametro> parametros = new ArrayList<Parametro>();
            String resultado = "";
            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

            parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
            resultado = servicioApi.Get("Admin/Subasta/Listar", parametros);

            listaSubasta = g.fromJson(resultado, RespuestaSubastaListar.class);
            if (listaSubasta != null) {
                if (listaSubasta.isExito()) {
                    return listaSubasta;
                }
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }

        return listaSubasta;
    }

    public static RespuestaSubasta crearModificarSubasta(Subasta subasta) {
        RespuestaSubasta creaSubasta = new RespuestaSubasta();

        try {
            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
            String jsonInputString = g.toJson(subasta);
            List<Parametro> parametros = new ArrayList<Parametro>();
            parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
            String resultado = new ApiController().Post("Admin/Subasta", jsonInputString, parametros);
            creaSubasta = g.fromJson(resultado, RespuestaSubasta.class);

        } catch (Exception e) {
            System.out.println("No fue posible crear la subasta " + e);
        }

        return creaSubasta;
    }

    public static RespuestaSubasta modificarSubasta(Subasta subasta) {
        RespuestaSubasta modificaSubasta = new RespuestaSubasta();

        try {
            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
            String jsonInputString = g.toJson(subasta);//"{Rut: \"" + login.getRut() + "\", Clave: \"" + login.getClave() + "\", TipoPerfil: 1}";
            List<Parametro> parametros = new ArrayList<Parametro>();
            parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
            String resultado = new ApiController().Post("Admin/Subasta", jsonInputString, parametros);
            modificaSubasta = g.fromJson(resultado, RespuestaSubasta.class);
        } catch (Exception e) {
            System.out.println("No fue posible modificar la subasta " + e);
        }

        return modificaSubasta;
    }

    public static RespuestaSubastaListar listaSubastaById(int idProceso) {
        RespuestaSubastaListar listaSubasta = new RespuestaSubastaListar();

        try {

            ApiController servicioApi = new ApiController();
            List<Parametro> parametros = new ArrayList<Parametro>();
            String resultado = "";

            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
            parametros.add(new Parametro("idProceso", String.valueOf(idProceso)));
            parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
            resultado = servicioApi.Get("Admin/Subasta/{idProceso}/Listar", parametros);

            listaSubasta = g.fromJson(resultado, RespuestaSubastaListar.class);
            if (listaSubasta != null) {
                if (listaSubasta.isExito()) {
                    return listaSubasta;
                }
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }

        return listaSubasta;
    }

}
