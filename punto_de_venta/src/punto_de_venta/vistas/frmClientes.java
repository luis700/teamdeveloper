/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto_de_venta.vistas;

/**
 *
 * @author jcm_0
 */
public class frmClientes extends javax.swing.JFrame {

    /**
     * Creates new form frmClientes
     */
    public frmClientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pancontenedor = new javax.swing.JPanel();
        panencabezado = new javax.swing.JPanel();
        lbliconocerrar = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lbliconoclientes = new javax.swing.JLabel();
        sprtitulo = new javax.swing.JSeparator();
        pancontenido = new javax.swing.JPanel();
        lblrfc = new javax.swing.JLabel();
        lblrazonsocial = new javax.swing.JLabel();
        lblcalle = new javax.swing.JLabel();
        lblnumext = new javax.swing.JLabel();
        lblnumint = new javax.swing.JLabel();
        lblcolonia = new javax.swing.JLabel();
        lbllocalidad = new javax.swing.JLabel();
        lblmunicipio = new javax.swing.JLabel();
        lblestado = new javax.swing.JLabel();
        lblcp = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblcelular = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        txtrfc = new javax.swing.JTextField();
        txtrazonsocial = new javax.swing.JTextField();
        txtcalle = new javax.swing.JTextField();
        txtnumext = new javax.swing.JTextField();
        txtnumint = new javax.swing.JTextField();
        txtcolonia = new javax.swing.JTextField();
        txtlocalidad = new javax.swing.JTextField();
        txtmunicipio = new javax.swing.JTextField();
        cmbestado = new javax.swing.JComboBox<>();
        txtcp = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        sprcontenido = new javax.swing.JSeparator();
        lblsubtitulo = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        lbliconobuscar = new javax.swing.JLabel();
        sprbuscar = new javax.swing.JSeparator();
        txtbuscarcliente = new javax.swing.JTextField();
        scplistaclientes = new javax.swing.JScrollPane();
        tbllistaclientes = new javax.swing.JTable();
        lblsubtitulolista = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frmclientes"); // NOI18N
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 768));

        pancontenedor.setBackground(new java.awt.Color(255, 255, 255));
        pancontenedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pancontenedor.setName("pancontenedor"); // NOI18N

        panencabezado.setBackground(new java.awt.Color(204, 204, 204));
        panencabezado.setName("panencabezado"); // NOI18N
        panencabezado.setPreferredSize(new java.awt.Dimension(1362, 64));

        lbliconocerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/punto_de_venta/vistas/icons/icons8_Close_Window_64px.png"))); // NOI18N
        lbliconocerrar.setName("lbliconocerrar"); // NOI18N
        lbliconocerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbliconocerrarMouseClicked(evt);
            }
        });

        lbltitulo.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        lbltitulo.setText("Clientes");
        lbltitulo.setName("lbltitulo"); // NOI18N

        lbliconoclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/punto_de_venta/vistas/icons/icons8_Account_32px.png"))); // NOI18N
        lbliconoclientes.setName("lbliconoclientes"); // NOI18N
        lbliconoclientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbliconoclientesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panencabezadoLayout = new javax.swing.GroupLayout(panencabezado);
        panencabezado.setLayout(panencabezadoLayout);
        panencabezadoLayout.setHorizontalGroup(
            panencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panencabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sprtitulo)
                .addContainerGap())
            .addGroup(panencabezadoLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(lbliconoclientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbltitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbliconocerrar))
        );
        panencabezadoLayout.setVerticalGroup(
            panencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panencabezadoLayout.createSequentialGroup()
                .addGroup(panencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panencabezadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbliconoclientes)
                            .addComponent(lbltitulo)))
                    .addComponent(lbliconocerrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sprtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pancontenido.setBackground(new java.awt.Color(255, 255, 255));

        lblrfc.setText("RFC");

        lblrazonsocial.setText("Razón social");

        lblcalle.setText("Calle");

        lblnumext.setText("Número exterior");

        lblnumint.setText("Número interior");

        lblcolonia.setText("Colonia");

        lbllocalidad.setText("Localidad");

        lblmunicipio.setText("Municipio");

        lblestado.setText("Estado");

        lblcp.setText("Código postal");

        lbltelefono.setText("Teléfono");

        lblcelular.setText("Celular");

        lblcorreo.setText("Correo");

        cmbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Ciudad de México", "Chiapas", "Chihuahua", "Coahuila", "Colima", "Durango", "Estado de México", "Guanajuato", "Guerrero", "Hidalgo", "Jalisco", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla", "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas", "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas" }));
        cmbestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbestadoActionPerformed(evt);
            }
        });

        sprcontenido.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        lblsubtitulo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblsubtitulo.setText("Nuevo cliente");

        btnguardar.setBackground(new java.awt.Color(255, 255, 255));
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/punto_de_venta/vistas/icons/icons8_Save_64px.png"))); // NOI18N
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(255, 255, 255));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/punto_de_venta/vistas/icons/icons8_Cancel_64px_1.png"))); // NOI18N

        btneditar.setBackground(new java.awt.Color(255, 255, 255));
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/punto_de_venta/vistas/icons/icons8_Edit_64px_1.png"))); // NOI18N

        lbliconobuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/punto_de_venta/vistas/icons/icons8_Detective_64px.png"))); // NOI18N

        txtbuscarcliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtbuscarcliente.setBorder(null);

        tbllistaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scplistaclientes.setViewportView(tbllistaclientes);

        lblsubtitulolista.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblsubtitulolista.setText("Lista de clientes");

        btneliminar.setBackground(new java.awt.Color(255, 255, 255));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/punto_de_venta/vistas/icons/icons8_Trash_Can_52px.png"))); // NOI18N

        javax.swing.GroupLayout pancontenidoLayout = new javax.swing.GroupLayout(pancontenido);
        pancontenido.setLayout(pancontenidoLayout);
        pancontenidoLayout.setHorizontalGroup(
            pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pancontenidoLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pancontenidoLayout.createSequentialGroup()
                        .addComponent(lblrfc)
                        .addGap(474, 474, 474)
                        .addComponent(lblrazonsocial))
                    .addGroup(pancontenidoLayout.createSequentialGroup()
                        .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcalle)
                            .addGroup(pancontenidoLayout.createSequentialGroup()
                                .addComponent(lblcolonia)
                                .addGap(31, 31, 31)
                                .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pancontenidoLayout.createSequentialGroup()
                                .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbllocalidad)
                                    .addComponent(lblestado))
                                .addGap(18, 18, 18)
                                .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtlocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pancontenidoLayout.createSequentialGroup()
                                        .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblcp)
                                        .addGap(15, 15, 15)
                                        .addComponent(txtcp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnumext)
                            .addComponent(lblmunicipio)
                            .addComponent(lblcorreo)
                            .addComponent(lbltelefono))))
                .addGap(18, 18, 18)
                .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pancontenidoLayout.createSequentialGroup()
                        .addComponent(txtnumext, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblnumint)
                        .addGap(18, 18, 18)
                        .addComponent(txtnumint, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtrazonsocial)
                    .addComponent(txtmunicipio)
                    .addComponent(txtcorreo)
                    .addGroup(pancontenidoLayout.createSequentialGroup()
                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblcelular)
                        .addGap(18, 18, 18)
                        .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(pancontenidoLayout.createSequentialGroup()
                .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pancontenidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sprcontenido)
                            .addComponent(scplistaclientes)))
                    .addGroup(pancontenidoLayout.createSequentialGroup()
                        .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pancontenidoLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lblsubtitulo))
                            .addGroup(pancontenidoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblsubtitulolista))
                            .addGroup(pancontenidoLayout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(lbliconobuscar)
                                .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pancontenidoLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sprbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pancontenidoLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pancontenidoLayout.setVerticalGroup(
            pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pancontenidoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pancontenidoLayout.createSequentialGroup()
                        .addComponent(txtbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sprbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pancontenidoLayout.createSequentialGroup()
                        .addComponent(lblsubtitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblrfc)
                                .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblrazonsocial)
                                .addComponent(txtrazonsocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnumext)
                            .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblcalle)
                                .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtnumext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtnumint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblnumint)))
                        .addGap(18, 18, 18)
                        .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcolonia)
                            .addComponent(txtcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmunicipio)
                            .addComponent(txtmunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pancontenidoLayout.createSequentialGroup()
                                .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbllocalidad)
                                    .addComponent(txtlocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcorreo)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblestado)
                                    .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcp)
                                    .addComponent(txtcp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbltelefono)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblcelular)
                                    .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(sprcontenido, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pancontenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbliconobuscar)
                            .addComponent(btneditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblsubtitulolista)
                .addGap(1, 1, 1)
                .addComponent(scplistaclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pancontenedorLayout = new javax.swing.GroupLayout(pancontenedor);
        pancontenedor.setLayout(pancontenedorLayout);
        pancontenedorLayout.setHorizontalGroup(
            pancontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panencabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pancontenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pancontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pancontenedorLayout.setVerticalGroup(
            pancontenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pancontenedorLayout.createSequentialGroup()
                .addComponent(panencabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pancontenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pancontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pancontenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbliconocerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliconocerrarMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lbliconocerrarMouseClicked

    private void lbliconoclientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbliconoclientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lbliconoclientesMouseClicked

    private void cmbestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbestadoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnguardarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cmbestado;
    private javax.swing.JLabel lblcalle;
    private javax.swing.JLabel lblcelular;
    private javax.swing.JLabel lblcolonia;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lblcp;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lbliconobuscar;
    private javax.swing.JLabel lbliconocerrar;
    private javax.swing.JLabel lbliconoclientes;
    private javax.swing.JLabel lbllocalidad;
    private javax.swing.JLabel lblmunicipio;
    private javax.swing.JLabel lblnumext;
    private javax.swing.JLabel lblnumint;
    private javax.swing.JLabel lblrazonsocial;
    private javax.swing.JLabel lblrfc;
    private javax.swing.JLabel lblsubtitulo;
    private javax.swing.JLabel lblsubtitulolista;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JPanel pancontenedor;
    private javax.swing.JPanel pancontenido;
    private javax.swing.JPanel panencabezado;
    private javax.swing.JScrollPane scplistaclientes;
    private javax.swing.JSeparator sprbuscar;
    private javax.swing.JSeparator sprcontenido;
    private javax.swing.JSeparator sprtitulo;
    private javax.swing.JTable tbllistaclientes;
    private javax.swing.JTextField txtbuscarcliente;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcolonia;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcp;
    private javax.swing.JTextField txtlocalidad;
    private javax.swing.JTextField txtmunicipio;
    private javax.swing.JTextField txtnumext;
    private javax.swing.JTextField txtnumint;
    private javax.swing.JTextField txtrazonsocial;
    private javax.swing.JTextField txtrfc;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
