/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.persistencia;

import java.sql.PreparedStatement;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author s1mu2
 */
public class AdministradorDao implements ICrud{

    public AdministradorDao() {
    }

    @Override
    public boolean agregarElemento(Object objAgregar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List recuperarTodo() {
        List listado = new LinkedList();
        try{
                 //Connection con = Conexion.getConexion();
                 String query = "select * from participante";
                 //PreparedStatement ps= con.prepareStatement(query);
                 //ResultSet rs=ps.executeQuery();
                 //while (rs.next()){
                 //   Participante objParticipante= new Participante(idParticipante, query, idRegistro, null, idRaza);
                 
                             
        }catch (Exception ex){
            System.out.println("No se puedo leer la conexion de la BD"+ex.getMessage());
        }
        return listado; 
    }

    @Override
    public boolean modificarElemento(Object objModificar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarElemento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
