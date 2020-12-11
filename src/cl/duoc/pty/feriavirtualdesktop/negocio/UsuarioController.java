/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.negocio;

import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaUsuarioListar;
import cl.duoc.pty.feriavirtualdesktop.entidades.Parametro;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaUsuario;
import cl.duoc.pty.feriavirtualdesktop.entidades.Usuario;
import cl.duoc.pty.feriavirtualdesktop.grafica.VistaGeneralAdministrador;
import cl.duoc.pty.feriavirtualdesktop.utils.perfilUsuario;
import cl.duoc.pty.feriavirtualdesktop.utils.FormatoString;
import cl.duoc.pty.feriavirtualdesktop.utils.ValidacionRut;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samuel
 */
public class UsuarioController {

    /**
     * Método que realiza la conexión a la API y devuelve una Lista de Usuarios
     *
     * @param idUsuario
     * @return
     */
    public static RespuestaUsuarioListar buscarUsuario(String idUsuario) {

        RespuestaUsuarioListar listaUsuario = new RespuestaUsuarioListar();
        RespuestaUsuario usuario = new RespuestaUsuario();

        try {

            ApiController servicioApi = new ApiController();
            List<Parametro> parametros = new ArrayList<Parametro>();
            String resultado = "";
            Gson g = new Gson();
            if (idUsuario != null && !idUsuario.isEmpty()) {
                parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
                resultado = servicioApi.Get("Usuario/" + idUsuario, parametros);

                usuario = g.fromJson(resultado, RespuestaUsuario.class);
                if (usuario != null) {
                    if (usuario.isExito()) {

                        List<Usuario> usr = new ArrayList<Usuario>();
                        usr.add(usuario.getUsuario());
                        listaUsuario.setUsuarios(usr);
                        listaUsuario = formatearUsuario(listaUsuario);
                    }
                }

            } else {
                parametros.add(new Parametro("idperfil", "0"));
                parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));
                parametros.add(new Parametro("servicio", "FRT"));
                resultado = servicioApi.Get("usuario/perfil", parametros);

                listaUsuario = g.fromJson(resultado, RespuestaUsuarioListar.class);
                if (listaUsuario != null) {
                    if (listaUsuario.isExito()) {
                        listaUsuario = formatearUsuario(listaUsuario);
                    }
                }
            }

            if (resultado == null) {
                listaUsuario.setExito(false);
                listaUsuario.setMensaje("No fue posbible traer los datos");
                return listaUsuario;
            }

        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }

        return listaUsuario;
    }

    /**
     * Método que realiza envía parámetros actualizados a la API de un Usuario
     *
     * @param usuario
     * @return
     */
    public static RespuestaUsuario actualizarUsuario(Usuario usuario) {

        RespuestaUsuario ru = new RespuestaUsuario();

        try {

            ApiController servicioApi = new ApiController();
            List<Parametro> parametros = new ArrayList<Parametro>();
            String jsonUsuario = "";
            String resultado = "";
            Gson g = new Gson();

            if (usuario != null) {
                //parametros.add(new Parametro("idSession", "session"));
                parametros.add(new Parametro("idSession", VistaGeneralAdministrador.session));

                jsonUsuario = g.toJson(usuario);

                resultado = servicioApi.Post("usuario/" + usuario.getIdUsuario() + "/modificar/", jsonUsuario, parametros);

                ru = g.fromJson(resultado, RespuestaUsuario.class);
                if (ru != null) {
                    if (ru.isExito()) {

                        return formatearActualizar(ru);
                    }
                }

            }
            if (resultado == null) {
                ru.setExito(false);
                ru.setMensaje("No fue posbible traer los datos");
                return ru;
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error al obtener la información " + e);
        }
        return ru;
    }

    /**
     * Método que da formato a los datos de los usuarios para ser visualizados
     *
     * @param listaUsuario
     * @return
     */
    private static RespuestaUsuarioListar formatearUsuario(RespuestaUsuarioListar listaUsuario) {
        List<Usuario> lu = new ArrayList<Usuario>();
        for (Usuario u : listaUsuario.getUsuarios()) {
            u.setRut(ValidacionRut.FormatearRUT(u.getRut()));
            u.setApellido(u.getApellido().substring(0, 1).toUpperCase() + u.getApellido().substring(1));
            u.setNombre(FormatoString.PrimeraMayuscula(u.getNombre()));
            u.setDireccion(FormatoString.PrimeraMayuscula(u.getDireccion()));
            u.setEmail(u.getEmail().toLowerCase());
            u.setFechaModificacion(FormatoString.FechasFormato(u.getFechaModificacion()));
            u.setFechaCreacion(FormatoString.FechasFormato(u.getFechaCreacion()));
            u.setTelefono(FormatoString.fonoFormato(u.getTelefono()));

            if (u.getCambiaClave() == "true") {
                u.setCambiaClave("Si");
            } else {
                u.setCambiaClave("No");
            }

            if (u.getEstado() == "true") {
                u.setEstado("Vigente");
            } else {
                u.setEstado("No Vigente");
            }

            if (u.getActivo() == "true") {
                u.setActivo("Si");
            } else {
                u.setActivo("No");
            }

            u.setIdPerfil(perfilUsuario.perfilUsuarioString(Integer.parseInt(u.getIdPerfil())));

            lu.add(u);
        }
        listaUsuario.setUsuarios(lu);
        return listaUsuario;
    }

    /**
     * Método que da formato a los datos de los usuarios para ser enviados a la
     * API
     *
     * @param ru
     * @return
     */
    private static RespuestaUsuario formatearActualizar(RespuestaUsuario ru) {

        ru.getUsuario().setRut(ValidacionRut.FormatearRUT(ru.getUsuario().getRut()));
        ru.getUsuario().setApellido(ru.getUsuario().getApellido().substring(0, 1).toUpperCase() + ru.getUsuario().getApellido().substring(1));
        ru.getUsuario().setNombre(FormatoString.PrimeraMayuscula(ru.getUsuario().getNombre()));
        ru.getUsuario().setDireccion(FormatoString.PrimeraMayuscula(ru.getUsuario().getDireccion()));
        ru.getUsuario().setEmail(ru.getUsuario().getEmail().toLowerCase());
        ru.getUsuario().setFechaModificacion(FormatoString.FechasFormato(ru.getUsuario().getFechaModificacion()));
        ru.getUsuario().setFechaCreacion(FormatoString.FechasFormato(ru.getUsuario().getFechaCreacion()));
        ru.getUsuario().setTelefono(FormatoString.fonoFormato(ru.getUsuario().getTelefono()));

        if (ru.getUsuario().getCambiaClave() == "true") {
            ru.getUsuario().setCambiaClave("Si");
        } else {
            ru.getUsuario().setCambiaClave("No");
        }

        if (ru.getUsuario().getEstado() == "true") {
            ru.getUsuario().setEstado("Vigente");
        } else {
            ru.getUsuario().setEstado("No Vigente");
        }

        if (ru.getUsuario().getActivo() == "true") {
            ru.getUsuario().setActivo("Si");
        } else {
            ru.getUsuario().setActivo("No");
        }

        ru.getUsuario().setIdPerfil(perfilUsuario.perfilUsuarioString(Integer.parseInt(ru.getUsuario().getIdPerfil())));

        return ru;
    }

}
