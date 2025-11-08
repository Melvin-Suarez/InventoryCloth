package view;

import java.awt.Cursor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import controller.inventory;
import java.awt.Color;

public class Inventario_tabla extends JFrame {
    
    private Cursor mano = new Cursor(Cursor.HAND_CURSOR);
    private inventory modelo;
    private formulario form;
    private boolean Crearventana = false;

    public Inventario_tabla() {
        initComponents();
        modelo = new inventory();
        Tabla.setModel(modelo);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        desktopPane = new javax.swing.JDesktopPane();
        ventana1 = new model.Ventana();
        imagen1 = new model.Imagen();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        txtField1 = new model.txtField();
        jpanelbtn1 = new model.Jpanelbtn();
        jLabel1 = new javax.swing.JLabel();
        imagen2 = new model.Imagen();
        jpanelbtn5 = new model.Jpanelbtn();
        jLabel2 = new javax.swing.JLabel();
        imagen3 = new model.Imagen();
        jpanelbtn6 = new model.Jpanelbtn();
        jLabel3 = new javax.swing.JLabel();
        imagen4 = new model.Imagen();
        jpanelbtn7 = new model.Jpanelbtn();
        jLabel4 = new javax.swing.JLabel();
        imagen5 = new model.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        jLabel5.setText("Inventario");
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

        jpanelbtn1.setBackground(new java.awt.Color(0, 110, 53));
        jpanelbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpanelbtn1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpanelbtn1MousePressed(evt);
            }
        });
        jpanelbtn1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Agregar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn1.add(jLabel1, gridBagConstraints);

        imagen2.setForeground(new java.awt.Color(255, 255, 255));
        imagen2.setText("imagen2");
        imagen2.setPreferredSize(new java.awt.Dimension(30, 30));
        imagen2.setRuta("/recursos/Agregar.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn1.add(imagen2, gridBagConstraints);

        jpanelbtn5.setBackground(new java.awt.Color(5, 159, 255));
        jpanelbtn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpanelbtn5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpanelbtn5MousePressed(evt);
            }
        });
        jpanelbtn5.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Actualizar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn5.add(jLabel2, gridBagConstraints);

        imagen3.setForeground(new java.awt.Color(255, 255, 255));
        imagen3.setText("imagen2");
        imagen3.setPreferredSize(new java.awt.Dimension(30, 30));
        imagen3.setRuta("/recursos/Actualizar.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn5.add(imagen3, gridBagConstraints);

        jpanelbtn6.setBackground(new java.awt.Color(170, 167, 30));
        jpanelbtn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpanelbtn6MousePressed(evt);
            }
        });
        jpanelbtn6.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Editar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn6.add(jLabel3, gridBagConstraints);

        imagen4.setForeground(new java.awt.Color(255, 255, 255));
        imagen4.setText("imagen2");
        imagen4.setPreferredSize(new java.awt.Dimension(30, 30));
        imagen4.setRuta("/recursos/Editar.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn6.add(imagen4, gridBagConstraints);

        jpanelbtn7.setBackground(new java.awt.Color(255, 0, 4));
        jpanelbtn7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpanelbtn7MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpanelbtn7MousePressed(evt);
            }
        });
        jpanelbtn7.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eliminar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn7.add(jLabel4, gridBagConstraints);

        imagen5.setForeground(new java.awt.Color(255, 255, 255));
        imagen5.setText("imagen2");
        imagen5.setPreferredSize(new java.awt.Dimension(30, 30));
        imagen5.setRuta("/recursos/Eliminar.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jpanelbtn7.add(imagen5, gridBagConstraints);

        desktopPane.setLayer(ventana1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(txtField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jpanelbtn1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jpanelbtn5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jpanelbtn6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(jpanelbtn7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addComponent(jpanelbtn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jpanelbtn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33)
                        .addComponent(jpanelbtn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(jpanelbtn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(158, 158, 158))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(ventana1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpanelbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imagen1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MousePressed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imagen1MousePressed

    private void jpanelbtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn1MousePressed
        try {
            if (!Crearventana) {
                Crearventana = true;
                form = new formulario();
                desktopPane.add(form);
            }
            form.setVisible(true);
            form.editando = false;
            form.limpiar();
            form.jpanelbtn1.setBackground(new Color(0, 110, 53));
            form.jLabel18.setText("Agregar Producto");
            form.imagen1.setRuta("/Recursos/Agregar.png");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al abrir el formulario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jpanelbtn1MousePressed

    private void jpanelbtn6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn6MousePressed
        try {
            if (!Crearventana) {
                Crearventana = true;
                form = new formulario();
                desktopPane.add(form);
            }
            form.setVisible(true);
            form.editando = true;
            form.limpiar();
            modelo.setCelda(Tabla.getSelectedRow());
            form.jpanelbtn1.setBackground(new Color(170, 167, 30));
            form.jLabel18.setText("Editar Producto");
            form.imagen1.setRuta("/Recursos/Editar.png");
            modelo.editarTabla();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al abrir el formulario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jpanelbtn6MousePressed

    private void jpanelbtn5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn5MousePressed
        actualizarTabla();
    }//GEN-LAST:event_jpanelbtn5MousePressed

    private void jpanelbtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn1MouseEntered
        jpanelbtn1.setCursor(mano);
    }//GEN-LAST:event_jpanelbtn1MouseEntered

    private void jpanelbtn5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn5MouseEntered
        jpanelbtn5.setCursor(mano);
    }//GEN-LAST:event_jpanelbtn5MouseEntered

    private void imagen1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen1MouseEntered
        imagen1.setCursor(mano);
    }//GEN-LAST:event_imagen1MouseEntered

    private void jpanelbtn7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn7MousePressed
        
        modelo.setCelda(Tabla.getSelectedRow());
        
        modelo.eliminarProducto();
    }//GEN-LAST:event_jpanelbtn7MousePressed

    private void jpanelbtn7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpanelbtn7MouseEntered
        jpanelbtn7.setCursor(mano);
    }//GEN-LAST:event_jpanelbtn7MouseEntered

    private void actualizarTabla() {
        modelo.llenarTabla();
    }
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario_tabla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JDesktopPane desktopPane;
    private model.Imagen imagen1;
    private model.Imagen imagen2;
    private model.Imagen imagen3;
    private model.Imagen imagen4;
    private model.Imagen imagen5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private model.Jpanelbtn jpanelbtn1;
    private model.Jpanelbtn jpanelbtn5;
    private model.Jpanelbtn jpanelbtn6;
    private model.Jpanelbtn jpanelbtn7;
    private model.txtField txtField1;
    private model.Ventana ventana1;
    // End of variables declaration//GEN-END:variables

}
