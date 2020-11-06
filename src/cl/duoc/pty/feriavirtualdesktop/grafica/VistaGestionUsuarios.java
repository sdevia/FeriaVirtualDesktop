/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.grafica;

import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaUsuario;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaUsuarioListar;
import cl.duoc.pty.feriavirtualdesktop.entidades.TMUsuario;
import cl.duoc.pty.feriavirtualdesktop.entidades.Usuario;
import cl.duoc.pty.feriavirtualdesktop.negocio.UsuarioController;
import cl.duoc.pty.feriavirtualdesktop.utils.ValidacionRut;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.TableModel;

/**
 *
 * @author bruunildo
 */
public class VistaGestionUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form VistaGestionUsuarioss
     */
    public VistaGestionUsuarios() {
        initComponents();
        inicializarTabla();

    }

    private void inicializarTabla() {
        List<Usuario> usuarios = new ArrayList<>();
        TMUsuario modelo;

        modelo = new TMUsuario(usuarios);

        tblGestionUsuarios.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlGestionUsuarios = new javax.swing.JPanel();
        pnlInputsGestionUsuario = new javax.swing.JPanel();
        llIdUsuario = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        lblRutUsuario = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblApellidoUsuario = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblTipoUsuario = new javax.swing.JLabel();
        lblEstadoUsuario = new javax.swing.JLabel();
        lblActivoUsuario = new javax.swing.JLabel();
        lblDireccionUsuario = new javax.swing.JLabel();
        txtDireccionUsuario = new javax.swing.JTextField();
        lblEmailUsuario = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        lblClaveUsuario = new javax.swing.JLabel();
        lblTelefonoUsuario = new javax.swing.JLabel();
        txtTelefonoUsuario = new javax.swing.JTextField();
        lblFechaCreacion = new javax.swing.JLabel();
        pwfClaveUsuario = new javax.swing.JPasswordField();
        txtTipoUsuario = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtActivo = new javax.swing.JTextField();
        txtfechaCreacion = new javax.swing.JTextField();
        pnlbtnUsuarios = new javax.swing.JPanel();
        btnCrearUsuario = new javax.swing.JButton();
        btnBuscarUsuario = new javax.swing.JButton();
        btnActualizarUsuario = new javax.swing.JButton();
        pnlGridUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGestionUsuarios = new javax.swing.JTable();

        PnlGestionUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        PnlGestionUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de Usuarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        PnlGestionUsuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PnlGestionUsuarios.setPreferredSize(new java.awt.Dimension(1100, 640));

        pnlInputsGestionUsuario.setBackground(new java.awt.Color(255, 255, 255));

        llIdUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        llIdUsuario.setText("ID Usuario");

        txtIdUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtIdUsuario.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtIdUsuarioComponentAdded(evt);
            }
        });
        txtIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdUsuarioActionPerformed(evt);
            }
        });

        lblRutUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRutUsuario.setText("Rut");

        lblNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblNombreUsuario.setText("Nombre");

        lblApellidoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblApellidoUsuario.setText("Apellido");

        txtRut.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtApellido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTipoUsuario.setText("Tipo de Usuario");

        lblEstadoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEstadoUsuario.setText("Estado");

        lblActivoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblActivoUsuario.setText("Activo");

        lblDireccionUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDireccionUsuario.setText("Dirección");

        txtDireccionUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblEmailUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmailUsuario.setText("E-mail");

        txtEmailUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblClaveUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblClaveUsuario.setText("Clave");

        lblTelefonoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTelefonoUsuario.setText("Teléfono");

        txtTelefonoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblFechaCreacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFechaCreacion.setText("Fecha Creación Usuario");

        pwfClaveUsuario.setText("jPasswordField1");

        txtTipoUsuario.setEditable(false);
        txtTipoUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoUsuarioActionPerformed(evt);
            }
        });

        txtEstado.setEditable(false);
        txtEstado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtActivo.setEditable(false);
        txtActivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtfechaCreacion.setEditable(false);
        txtfechaCreacion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout pnlInputsGestionUsuarioLayout = new javax.swing.GroupLayout(pnlInputsGestionUsuario);
        pnlInputsGestionUsuario.setLayout(pnlInputsGestionUsuarioLayout);
        pnlInputsGestionUsuarioLayout.setHorizontalGroup(
            pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputsGestionUsuarioLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblApellidoUsuario)
                    .addComponent(llIdUsuario)
                    .addComponent(lblRutUsuario)
                    .addComponent(lblNombreUsuario)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(txtRut)
                    .addComponent(txtNombre)
                    .addComponent(txtApellido))
                .addGap(255, 255, 255)
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTipoUsuario)
                    .addComponent(lblEstadoUsuario)
                    .addComponent(lblActivoUsuario)
                    .addComponent(lblDireccionUsuario)
                    .addComponent(txtDireccionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203)
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTelefonoUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pwfClaveUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(lblClaveUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaCreacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefonoUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfechaCreacion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmailUsuario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlInputsGestionUsuarioLayout.setVerticalGroup(
            pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInputsGestionUsuarioLayout.createSequentialGroup()
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoUsuario)
                    .addComponent(llIdUsuario)
                    .addComponent(lblFechaCreacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfechaCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstadoUsuario)
                        .addComponent(lblClaveUsuario))
                    .addComponent(lblRutUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pwfClaveUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblActivoUsuario)
                    .addComponent(lblNombreUsuario)
                    .addComponent(lblTelefonoUsuario))
                .addGap(1, 1, 1)
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefonoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionUsuario)
                    .addComponent(lblApellidoUsuario)
                    .addComponent(lblEmailUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInputsGestionUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDireccionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlbtnUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        btnCrearUsuario.setBackground(new java.awt.Color(253, 187, 72));
        btnCrearUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCrearUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearUsuario.setText("Limpiar");
        btnCrearUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        btnBuscarUsuario.setBackground(new java.awt.Color(253, 187, 72));
        btnBuscarUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarUsuario.setText("Buscar");
        btnBuscarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        btnActualizarUsuario.setBackground(new java.awt.Color(253, 187, 72));
        btnActualizarUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnActualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarUsuario.setText("Actualizar");
        btnActualizarUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnActualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlbtnUsuariosLayout = new javax.swing.GroupLayout(pnlbtnUsuarios);
        pnlbtnUsuarios.setLayout(pnlbtnUsuariosLayout);
        pnlbtnUsuariosLayout.setHorizontalGroup(
            pnlbtnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbtnUsuariosLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 479, Short.MAX_VALUE)
                .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
                .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        pnlbtnUsuariosLayout.setVerticalGroup(
            pnlbtnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbtnUsuariosLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(pnlbtnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlGridUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        tblGestionUsuarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblGestionUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblGestionUsuarios.setGridColor(new java.awt.Color(43, 172, 192));
        tblGestionUsuarios.getTableHeader().setResizingAllowed(false);
        tblGestionUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGestionUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGestionUsuarios);

        javax.swing.GroupLayout pnlGridUsuariosLayout = new javax.swing.GroupLayout(pnlGridUsuarios);
        pnlGridUsuarios.setLayout(pnlGridUsuariosLayout);
        pnlGridUsuariosLayout.setHorizontalGroup(
            pnlGridUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGridUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlGridUsuariosLayout.setVerticalGroup(
            pnlGridUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGridUsuariosLayout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PnlGestionUsuariosLayout = new javax.swing.GroupLayout(PnlGestionUsuarios);
        PnlGestionUsuarios.setLayout(PnlGestionUsuariosLayout);
        PnlGestionUsuariosLayout.setHorizontalGroup(
            PnlGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlGestionUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGridUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlbtnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInputsGestionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PnlGestionUsuariosLayout.setVerticalGroup(
            PnlGestionUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlGestionUsuariosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(pnlInputsGestionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlbtnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGridUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlGestionUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 1692, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlGestionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        // TODO add your handling code here:
        RespuestaUsuarioListar listaUsuario = new RespuestaUsuarioListar();
        listaUsuario = UsuarioController.buscarUsuario(txtIdUsuario.getText());
        TMUsuario modelo;
        modelo = new TMUsuario(listaUsuario.getUsuarios());

        if (listaUsuario.isExito()) {
            tblGestionUsuarios.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(PnlGestionUsuarios, listaUsuario.getMensaje());
        }


    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void tblGestionUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGestionUsuariosMouseClicked
        // TODO add your handling code here:
        ValidacionRut valida;
        valida = new ValidacionRut();

        int i = tblGestionUsuarios.getSelectedRow();
        TableModel model = tblGestionUsuarios.getModel();

        String rut = model.getValueAt(i, 1).toString();
        String rutFormateado = valida.FormatearRUT(rut);

        txtIdUsuario.setText(model.getValueAt(i, 0).toString());
        txtRut.setText(rutFormateado);
        txtNombre.setText(model.getValueAt(i, 2).toString());
        txtApellido.setText(model.getValueAt(i, 3).toString());
        txtEmailUsuario.setText(model.getValueAt(i, 4).toString());
        txtDireccionUsuario.setText(model.getValueAt(i, 7).toString());
        txtTelefonoUsuario.setText(model.getValueAt(i, 14).toString());
        pwfClaveUsuario.setText(model.getValueAt(i, 8).toString());


    }//GEN-LAST:event_tblGestionUsuariosMouseClicked

    private void txtIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioActionPerformed

    private void txtIdUsuarioComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtIdUsuarioComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioComponentAdded

    private void btnActualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarUsuarioActionPerformed
        RespuestaUsuario ru = new RespuestaUsuario();
        Usuario usuario = new Usuario();// TODO add your handling code here:
        RespuestaUsuarioListar listaUsuario = new RespuestaUsuarioListar();

        listaUsuario = UsuarioController.buscarUsuario(txtIdUsuario.getText());

        usuario = listaUsuario.getUsuarios().get(0);

        if (txtNombre.getText() != null) {
            usuario.setNombre(txtNombre.getText());
        }
        ru = UsuarioController.actualizarUsuario(usuario);

        if (ru.isExito()) {

            TMUsuario modelo;
            modelo = new TMUsuario(listaUsuario.getUsuarios());
            tblGestionUsuarios.setModel(modelo);
        }


    }//GEN-LAST:event_btnActualizarUsuarioActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void txtTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoUsuarioActionPerformed

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        txtActivo.setText(null);
        txtActivo.setText("");
        txtApellido.setText(null);
        txtApellido.setText("");
        txtDireccionUsuario.setText(null);
        txtDireccionUsuario.setText("");
        txtEmailUsuario.setText(null);
        txtEmailUsuario.setText("");
        txtEstado.setText(null);
        txtEstado.setText("");
        txtIdUsuario.setText(null);
        txtIdUsuario.setText("");
        txtNombre.setText(null);
        txtNombre.setText("");
        txtRut.setText(null);
        txtRut.setText("");
        txtTelefonoUsuario.setText(null);
        txtTelefonoUsuario.setText("");
        txtTipoUsuario.setText(null);
        txtTipoUsuario.setText("");
        txtfechaCreacion.setText(null);
        txtfechaCreacion.setText("");
        pwfClaveUsuario.setText(null);
        pwfClaveUsuario.setText("");


    }//GEN-LAST:event_btnCrearUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlGestionUsuarios;
    private javax.swing.JButton btnActualizarUsuario;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblActivoUsuario;
    private javax.swing.JLabel lblApellidoUsuario;
    private javax.swing.JLabel lblClaveUsuario;
    private javax.swing.JLabel lblDireccionUsuario;
    private javax.swing.JLabel lblEmailUsuario;
    private javax.swing.JLabel lblEstadoUsuario;
    private javax.swing.JLabel lblFechaCreacion;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblRutUsuario;
    private javax.swing.JLabel lblTelefonoUsuario;
    private javax.swing.JLabel lblTipoUsuario;
    private javax.swing.JLabel llIdUsuario;
    private javax.swing.JPanel pnlGridUsuarios;
    private javax.swing.JPanel pnlInputsGestionUsuario;
    private javax.swing.JPanel pnlbtnUsuarios;
    private javax.swing.JPasswordField pwfClaveUsuario;
    private javax.swing.JTable tblGestionUsuarios;
    private javax.swing.JTextField txtActivo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccionUsuario;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefonoUsuario;
    private javax.swing.JTextField txtTipoUsuario;
    private javax.swing.JTextField txtfechaCreacion;
    // End of variables declaration//GEN-END:variables
}
