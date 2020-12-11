/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.grafica;

import cl.duoc.pty.feriavirtualdesktop.entidades.Categoria;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaCategoria;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaCategoriaListar;
import cl.duoc.pty.feriavirtualdesktop.entidades.TMCategoria;
import cl.duoc.pty.feriavirtualdesktop.negocio.CategoriaController;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.TableModel;

/**
 *
 * @author bruunildo
 */
public class VistaCategoriaProductos extends javax.swing.JPanel {

    /**
     * Creates new form VistaCategoriaProductos
     */
    public VistaCategoriaProductos() {
        initComponents();
        inicializarTabla();
        listarCategorias();
    }

    private void inicializarTabla() {
        List<Categoria> categorias = new ArrayList<>();
        TMCategoria modelo;           
        modelo = new TMCategoria(categorias);

        
        tblCategorias.setModel(modelo); 
    }
        private void listarCategorias() {
        RespuestaCategoriaListar listaCategoria = new RespuestaCategoriaListar();
    
        listaCategoria = CategoriaController.listarCategoria();

        TMCategoria modelo;
        modelo = new TMCategoria(listaCategoria.getCategorias());

        tblCategorias.setModel(modelo);
    }
        private void limpiarCampos() {
        txtIdCategoriaProducto.setText("");
        txtNombreCategoriaProducto.setText("");
        txtDescripcionCategoriaProducto.setText("");
        txtFechaCreacionCategoria.setText("");
        txtFechaModificacionCategoriaProducto.setText("");
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlCategoriaProducto = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategorias = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnCrearCategoriaProducto = new javax.swing.JButton();
        btnModificarCategoriaProducto = new javax.swing.JButton();
        btnLimpiarCategoria = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtIdCategoriaProducto = new javax.swing.JTextField();
        lblNombreCategoriaProducto = new javax.swing.JLabel();
        lblDescripcionCategoriaProducto = new javax.swing.JLabel();
        txtDescripcionCategoriaProducto = new javax.swing.JTextField();
        lblEstadoCategoriaProducto = new javax.swing.JLabel();
        lblFechaCreacionCategoria = new javax.swing.JLabel();
        txtFechaCreacionCategoria = new javax.swing.JTextField();
        lblFechaModificacionCategoriaProducto = new javax.swing.JLabel();
        txtFechaModificacionCategoriaProducto = new javax.swing.JTextField();
        lblIdCategoriaProducto = new javax.swing.JLabel();
        txtNombreCategoriaProducto = new javax.swing.JTextField();
        cbxEstadoCategoria = new javax.swing.JComboBox<>();
        txtNombreCategoriaIngles = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblDescripcionCategoriaIngles = new javax.swing.JLabel();
        txtDescripcionCategoriaIngles = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1592, 855));

        PnlCategoriaProducto.setBackground(new java.awt.Color(255, 255, 255));
        PnlCategoriaProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categorías Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        PnlCategoriaProducto.setToolTipText("");
        PnlCategoriaProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategorias);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1491, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnCrearCategoriaProducto.setBackground(new java.awt.Color(0, 153, 153));
        btnCrearCategoriaProducto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCrearCategoriaProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCategoriaProducto.setText("Crear");
        btnCrearCategoriaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCrearCategoriaProductoMouseEntered(evt);
            }
        });
        btnCrearCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCategoriaProductoActionPerformed(evt);
            }
        });

        btnModificarCategoriaProducto.setBackground(new java.awt.Color(253, 187, 52));
        btnModificarCategoriaProducto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnModificarCategoriaProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCategoriaProducto.setText("Modificar");
        btnModificarCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCategoriaProductoActionPerformed(evt);
            }
        });

        btnLimpiarCategoria.setBackground(new java.awt.Color(253, 187, 52));
        btnLimpiarCategoria.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLimpiarCategoria.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiarCategoria.setText("Limpiar");
        btnLimpiarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnCrearCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315)
                .addComponent(btnModificarCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        txtIdCategoriaProducto.setEnabled(false);
        txtIdCategoriaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCategoriaProductoActionPerformed(evt);
            }
        });

        lblNombreCategoriaProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombreCategoriaProducto.setText("Nombre Categoría Español");

        lblDescripcionCategoriaProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDescripcionCategoriaProducto.setText("Descripción Español");

        lblEstadoCategoriaProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEstadoCategoriaProducto.setText("Estado");

        lblFechaCreacionCategoria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFechaCreacionCategoria.setText("Fecha Creación");

        txtFechaCreacionCategoria.setEnabled(false);

        lblFechaModificacionCategoriaProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFechaModificacionCategoriaProducto.setText("Fecha Modificación");

        txtFechaModificacionCategoriaProducto.setEnabled(false);

        lblIdCategoriaProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblIdCategoriaProducto.setText("ID Categora");

        cbxEstadoCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habilitado", "Desabilitado" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nombre Categoría en Ingles");

        lblDescripcionCategoriaIngles.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDescripcionCategoriaIngles.setText("Descripción Ingles");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdCategoriaProducto)
                    .addComponent(lblIdCategoriaProducto)
                    .addComponent(lblNombreCategoriaProducto)
                    .addComponent(txtNombreCategoriaProducto)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCategoriaIngles, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDescripcionCategoriaProducto)
                    .addComponent(txtDescripcionCategoriaProducto)
                    .addComponent(lblDescripcionCategoriaIngles)
                    .addComponent(txtDescripcionCategoriaIngles, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                .addGap(156, 156, 156)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEstadoCategoriaProducto)
                    .addComponent(lblFechaCreacionCategoria)
                    .addComponent(txtFechaCreacionCategoria)
                    .addComponent(lblFechaModificacionCategoriaProducto)
                    .addComponent(cbxEstadoCategoria, 0, 300, Short.MAX_VALUE)
                    .addComponent(txtFechaModificacionCategoriaProducto))
                .addGap(163, 163, 163))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdCategoriaProducto)
                    .addComponent(lblDescripcionCategoriaProducto)
                    .addComponent(lblEstadoCategoriaProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtIdCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxEstadoCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(lblNombreCategoriaProducto))
                        .addComponent(lblFechaCreacionCategoria))
                    .addComponent(txtDescripcionCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaCreacionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblFechaModificacionCategoriaProducto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreCategoriaIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaModificacionCategoriaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblDescripcionCategoriaIngles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDescripcionCategoriaIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout PnlCategoriaProductoLayout = new javax.swing.GroupLayout(PnlCategoriaProducto);
        PnlCategoriaProducto.setLayout(PnlCategoriaProductoLayout);
        PnlCategoriaProductoLayout.setHorizontalGroup(
            PnlCategoriaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlCategoriaProductoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlCategoriaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PnlCategoriaProductoLayout.setVerticalGroup(
            PnlCategoriaProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlCategoriaProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlCategoriaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlCategoriaProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        PnlCategoriaProducto.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCategoriaProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCategoriaProductoActionPerformed

    private void tblCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriasMouseClicked

        int i = tblCategorias.getSelectedRow();
        TableModel model = tblCategorias.getModel();

        txtIdCategoriaProducto.setText(model.getValueAt(i,0).toString());
        txtNombreCategoriaProducto.setText(model.getValueAt(i,1).toString());
        txtNombreCategoriaIngles.setText(model.getValueAt(i,2).toString());
        txtDescripcionCategoriaProducto.setText(model.getValueAt(i,3).toString());
        txtDescripcionCategoriaIngles.setText(model.getValueAt(i,4).toString());
        String opcion = (model.getValueAt(i,5).toString()); 
        if (opcion == "Habilitado") {
            cbxEstadoCategoria.setSelectedIndex(0);
        }else {
            cbxEstadoCategoria.setSelectedIndex(1);
        }
        txtFechaCreacionCategoria.setText(model.getValueAt(i,6).toString());
        txtFechaModificacionCategoriaProducto.setText(model.getValueAt(i,7).toString());
     
    }//GEN-LAST:event_tblCategoriasMouseClicked

    private void btnCrearCategoriaProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCrearCategoriaProductoMouseEntered
        //txtIdCategoriaProducto.setEditable(false);
    }//GEN-LAST:event_btnCrearCategoriaProductoMouseEntered

    private void btnLimpiarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCategoriaActionPerformed
        txtIdCategoriaProducto.setText("");
        txtNombreCategoriaProducto.setText("");
        txtNombreCategoriaIngles.setText("");
        txtDescripcionCategoriaProducto.setText("");
        txtDescripcionCategoriaIngles.setText("");
        txtFechaCreacionCategoria.setText("");
        txtFechaModificacionCategoriaProducto.setText("");
    }//GEN-LAST:event_btnLimpiarCategoriaActionPerformed

    private void btnCrearCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCategoriaProductoActionPerformed
        if(
          
           txtNombreCategoriaProducto.getText().isEmpty() ||
           txtNombreCategoriaIngles.getText().isEmpty() ||
           txtDescripcionCategoriaProducto.getText().isEmpty() ||
           txtDescripcionCategoriaIngles.getText().isEmpty()){
           //txtFechaCreacionCategoria.getText().isEmpty() ||
           //txtFechaModificacionCategoriaProducto.getText().isEmpty()) {
            
        showMessageDialog(null, "Hay campos vacíos","Información",JOptionPane.WARNING_MESSAGE);

        } else {
        RespuestaCategoria creacionCategoria = new RespuestaCategoria();
        Categoria categoria = new Categoria();
        
        Date fechaCreacionCategoria = new Date();
        Date fechaModificacionCategoria = new Date();
        
        try {
            fechaCreacionCategoria = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(txtFechaCreacionCategoria.getText());
            fechaModificacionCategoria = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(txtFechaModificacionCategoriaProducto.getText());
        } catch (ParseException ex) {
            System.out.println("Error "+ex);
        }
        
        categoria.setIdUsuario(1);
        categoria.setNombreCategoria(txtNombreCategoriaProducto.getText());
        categoria.setNombreCategoriaIngles(txtNombreCategoriaIngles.getText());
        categoria.setDescripcion(txtDescripcionCategoriaProducto.getText());
        categoria.setDescripcionIngles(txtDescripcionCategoriaIngles.getText());
        String opcionEstadoCategoria = (String) cbxEstadoCategoria.getSelectedItem();
            if (opcionEstadoCategoria=="Habilitado") {     
            categoria.setEstado(true);
            }else{
            categoria.setEstado(false);
            }
        categoria.setFechaCreacion(fechaCreacionCategoria);
        categoria.setFechaModificacion(fechaModificacionCategoria);
        
        creacionCategoria = CategoriaController.crearModificarCategoria(categoria);
        
        showMessageDialog(null, creacionCategoria.getMensaje(),"Información",JOptionPane.WARNING_MESSAGE);
        limpiarCampos();
        //inicializarTabla();
        }
    }//GEN-LAST:event_btnCrearCategoriaProductoActionPerformed

    private void btnModificarCategoriaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCategoriaProductoActionPerformed
        if(
          
           txtNombreCategoriaProducto.getText().isEmpty() ||
           txtNombreCategoriaIngles.getText().isEmpty() ||
           txtDescripcionCategoriaProducto.getText().isEmpty() ||
           txtDescripcionCategoriaIngles.getText().isEmpty() ||
           txtFechaCreacionCategoria.getText().isEmpty() ||
           txtFechaModificacionCategoriaProducto.getText().isEmpty()) {
            
        showMessageDialog(null, "Hay campos vacíos","Información",JOptionPane.WARNING_MESSAGE);
        
        } 
        
        else {
            
        RespuestaCategoria modificarCategoria = new RespuestaCategoria();
        Categoria categoria = new Categoria();
        
        Date fechaCreacionCategoria = new Date();
        Date fechaModificacionCategoria = new Date();
        
        try {
            fechaCreacionCategoria = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(txtFechaCreacionCategoria.getText());
            fechaModificacionCategoria = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(txtFechaModificacionCategoriaProducto.getText());
        } catch (ParseException ex) {
            System.out.println("Error "+ex);
        }
        
        categoria.setIdUsuario(1);
        categoria.setIdCategoria(Integer.valueOf(txtIdCategoriaProducto.getText()));
        categoria.setNombreCategoria(txtNombreCategoriaProducto.getText());
        categoria.setNombreCategoriaIngles(txtNombreCategoriaIngles.getText());
        categoria.setDescripcion(txtDescripcionCategoriaProducto.getText());
        categoria.setDescripcionIngles(txtDescripcionCategoriaIngles.getText());
        String opcionEstadoCategoria = (String) cbxEstadoCategoria.getSelectedItem();
            if (opcionEstadoCategoria=="Habilitado") {     
            categoria.setEstado(true);
            }else{
            categoria.setEstado(false);
            }
        categoria.setFechaCreacion(fechaCreacionCategoria);
        categoria.setFechaModificacion(fechaModificacionCategoria);
        
        modificarCategoria = CategoriaController.crearModificarCategoria(categoria);
        
        showMessageDialog(null, modificarCategoria.getMensaje(),"Información",JOptionPane.WARNING_MESSAGE);
        limpiarCampos();
        }
    }//GEN-LAST:event_btnModificarCategoriaProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlCategoriaProducto;
    private javax.swing.JButton btnCrearCategoriaProducto;
    private javax.swing.JButton btnLimpiarCategoria;
    private javax.swing.JButton btnModificarCategoriaProducto;
    private javax.swing.JComboBox<String> cbxEstadoCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcionCategoriaIngles;
    private javax.swing.JLabel lblDescripcionCategoriaProducto;
    private javax.swing.JLabel lblEstadoCategoriaProducto;
    private javax.swing.JLabel lblFechaCreacionCategoria;
    private javax.swing.JLabel lblFechaModificacionCategoriaProducto;
    private javax.swing.JLabel lblIdCategoriaProducto;
    private javax.swing.JLabel lblNombreCategoriaProducto;
    private javax.swing.JTable tblCategorias;
    private javax.swing.JTextField txtDescripcionCategoriaIngles;
    private javax.swing.JTextField txtDescripcionCategoriaProducto;
    private javax.swing.JTextField txtFechaCreacionCategoria;
    private javax.swing.JTextField txtFechaModificacionCategoriaProducto;
    private javax.swing.JTextField txtIdCategoriaProducto;
    private javax.swing.JTextField txtNombreCategoriaIngles;
    private javax.swing.JTextField txtNombreCategoriaProducto;
    // End of variables declaration//GEN-END:variables


}
