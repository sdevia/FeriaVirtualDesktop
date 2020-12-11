/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.negocio;

import cl.duoc.pty.feriavirtualdesktop.entidades.Categoria;
import cl.duoc.pty.feriavirtualdesktop.entidades.Parametro;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaCategoria;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaCategoriaListar;
import cl.duoc.pty.feriavirtualdesktop.grafica.VistaGeneralAdministrador;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Javier
 */
public class CategoriaController {

    public static RespuestaCategoriaListar listarCategoria() {

        RespuestaCategoriaListar listaCategoria = new RespuestaCategoriaListar();

        try {

            ApiController servicioApi = new ApiController();
            List<Parametro> parametros = new ArrayList<Parametro>();
            String resultado = "";
            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();

            parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
            resultado = servicioApi.Get("Admin/Categoria/Listar", parametros);
            listaCategoria = g.fromJson(resultado, RespuestaCategoriaListar.class);
            if (listaCategoria != null) {
                if (listaCategoria.isExito()) {
                    return listaCategoria;
                }
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }

        return listaCategoria;
    }

    public static RespuestaCategoria crearModificarCategoria(Categoria categoria) {
        RespuestaCategoria creaCategoria = new RespuestaCategoria();

        try {
            Gson g = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss").create();
            String jsonInputString = g.toJson(categoria);//"{Rut: \"" + login.getRut() + "\", Clave: \"" + login.getClave() + "\", TipoPerfil: 1}";
            List<Parametro> parametros = new ArrayList<Parametro>();
            parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
            String resultado = new ApiController().Post("Admin/Categoria", jsonInputString, parametros);
            creaCategoria = g.fromJson(resultado, RespuestaCategoria.class);

        } catch (Exception e) {
            System.out.println("No fue posible crear la categoria " + e);
        }

        return creaCategoria;
    }

}
