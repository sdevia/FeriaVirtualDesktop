/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author bruunildo
 */
public class TMCategoria implements TableModel{
    private List<Categoria> categorias;
    
    
    ///la LISTA QUE TRAAE ESTA NULL
    
    public TMCategoria(List<Categoria> lista){
        categorias = lista;
    }
     @Override
    public int getRowCount(){
       return categorias.size();
   }
    
    @Override
      public int getColumnCount(){
       return 9;
   }
    @Override
     public String getColumnName(int columnIndex) {
         String titulo = null;
         switch (columnIndex) {
             case 0: {
                 titulo = "IDCATEGORIA";
                 break;
             }
             case 1: {
                 titulo = "NOMBRECATEGORIA";
                 break;
             }
             case 2: {
                 titulo = "NOMBREINGLES";
                 break;
             }
             case 3: {
                 titulo = "DESCRIPCIONCATEGORIA";
                 break;
             }
            case 4: {
                 titulo = "DESCRIPCIONCATEGORIAINGLES";
                 break;
             }
             case 5: {
                 titulo = "ESTADOCATEGORIA";
                 break;
             }
             case 6: {
                 titulo = "FECHACREACION";
                 break;
             }
             case 7: {
                 titulo = "FECHAMODIFICACION";
                 break;
             }
         }
         return titulo;
     } 

    @Override
     public Class<?> getColumnClass(int columnIndex) {
         return String.class;
     }

    @Override
     public boolean isCellEditable(int rowIndex, int columnIndex) {
         return columnIndex !=0;
     }

    @Override
     public Object getValueAt(int rowIndex, int columnIndex) {
         Categoria c = categorias.get(rowIndex);
         String valor = null;

         switch (columnIndex) {
             case 0: {
                 valor = Integer.toString(c.getIdCategoria());
                 break;
             }
             case 1: {
                 valor = c.getNombreCategoria();
                 break;
             }
                case 2: {
                valor = c.getNombreCategoriaIngles();
                 break;
             }
             case 3: {
                 valor = c.getDescripcion();
                 break;
             }
             case 4: {
                 valor = c.getDescripcionIngles();
                 break;
             }
             case 5: {
                 
                 
                valor = Boolean.toString(c.isEstado());
                 if (valor =="true") {
                        valor ="Habilitado";
                 }else{
                        valor ="Desabilitado";
                 }
                break;
             }
             case 6: {
                 SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
                 valor = sdf2.format(c.getFechaCreacion());
                 break;
             }
             case 7: {
                 SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
                 valor = sdf2.format(c.getFechaModificacion());
                 break;
             }
         }
         return valor;


     }


    @Override
     public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
         Categoria c = categorias.get(rowIndex);
         switch (columnIndex) {
             case 0: {
                 c.setIdCategoria(aValue.hashCode());
                 break;
             }
             case 1: {
                    c.setNombreCategoria(aValue.toString());
                    break;
             }
             case 2: {
                    c.setNombreCategoriaIngles(aValue.toString());
                    break;
             }
             case 3: {
                    c.setDescripcion(aValue.toString());
                    break;
             }
             case 4: {
                    c.setDescripcionIngles(aValue.toString());
                    break;
             }
             case 5: {
                    c.setEstado(aValue.equals(aValue));
                    break;
             }
             case 6: {
                    c.setFechaCreacion((Date) aValue);
                    break;
             }
             case 7: {
                    c.setFechaModificacion((Date) aValue);
                    break;
             }
         }

     }

    @Override
     public void addTableModelListener(TableModelListener l) {
     }

    @Override
     public void removeTableModelListener(TableModelListener l) {
     }



}
