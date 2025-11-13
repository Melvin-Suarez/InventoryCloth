package view;

import controller.VentasController;
import java.awt.Cursor;
import javax.swing.JFrame;
import javax.swing.SpinnerNumberModel;

public class PuntoVenta extends JFrame {

    Cursor mano = new Cursor(Cursor.HAND_CURSOR);
    VentasController modelo = new VentasController();
    SpinnerNumberModel model;
    
    public PuntoVenta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        model = new SpinnerNumberModel(0,0,1000,1);
        spCantidad.setModel(model);
        Tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        ventana1 = new model.Ventana();
        imagen1 = new model.Imagen();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtBarcode = new model.txtField();
        spCantidad = new javax.swing.JSpinner();
        btnAgregar = new model.Jpanelbtn();
        jLabel1 = new javax.swing.JLabel();
        imagen2 = new model.Imagen();
        jpanelbtn2 = new model.Jpanelbtn();
        jLabel2 = new javax.swing.JLabel();
        imagen3 = new model.Imagen();
        jpanelbtn3 = new model.Jpanelbtn();
        jLabel3 = new javax.swing.JLabel();
        imagen4 = new model.Imagen();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblVentaTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        ventana1.setPreferredSize(new java.awt.Dimension(70, 70));
        ventana1.setLayout(new java.awt.GridBagLayout());

        imagen1.setText("imagen1");
        imagen1.setName(""); // NOI18N
        imagen1.setPreferredSize(new java.awt.Dimension(42, 42));
        imagen1.setRuta("/recursos/atras.png");
        imagen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagen1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagen1MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ventana1.add(imagen1, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Punto de venta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ventana1.add(jLabel5, gridBagConstraints);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Total:");

        jPanel2.setLayout(new java.awt.GridBagLayout());

        txtBarcode.setPreferredSize(new java.awt.Dimension(123, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel2.add(txtBarcode, gridBagConstraints);

        spCantidad.setPreferredSize(new java.awt.Dimension(123, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel2.add(spCantidad, gridBagConstraints);

        btnAgregar.setBackground(new java.awt.Color(0, 110, 53));
        btnAgregar.setPreferredSize(new java.awt.Dimension(123, 50));
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarMousePressed(evt);
            }
        });
        btnAgregar.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnAgregar.add(jLabel1, gridBagConstraints);

        imagen2.setText("imagen2");
        imagen2.setPreferredSize(new java.awt.Dimension(30, 35));
        imagen2.setRuta("/Recursos/Agregar.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnAgregar.add(imagen2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel2.add(btnAgregar, gridBagConstraints);

        jpanelbtn2.setBackground(new java.awt.Color(255, 0, 4));
        jpanelbtn2.setPreferredSize(new java.awt.Dimension(123, 50));
        jpanelbtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpanelbtn2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpanelbtn2MousePressed(evt);
            }
        });
        jpanelbtn2.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eliminar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn2.add(jLabel2, gridBagConstraints);

        imagen3.setText("imagen3");
        imagen3.setPreferredSize(new java.awt.Dimension(35, 40));
        imagen3.setRuta("/Recursos/Eliminar.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn2.add(imagen3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel2.add(jpanelbtn2, gridBagConstraints);

        jpanelbtn3.setBackground(new java.awt.Color(5, 159, 255));
        jpanelbtn3.setPreferredSize(new java.awt.Dimension(123, 50));
        jpanelbtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpanelbtn3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpanelbtn3MousePressed(evt);
            }
        });
        jpanelbtn3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn3.add(jLabel3, gridBagConstraints);

        imagen4.setText("imagen4");
        imagen4.setPreferredSize(new java.awt.Dimension(35, 35));
        imagen4.setRuta("/Recursos/Venta.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn3.add(imagen4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 50);
        jPanel2.add(jpanelbtn3, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Cantidad:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel6, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Codigo de barra:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(jLabel4, gridBagConstraints);

        lblVentaTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblVentaTotal.setText("0.0 C$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblVentaTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(151, 151, 151))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ventana1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblVentaTotal))
                .addGap(28, 28, 28))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagen1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MouseEntered
        imagen1.setCursor(mano);
    }//GEN-LAST:event_imagen1MouseEntered

    private void imagen1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MousePressed
        new MenuUsuario().setVisible(true);
        modelo.cancelarVenta();
        this.dispose();
    }//GEN-LAST:event_imagen1MousePressed

    private void btnAgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMousePressed
        String barcode = txtBarcode.getText().trim();
        int cantidad = ((Number) spCantidad.getValue()).intValue();
        modelo.Agregar(barcode, cantidad);
        modelo.llenarTabla();
        lblVentaTotal.setText(Double.toString(modelo.getTotal()) + " C$");
    }//GEN-LAST:event_btnAgregarMousePressed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        btnAgregar.setCursor(mano);
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void jpanelbtn3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn3MousePressed
        modelo.VenderProducto();
        lblVentaTotal.setText("0.0 C$");
    }//GEN-LAST:event_jpanelbtn3MousePressed

    private void jpanelbtn2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn2MousePressed
        modelo.eliminarProducto(Tabla.getSelectedRow());
    }//GEN-LAST:event_jpanelbtn2MousePressed

    private void jpanelbtn3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn3MouseEntered
        jpanelbtn3.setCursor(mano);
    }//GEN-LAST:event_jpanelbtn3MouseEntered

    private void jpanelbtn2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn2MouseEntered
        jpanelbtn2.setCursor(mano);
    }//GEN-LAST:event_jpanelbtn2MouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntoVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private model.Jpanelbtn btnAgregar;
    private model.Imagen imagen1;
    private model.Imagen imagen2;
    private model.Imagen imagen3;
    private model.Imagen imagen4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private model.Jpanelbtn jpanelbtn2;
    private model.Jpanelbtn jpanelbtn3;
    private javax.swing.JLabel lblVentaTotal;
    private javax.swing.JSpinner spCantidad;
    private model.txtField txtBarcode;
    private model.Ventana ventana1;
    // End of variables declaration//GEN-END:variables
}
