/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.pty.feriavirtualdesktop.grafica;

import cl.duoc.pty.feriavirtualdesktop.entidades.Orden;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaFirmarOrden;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaOrden;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaOrdenListar;
import cl.duoc.pty.feriavirtualdesktop.entidades.RespuestaProcesoListar;
import cl.duoc.pty.feriavirtualdesktop.entidades.TMOrden;
import cl.duoc.pty.feriavirtualdesktop.entidades.TMProceso;
import cl.duoc.pty.feriavirtualdesktop.negocio.OrdenController;
import cl.duoc.pty.feriavirtualdesktop.negocio.ProcesoController;
import cl.duoc.pty.feriavirtualdesktop.utils.ValidarRut;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableModel;

/**
 *
 * @author bruunildo
 */
public class VistaProcesosVenta extends javax.swing.JPanel {

    /**
     * Creates new form VistaProcesosVenta
     */
    public VistaProcesosVenta() {
        initComponents();
        inicializarTabla();
        listarOrdenes();
        listarProcesos();
        setearBotones();
        
    }

    private void inicializarTabla() {
        List<Orden> ordenes = new ArrayList<>();
        TMOrden modelo;           
        modelo = new TMOrden(ordenes);

        tblOrdenes.setModel(modelo);

    }
    
    private void setearBotones() {
        
        btnCrearProcesoVenta.setEnabled(false);
        
    }
    
    private void listarOrdenes() {
        RespuestaOrdenListar listaOrden = new RespuestaOrdenListar();
    
        listaOrden = OrdenController.listarOrden();

        TMOrden modelo;
        modelo = new TMOrden(listaOrden.getOrdenes());
        
        // TODO: Remover filas con estado PENDIENTE
        for(int row = 0;row < modelo.getRowCount();row++) {
            System.out.println(modelo.getValueAt(row, 3));
            String estado = modelo.getValueAt(row, 3).toString();
            if("VIGENTE".equals(estado)) {
                System.out.println("siiiii");
                ;
            }
        }
        
        
       /* List<Object> objs;
        Iterator<TMOrden> i = modelo.iterator();
        while (i.hasNext()) {
        Object o = i.next();
        //some condition
        i.remove();
        }
        
        for (Iterator<TMOrden> iter = model.listIterator(); iter.hasNext(); ) {
        String a = iter.next();
        if (...) {
        iter.remove();
    }
}*/

       
        tblOrdenes.setModel(modelo);
    }
    
