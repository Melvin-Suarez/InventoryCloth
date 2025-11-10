package view;

import controller.Listas;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import model.Producto;
import javax.swing.JOptionPane;
import static view.formulario.spinner;

public class formulario extends javax.swing.JInternalFrame {

    public boolean editando = false;
    Listas lista;
    private Cursor mano = new Cursor(Cursor.HAND_CURSOR);

    public formulario() {
        initComponents();
        lista = Listas.getInstance();
        SpinnerNumberModel modelo = new SpinnerNumberModel(0, 0, 100, 1);
        spinner.setModel(modelo);
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
        txtMarca = new model.txtField();
        txtCodigo = new model.txtField();
        txtCantidad = new model.txtField();
        txtcompra = new model.txtField();
        txtCategoria = new model.txtField();
        txtTalla = new model.txtField();
        jpanelbtn1 = new model.Jpanelbtn();
        jLabel18 = new javax.swing.JLabel();
        imagen1 = new model.Imagen();
        imagen2 = new model.Imagen();
        spinner = new model.spinnerRedondeado();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPrecio = new model.txtField();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 0, 110));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Marca:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 170, 110, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 0, 110));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Codigo de barra:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 230, 160, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(33, 0, 110));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Cantidad:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 300, 100, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(33, 0, 110));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Precio de compra:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 360, 160, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(33, 0, 110));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Talla:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(475, 233, 50, 25);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(33, 0, 110));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Descuento:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(425, 304, 100, 25);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(33, 0, 110));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Categoria:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(430, 360, 90, 25);

        txtMarca.setBackground(new java.awt.Color(217, 217, 217));
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });
        jPanel1.add(txtMarca);
        txtMarca.setBounds(170, 170, 200, 35);

        txtCodigo.setBackground(new java.awt.Color(217, 217, 217));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigo);
        txtCodigo.setBounds(170, 230, 200, 35);

        txtCantidad.setBackground(new java.awt.Color(217, 217, 217));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidad);
        txtCantidad.setBounds(170, 300, 200, 35);

        txtcompra.setBackground(new java.awt.Color(217, 217, 217));
        txtcompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcompraKeyTyped(evt);
            }
        });
        jPanel1.add(txtcompra);
        txtcompra.setBounds(170, 360, 200, 35);

        txtCategoria.setBackground(new java.awt.Color(217, 217, 217));
        txtCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCategoria);
        txtCategoria.setBounds(530, 360, 177, 35);

        txtTalla.setBackground(new java.awt.Color(217, 217, 217));
        txtTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTallaKeyTyped(evt);
            }
        });
        jPanel1.add(txtTalla);
        txtTalla.setBounds(531, 231, 177, 35);

        jpanelbtn1.setBackground(new java.awt.Color(0, 110, 53));
        jpanelbtn1.setMaximumSize(new java.awt.Dimension(467, 68));
        jpanelbtn1.setMinimumSize(new java.awt.Dimension(467, 68));
        jpanelbtn1.setPreferredSize(new java.awt.Dimension(467, 40));
        jpanelbtn1.setRadius(50);
        jpanelbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpanelbtn1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpanelbtn1MousePressed(evt);
            }
        });

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
                .addGroup(jpanelbtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelbtn1Layout.createSequentialGroup()
                        .addComponent(imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jpanelbtn1);
        jpanelbtn1.setBounds(230, 50, 340, 40);

        spinner.setBackground(new java.awt.Color(217, 217, 217));
        spinner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spinnerKeyTyped(evt);
            }
        });
        jPanel1.add(spinner);
        spinner.setBounds(530, 300, 170, 40);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("%");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(710, 310, 16, 25);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(33, 0, 110));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Precio de venta:");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(370, 170, 150, 25);

        txtPrecio.setBackground(new java.awt.Color(217, 217, 217));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio);
        txtPrecio.setBounds(530, 170, 180, 35);

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

    private void jpanelbtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn1MousePressed
        Boton();
    }//GEN-LAST:event_jpanelbtn1MousePressed

    private void jpanelbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn1MouseEntered
        jpanelbtn1.setCursor(mano);
    }//GEN-LAST:event_jpanelbtn1MouseEntered

    private void txtTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTallaKeyTyped
        char car = evt.getKeyChar();
        String currentText = ((JTextField) evt.getSource()).getText();

        if (Character.isDigit(car)) {
            return;
        }
        if (car == '.') {
            if (currentText.contains(".")) {
                evt.consume();
            }
            return;
        }

        evt.consume();

    }//GEN-LAST:event_txtTallaKeyTyped

    private void txtCategoriaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaKeyTyped
        char car = evt.getKeyChar();
        if (!Character.isLetter(car) && car != ' '
                && car != KeyEvent.VK_BACK_SPACE
                && car != KeyEvent.VK_DELETE) {
            evt.consume();

        }
    }//GEN-LAST:event_txtCategoriaKeyTyped

    private void txtcompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcompraKeyTyped
        char car = evt.getKeyChar();
        String currentText = ((JTextField) evt.getSource()).getText();

        if (Character.isDigit(car)) {
            return;
        }
        if (car == '.') {
            if (currentText.contains(".")) {
                evt.consume();
            }
            return;
        }

        evt.consume();

    }//GEN-LAST:event_txtcompraKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char car = evt.getKeyChar();
        String currentText = ((JTextField) evt.getSource()).getText();

        if (Character.isDigit(car)) {
            return;
        }
        if (car == '.') {
            if (currentText.contains(".")) {
                evt.consume();
            }
            return;
        }

        evt.consume();

    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        char car = evt.getKeyChar();
        String currentText = ((JTextField) evt.getSource()).getText();

        if (Character.isDigit(car)) {
            return;
        }
        if (car == '.') {
            if (currentText.contains(".")) {
                evt.consume();
            }
            return;
        }

        evt.consume();

    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        limpiar();
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        char car = evt.getKeyChar();
        if (!Character.isLetter(car) && car != ' '
                && car != KeyEvent.VK_BACK_SPACE
                && car != KeyEvent.VK_DELETE) {
            evt.consume();

        }
    }//GEN-LAST:event_txtMarcaKeyTyped

    private void spinnerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spinnerKeyTyped
   
    }//GEN-LAST:event_spinnerKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
                char car = evt.getKeyChar();
        String currentText = ((JTextField) evt.getSource()).getText();

        if (Character.isDigit(car)) {
            return;
        }
        if (car == '.') {
            if (currentText.contains(".")) {
                evt.consume();
            }
            return;
        }

        evt.consume();
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtMarca1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarca1ActionPerformed
        
    }//GEN-LAST:event_txtMarca1ActionPerformed

    public void limpiar() {
        txtMarca.setText("");
        txtCodigo.setText("");
        txtTalla.setText("");
        txtCantidad.setText("");
        spinner.setValue(0);
        txtcompra.setText("");
        txtCategoria.setText("");
        txtcompra.setText("");
    }
    
    private void Boton() {
        if (!editando) {
            try {
                // Validar campos obligatorios
                if (txtMarca.getText().trim().isEmpty()
                        || txtCodigo.getText().trim().isEmpty()
                        || txtCantidad.getText().trim().isEmpty()
                        || txtcompra.getText().trim().isEmpty()) {

                    javax.swing.JOptionPane.showMessageDialog(this,
                            "Por favor complete todos los campos obligatorios",
                            "Campos incompletos",
                            javax.swing.JOptionPane.WARNING_MESSAGE);
                    return;
                }

                Producto nuevoProducto = new Producto();
                
                if(compararBarcodeCon(txtCodigo.getText().trim())) {
                    return;
                }

                // Configurar los valores del nuevo producto
                nuevoProducto.setMarca(txtMarca.getText().trim());
                nuevoProducto.setBarcode(txtCodigo.getText().trim());
                nuevoProducto.setTalla(txtTalla.getText().trim());
                nuevoProducto.setCant(Integer.parseInt(txtCantidad.getText().trim()));

                double Descount = ((Number) spinner.getValue()).doubleValue() / 100.0;
                nuevoProducto.setDescount(Descount);

                nuevoProducto.setCompra(Double.parseDouble(txtcompra.getText().trim()));
                nuevoProducto.setPrecio(Double.parseDouble(txtPrecio.getText().trim()));
                nuevoProducto.setCategoria(txtCategoria.getText().trim());
                
                if(nuevoProducto.getIngresos() <= 0) {
                    int resp = JOptionPane.showConfirmDialog(
                            null,
                            "Los ingresos de este producto son menores o iguales a cero\n" +
                            "Se recomienda que suba el precio\n" +
                            "¿Aun asi desea guardar este producto?",
                            "Advertencia",
                            JOptionPane.YES_NO_OPTION,  JOptionPane.WARNING_MESSAGE);
                    if(resp == JOptionPane.NO_OPTION) {
                        return;
                    }
                }

                // Agregar el NUEVO producto a la lista
                lista.setAgregaProducto(nuevoProducto);

                // Mostrar mensaje de éxito
                JOptionPane.showMessageDialog(this,
                        "Producto agregado exitosamente",
                        "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);

                limpiar();
                
                this.dispose();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,
                        "Error en los datos numéricos: Asegúrese de ingresar números válidos",
                        "Error de formato",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                        "Error al agregar producto: " + e.getMessage(),
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            if (txtMarca.getText().trim().isEmpty()
                        || txtCodigo.getText().trim().isEmpty()
                        || txtCantidad.getText().trim().isEmpty()
                        || txtcompra.getText().trim().isEmpty()) {

                    JOptionPane.showMessageDialog(this,
                            "Por favor complete todos los campos obligatorios",
                            "Campos incompletos",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                } else {
                String barcode = txtCodigo.getText().trim();
                String marca = txtMarca.getText().trim();
                String categoria = txtCategoria.getText().trim();
                String talla = txtTalla.getText().trim();
                String descount = spinner.getValue().toString();
                String compra = txtcompra.getText().trim();
                String precio = txtPrecio.getText().trim();
                String cantidad = txtCantidad.getText().trim();
                
                if(lista.setEditarProducto(barcode, marca, categoria, talla, descount, compra, precio, cantidad)) {
                this.dispose();
                }
            }
        }
}
        public boolean compararBarcodeCon(String barcode) {
        for(Producto pro : lista.getListaProducto()) {
           if(pro.getBarcode().equals(barcode)) {
               JOptionPane.showMessageDialog(null, "El codigo de barra que ingresaste ya existe intenta otro", "Advertencia", JOptionPane.WARNING_MESSAGE);
               return true;
           }
       }
        return false;
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public model.Imagen imagen1;
    private model.Imagen imagen2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    public model.Jpanelbtn jpanelbtn1;
    public static model.spinnerRedondeado spinner;
    public static model.txtField txtCantidad;
    public static model.txtField txtCategoria;
    public static model.txtField txtCodigo;
    public static model.txtField txtMarca;
    public static model.txtField txtPrecio;
    public static model.txtField txtTalla;
    public static model.txtField txtcompra;
    // End of variables declaration//GEN-END:variables
}
