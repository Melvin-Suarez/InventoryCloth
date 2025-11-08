
package view;

import controller.Distribuidores;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JTextField;
import model.Distribuidor;
import static view.formularioProveedores.txtNombre;
import static view.formularioProveedores.txtCorreo;
import static view.formularioProveedores.txtTelefono;
import static view.formularioProveedores.txtCategoria;


 
public class formularioProveedores extends javax.swing.JInternalFrame {
    
    public boolean Editandolo = false;
    
    public formularioProveedores() {
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
        jLabel16 = new javax.swing.JLabel();
        txtNombre = new model.txtField();
        txtCorreo = new model.txtField();
        txtTelefono = new model.txtField();
        txtCategoria = new model.txtField();
        btnDistribuidor = new model.Jpanelbtn();
        jLabel18 = new javax.swing.JLabel();
        imagen1 = new model.Imagen();
        imagen2 = new model.Imagen();

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

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 0, 110));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 170, 110, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 0, 110));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Correo:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(21, 233, 160, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 0, 110));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Teléfono:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(86, 304, 100, 25);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(33, 0, 110));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Categoria:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(425, 304, 100, 25);

        txtNombre.setBackground(new java.awt.Color(217, 217, 217));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre);
        txtNombre.setBounds(192, 166, 516, 35);

        txtCorreo.setBackground(new java.awt.Color(217, 217, 217));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCorreo);
        txtCorreo.setBounds(192, 231, 510, 35);

        txtTelefono.setBackground(new java.awt.Color(217, 217, 217));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefono);
        txtTelefono.setBounds(192, 302, 200, 35);

        txtCategoria.setBackground(new java.awt.Color(217, 217, 217));
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCategoria);
        txtCategoria.setBounds(530, 300, 177, 35);

        btnDistribuidor.setBackground(new java.awt.Color(0, 110, 53));
        btnDistribuidor.setMaximumSize(new java.awt.Dimension(467, 68));
        btnDistribuidor.setMinimumSize(new java.awt.Dimension(467, 68));
        btnDistribuidor.setPreferredSize(new java.awt.Dimension(467, 40));
        btnDistribuidor.setRadius(50);
        btnDistribuidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnDistribuidorMousePressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Agregar Distribuidores");

        imagen1.setText("imagen1");
        imagen1.setRuta("/Recursos/Agregar.png");

        imagen2.setText("imagen2");

        javax.swing.GroupLayout btnDistribuidorLayout = new javax.swing.GroupLayout(btnDistribuidor);
        btnDistribuidor.setLayout(btnDistribuidorLayout);
        btnDistribuidorLayout.setHorizontalGroup(
            btnDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDistribuidorLayout.createSequentialGroup()
                .addGroup(btnDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnDistribuidorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDistribuidorLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jLabel18)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        btnDistribuidorLayout.setVerticalGroup(
            btnDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnDistribuidorLayout.createSequentialGroup()
                .addGroup(btnDistribuidorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnDistribuidorLayout.createSequentialGroup()
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnDistribuidor);
        btnDistribuidor.setBounds(230, 50, 340, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed

    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
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
            
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
         char car = evt.getKeyChar();
        if (!Character.isLetter(car) && car != ' ' && 
                    car != KeyEvent.VK_BACK_SPACE && 
                    car != KeyEvent.VK_DELETE) {
                    evt.consume(); 
                   
                }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        char car = evt.getKeyChar();
        if (!Character.isLetter(car) && car != ' ' &&
            car != KeyEvent.VK_BACK_SPACE &&
            car != KeyEvent.VK_DELETE) {
            evt.consume();

        }
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void btnDistribuidorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDistribuidorMousePressed
         if (!Editandolo) {
            try {
                // Validar campos obligatorios
                if (txtNombre.getText().trim().isEmpty()
                        || txtCorreo.getText().trim().isEmpty()
                        || txtTelefono.getText().trim().isEmpty()
                        || txtCategoria.getText().trim().isEmpty()) {

                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Por favor complete todos los campos obligatorios",
                            "Campos incompletos",
                            javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // CREAR UNA NUEVA INSTANCIA DE PRODUCTO CADA VEZ
                Distribuidor nuevoProducto = new Distribuidor();

                // Configurar los valores del nuevo producto
                nuevoProducto.setNombre(txtNombre.getText().trim());
                nuevoProducto.setCorreo(txtCorreo.getText().trim());
                nuevoProducto.setTelefono(txtTelefono.getText().trim());
                nuevoProducto.setCategoria(txtCategoria.getText().trim());

                

               

                // Agregar el NUEVO producto a la lista
                Distribuidores.llenarLista(nuevoProducto);

                // Mostrar mensaje de éxito
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Producto agregado exitosamente",
                        "Éxito",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);

                // Limpiar el formulario después de agregar
                limpiar();
                

                // Opcional: Actualizar la tabla automáticamente
                // Si necesitas esto, necesitarías una referencia a la ventana principal
            } catch (NumberFormatException e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Error en los datos numéricos: Asegúrese de ingresar números válidos",
                        "Error de formato",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Error al agregar producto: " + e.getMessage(),
                        "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            if (txtNombre.getText().trim().isEmpty()
                        || txtCorreo.getText().trim().isEmpty()
                        || txtTelefono.getText().trim().isEmpty()
                        || txtCategoria.getText().trim().isEmpty()) {

                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Por favor complete todos los campos obligatorios",
                            "Campos incompletos",
                            javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                } else {
                lista();
            }
        }
    }//GEN-LAST:event_btnDistribuidorMousePressed

     public void limpiar() {
        txtNombre.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtCategoria.setText("");
       
    }
    
     private void lista() {
        List<Distribuidor> list = Distribuidores.getLista();
        int fila = Distribuidores.getCelda();
        list.get(fila).setNombre(txtNombre.getText().trim());
        list.get(fila).setCorreo(txtCorreo.getText().trim());
        list.get(fila).setTelefono(txtTelefono.getText().trim());
        list.get(fila).setCategoria(txtCategoria.getText().trim());
        Distribuidores.setLista(list);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public model.Jpanelbtn btnDistribuidor;
    public model.Imagen imagen1;
    private model.Imagen imagen2;
    public static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static model.txtField txtCategoria;
    public static model.txtField txtCorreo;
    public static model.txtField txtNombre;
    public static model.txtField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
