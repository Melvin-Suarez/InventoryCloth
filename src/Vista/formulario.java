
package vista;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class formulario extends javax.swing.JInternalFrame {

    public formulario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtFieldNombre = new Modelo.txtField();
        txtFieldCodigo = new Modelo.txtField();
        txtFieldCantidad = new Modelo.txtField();
        txtFieldPrecio = new Modelo.txtField();
        txtFieldCategoria = new Modelo.txtField();
        txtFieldTalla = new Modelo.txtField();
        jpanelbtn1 = new Modelo.Jpanelbtn();
        jLabel18 = new javax.swing.JLabel();
        imagen1 = new model.SwingCustomize.Imagen();
        imagen2 = new model.SwingCustomize.Imagen();
        spinnerRedondeado2 = new Modelo.spinnerRedondeado();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(33, 0, 110));
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(33, 0, 110));
        jLabel12.setText("Codigo de  barra:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(33, 0, 110));
        jLabel13.setText("Cantidad:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(33, 0, 110));
        jLabel14.setText("Precio de venta:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(33, 0, 110));
        jLabel15.setText("Descuento:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addGap(102, 102, 102)
                .addComponent(jLabel15)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(33, 0, 110));
        jLabel6.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(33, 0, 110));
        jLabel7.setText("Codigo de  barra:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(33, 0, 110));
        jLabel8.setText("Cantidad:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(33, 0, 110));
        jLabel9.setText("Precio de venta:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 0, 110));
        jLabel10.setText("Descuento:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(102, 102, 102)
                .addComponent(jLabel10)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 0, 110));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(112, 168, 74, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 0, 110));
        jLabel2.setText("Codigo de  barra:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 233, 146, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 0, 110));
        jLabel3.setText("Cantidad:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(105, 304, 81, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 0, 110));
        jLabel4.setText("Precio de venta:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(49, 370, 137, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 0, 110));
        jLabel5.setText("Talla:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(479, 233, 46, 25);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(33, 0, 110));
        jLabel16.setText("Descuento:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(430, 304, 95, 25);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(33, 0, 110));
        jLabel17.setText("Categoria:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(438, 370, 87, 25);

        txtFieldNombre.setBackground(new java.awt.Color(217, 217, 217));
        txtFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtFieldNombre);
        txtFieldNombre.setBounds(192, 166, 516, 35);

        txtFieldCodigo.setBackground(new java.awt.Color(217, 217, 217));
        txtFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFieldCodigoActionPerformed(evt);
            }
        });
        txtFieldCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtFieldCodigo);
        txtFieldCodigo.setBounds(192, 231, 200, 35);

        txtFieldCantidad.setBackground(new java.awt.Color(217, 217, 217));
        txtFieldCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtFieldCantidad);
        txtFieldCantidad.setBounds(192, 302, 200, 35);

        txtFieldPrecio.setBackground(new java.awt.Color(217, 217, 217));
        txtFieldPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtFieldPrecio);
        txtFieldPrecio.setBounds(192, 368, 200, 35);

        txtFieldCategoria.setBackground(new java.awt.Color(217, 217, 217));
        txtFieldCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldCategoriaKeyTyped(evt);
            }
        });
        jPanel1.add(txtFieldCategoria);
        txtFieldCategoria.setBounds(531, 368, 177, 35);

        txtFieldTalla.setBackground(new java.awt.Color(217, 217, 217));
        txtFieldTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFieldTallaKeyTyped(evt);
            }
        });
        jPanel1.add(txtFieldTalla);
        txtFieldTalla.setBounds(531, 231, 177, 35);

        jpanelbtn1.setBackground(new java.awt.Color(0, 110, 53));
        jpanelbtn1.setMaximumSize(new java.awt.Dimension(467, 68));
        jpanelbtn1.setMinimumSize(new java.awt.Dimension(467, 68));
        jpanelbtn1.setPreferredSize(new java.awt.Dimension(467, 40));
        jpanelbtn1.setRadius(50);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Agregar Producto");

        imagen1.setText("imagen1");
        imagen1.setRuta("/Recursos/Agregar.png");

        imagen2.setText("imagen2");

        javax.swing.GroupLayout jpanelbtn1Layout = new javax.swing.GroupLayout(jpanelbtn1);
        jpanelbtn1.setLayout(jpanelbtn1Layout);
        jpanelbtn1Layout.setHorizontalGroup(
            jpanelbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelbtn1Layout.createSequentialGroup()
                .addGroup(jpanelbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelbtn1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelbtn1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jLabel18)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        jpanelbtn1Layout.setVerticalGroup(
            jpanelbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelbtn1Layout.createSequentialGroup()
                .addGroup(jpanelbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addGroup(jpanelbtn1Layout.createSequentialGroup()
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jpanelbtn1);
        jpanelbtn1.setBounds(230, 50, 340, 40);
        jPanel1.add(spinnerRedondeado2);
        spinnerRedondeado2.setBounds(530, 300, 170, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFieldCodigoActionPerformed

    }//GEN-LAST:event_txtFieldCodigoActionPerformed

    private void txtFieldCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldCodigoKeyTyped
         char car = evt.getKeyChar();
       String currentText =((JTextField) evt.getSource()).getText();
                
        if (Character.isDigit(car)) return;
        if (car == '.') {
            if (currentText.contains(".")) {
                evt.consume();
            }
            return;
        }
        
        evt.consume();
            
    }//GEN-LAST:event_txtFieldCodigoKeyTyped

    private void txtFieldCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldCantidadKeyTyped
     char car = evt.getKeyChar();
       String currentText =((JTextField) evt.getSource()).getText();
                
        if (Character.isDigit(car)) return;
        if (car == '.') {
            if (currentText.contains(".")) {
                evt.consume();
            }
            return;
        }
        
        evt.consume();
            
    }//GEN-LAST:event_txtFieldCantidadKeyTyped

    private void txtFieldPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldPrecioKeyTyped
    char car = evt.getKeyChar();
       String currentText =((JTextField) evt.getSource()).getText();
                
        if (Character.isDigit(car)) return;
        if (car == '.') {
            if (currentText.contains(".")) {
                evt.consume();
            }
            return;
        }
        
        evt.consume();
            
    }//GEN-LAST:event_txtFieldPrecioKeyTyped

    private void txtFieldTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldTallaKeyTyped
    char car = evt.getKeyChar();
       String currentText =((JTextField) evt.getSource()).getText();
                
        if (Character.isDigit(car)) return;
        if (car == '.') {
            if (currentText.contains(".")) {
                evt.consume();
            }
            return;
        }
        
        evt.consume();
            
    }//GEN-LAST:event_txtFieldTallaKeyTyped

    private void txtFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldNombreKeyTyped
         char car = evt.getKeyChar();
        if (!Character.isLetter(car) && car != ' ' && 
                    car != KeyEvent.VK_BACK_SPACE && 
                    car != KeyEvent.VK_DELETE) {
                    evt.consume(); 
                   
                }
    }//GEN-LAST:event_txtFieldNombreKeyTyped

    private void txtFieldCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFieldCategoriaKeyTyped
         char car = evt.getKeyChar();
        if (!Character.isLetter(car) && car != ' ' && 
                    car != KeyEvent.VK_BACK_SPACE && 
                    car != KeyEvent.VK_DELETE) {
                    evt.consume(); 
                   
                }
    }//GEN-LAST:event_txtFieldCategoriaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.SwingCustomize.Imagen imagen1;
    private model.SwingCustomize.Imagen imagen2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private Modelo.Jpanelbtn jpanelbtn1;
    private Modelo.spinnerRedondeado spinnerRedondeado2;
    private Modelo.txtField txtFieldCantidad;
    private Modelo.txtField txtFieldCategoria;
    private Modelo.txtField txtFieldCodigo;
    private Modelo.txtField txtFieldNombre;
    private Modelo.txtField txtFieldPrecio;
    private Modelo.txtField txtFieldTalla;
    // End of variables declaration//GEN-END:variables
}