    private void listarProcesos() {
        RespuestaProcesoListar listaProceso = new RespuestaProcesoListar();
    
        listaProceso = ProcesoController.listarProceso();

        TMProceso modelo;
        modelo = new TMProceso(listaProceso.getProcesos());
        
        // TODO: Remover filas con estado PENDIENTE
        for(int row = 0;row < modelo.getRowCount();row++) {
            System.out.println(modelo.getValueAt(row, 3));
            String estado = modelo.getValueAt(row, 3).toString();
            if("VIGENTE".equals(estado)) {
                System.out.println("siiiii");
                ;
            }
        }

        tblProcesos.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProcesosVenta = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIdOrden = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        txtFechaOrden = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdProceso = new javax.swing.JTextField();
        txtEstadoOrden = new javax.swing.JTextField();
        txtComision = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAduana = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPagoServicio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPagoTransportista = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtFechaProceso = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEstadoProceso = new javax.swing.JTextField();
        btnBuscarOrden = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnCrearProcesoVenta = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnModificarProcesoVenta = new javax.swing.JButton();
        btnEliminarProcesoVenta = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdenes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProcesos = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1100, 640));

        pnlProcesosVenta.setBackground(new java.awt.Color(255, 255, 255));
        pnlProcesosVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procesos de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID Orden");

        txtIdOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdOrdenActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Cliente");

        txtCliente.setEditable(false);

        txtFechaOrden.setEditable(false);
        txtFechaOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaOrdenActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Fecha");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Estado");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("ID Proceso");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Valor Aduana");

        txtEstadoOrden.setEditable(false);
        txtEstadoOrden.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtEstadoOrdenInputMethodTextChanged(evt);
            }
        });
        txtEstadoOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoOrdenActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Comisión");

        txtAduana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAduanaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Pago por Servicio");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Pago Transportista");

        txtPagoTransportista.setEditable(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Estado Proceso");

        txtFechaProceso.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Fecha Proceso");

        txtEstadoProceso.setEditable(false);

        btnBuscarOrden.setBackground(new java.awt.Color(253, 187, 52));
        btnBuscarOrden.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarOrden.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarOrden.setText("Buscar");
        btnBuscarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaOrden, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtEstadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdOrden)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarOrden)
                        .addGap(6, 6, 6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14)
                    .addComponent(txtEstadoProceso, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel6)
                    .addComponent(txtPagoTransportista)
                    .addComponent(txtFechaProceso)
                    .addComponent(txtIdProceso))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPagoServicio)
                    .addComponent(txtAduana)
                    .addComponent(txtComision)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addGap(116, 116, 116))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComision, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFechaProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAduana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaOrden, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txtPagoServicio, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(txtEstadoProceso))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstadoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPagoTransportista, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnCrearProcesoVenta.setBackground(new java.awt.Color(253, 187, 52));
        btnCrearProcesoVenta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCrearProcesoVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearProcesoVenta.setText("Firmar");
        btnCrearProcesoVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCrearProcesoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProcesoVentaActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(253, 187, 52));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificarProcesoVenta.setBackground(new java.awt.Color(253, 187, 52));
        btnModificarProcesoVenta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnModificarProcesoVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProcesoVenta.setText("Modificar");
        btnModificarProcesoVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModificarProcesoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProcesoVentaActionPerformed(evt);
            }
        });

        btnEliminarProcesoVenta.setBackground(new java.awt.Color(229, 52, 63));
        btnEliminarProcesoVenta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEliminarProcesoVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProcesoVenta.setText("Eliminar");
        btnEliminarProcesoVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnCrearProcesoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificarProcesoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarProcesoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearProcesoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProcesoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProcesoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOrdenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOrdenes);

        tblProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblProcesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProcesosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProcesos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout pnlProcesosVentaLayout = new javax.swing.GroupLayout(pnlProcesosVenta);
        pnlProcesosVenta.setLayout(pnlProcesosVentaLayout);
        pnlProcesosVentaLayout.setHorizontalGroup(
            pnlProcesosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcesosVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProcesosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlProcesosVentaLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(196, 196, 196))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlProcesosVentaLayout.setVerticalGroup(
            pnlProcesosVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProcesosVentaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProcesosVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlProcesosVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIdOrden.setText("");
        txtCliente.setText("");
        txtFechaOrden.setText("");
        txtEstadoOrden.setText("");
        txtIdProceso.setText("");
        txtFechaProceso.setText("");
        txtEstadoProceso.setText("");
        txtPagoTransportista.setText("");
        txtComision.setText("");
        txtAduana.setText("");
        txtPagoServicio.setText("");
        
                
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarProcesoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProcesoVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarProcesoVentaActionPerformed

    private void tblOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOrdenesMouseClicked
        
        int i = tblOrdenes.getSelectedRow();
        TableModel model = tblOrdenes.getModel();
        
        /*String rut = model.getValueAt(i,1).toString();
        String rutFormateado = valida.FormatearRUT(rut);
        
        */
        
        
        txtIdOrden.setText(model.getValueAt(i,0).toString());
        txtCliente.setText(model.getValueAt(i,2).toString());
        txtFechaOrden.setText(model.getValueAt(i,1).toString());
        txtEstadoOrden.setText(model.getValueAt(i,3).toString());
        /*txtEmailUsuario.setText(model.getValueAt(i,4).toString());
        txtDireccionUsuario.setText(model.getValueAt(i,7).toString());
        txtTelefonoUsuario.setText(model.getValueAt(i,14).toString());
        pwfClaveUsuario.setText(model.getValueAt(i,8).toString());*/
        
        if("PENDIENTE".equals(txtEstadoOrden.getText())) {
        
            btnCrearProcesoVenta.setEnabled(true);
    }
        else {
            btnCrearProcesoVenta.setEnabled(false);
        }
    }//GEN-LAST:event_tblOrdenesMouseClicked

    private void txtEstadoOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoOrdenActionPerformed

    private void txtFechaOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaOrdenActionPerformed

    private void txtIdOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdOrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdOrdenActionPerformed

    private void txtAduanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAduanaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAduanaActionPerformed

    private void btnCrearProcesoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProcesoVentaActionPerformed
        RespuestaFirmarOrden firmaOrden = new RespuestaFirmarOrden();
                
        firmaOrden = OrdenController.firmarOrden(txtIdOrden.getText());
        
        System.out.println("firmaorden" + firmaOrden.toString());
        
        
    }//GEN-LAST:event_btnCrearProcesoVentaActionPerformed

    private void tblProcesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProcesosMouseClicked
        // TODO add your handling code here:
        int i = tblProcesos.getSelectedRow();
        TableModel model = tblProcesos.getModel();
        
        /*String rut = model.getValueAt(i,1).toString();
        String rutFormateado = valida.FormatearRUT(rut);
        
        */
        
        
        txtIdProceso.setText(model.getValueAt(i,0).toString());
        txtFechaProceso.setText(model.getValueAt(i,5).toString());
        txtEstadoProceso.setText(model.getValueAt(i,6).toString());
        txtPagoTransportista.setText(model.getValueAt(i,4).toString());
        txtComision.setText(model.getValueAt(i,1).toString());
        txtAduana.setText(model.getValueAt(i,2).toString());
        txtPagoServicio.setText(model.getValueAt(i,3).toString());
        

    }//GEN-LAST:event_tblProcesosMouseClicked

    private void btnBuscarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarOrdenActionPerformed
        // TODO add your handling code here:
        
       RespuestaOrden orden = new RespuestaOrden();
                
       orden = OrdenController.buscarOrden(txtIdOrden.getText()); 
       
       txtFechaOrden.setText(orden.getOrden().getFechaOrden().toString());
       txtEstadoOrden.setText(orden.getOrden().getEstado());
       txtCliente.setText(String.valueOf(orden.getOrden().getIdClienteExterno()));
       
    }//GEN-LAST:event_btnBuscarOrdenActionPerformed

    private void txtEstadoOrdenInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtEstadoOrdenInputMethodTextChanged
         
    }//GEN-LAST:event_txtEstadoOrdenInputMethodTextChanged

        public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaGeneralAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGeneralAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGeneralAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGeneralAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProcesosVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarOrden;
    private javax.swing.JButton btnCrearProcesoVenta;
    private javax.swing.JButton btnEliminarProcesoVenta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificarProcesoVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlProcesosVenta;
    private javax.swing.JTable tblOrdenes;
    private javax.swing.JTable tblProcesos;
    private javax.swing.JTextField txtAduana;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtComision;
    private javax.swing.JTextField txtEstadoOrden;
    private javax.swing.JTextField txtEstadoProceso;
    private javax.swing.JTextField txtFechaOrden;
    private javax.swing.JTextField txtFechaProceso;
    private javax.swing.JTextField txtIdOrden;
    private javax.swing.JTextField txtIdProceso;
    private javax.swing.JTextField txtPagoServicio;
    private javax.swing.JTextField txtPagoTransportista;
    // End of variables declaration//GEN-END:variables
}
