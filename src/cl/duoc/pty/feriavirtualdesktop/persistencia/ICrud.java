/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.persistencia;

import java.util.List;

/**
 *
 * @author s1mu2
 */
public interface ICrud {
    /**
     * 
     * @param objAgregar
     * @return 
     */
    public boolean agregarElemento(Object objAgregar);
    /**
     * 
     * @return 
     */
    public List recuperarTodo();
    /**
     * 
     * @param objModificar
     * @return 
     */
    public boolean modificarElemento(Object objModificar);
    /**
     * 
     * @return 
     */
    public boolean eliminarElemento();
    //Crud
}
