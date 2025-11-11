
package view;

import java.awt.Cursor;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.formulario;

public class MenuPrincipal extends javax.swing.JFrame {
    Cursor mano = new Cursor(Cursor.HAND_CURSOR);
    Configuracion config;
     
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
      

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        ventana1 = new model.Ventana();
        jLabel2 = new javax.swing.JLabel();
        figura1 = new model.Figura();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanelRedo2 = new model.JPanelRedo();
        imagen3 = new model.Imagen();
        jLabel4 = new javax.swing.JLabel();
        jPanelRedo4 = new model.JPanelRedo();
        imagen4 = new model.Imagen();
        jLabel5 = new javax.swing.JLabel();
        jPanelRedo1 = new model.JPanelRedo();
        imagen2 = new model.Imagen();
        jLabel3 = new javax.swing.JLabel();
        jPanelRedo5 = new model.JPanelRedo();
        imagen5 = new model.Imagen();
        jLabel6 = new javax.swing.JLabel();
        jPanelRedo6 = new model.JPanelRedo();
        imagen1 = new model.Imagen();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        ventana1.setPreferredSize(new java.awt.Dimension(70, 70));
        ventana1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Menu Principal");
        ventana1.add(jLabel2, new java.awt.GridBagConstraints());

        figura1.setColorRelleno(java.awt.Color.white);
        figura1.setPreferredSize(new java.awt.Dimension(42, 42));
        figura1.setRuta("/Recursos/Cerrarsesion.png");
        figura1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                figura1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                figura1MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ventana1.add(figura1, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Menu Principal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ventana1.add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Admin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        ventana1.add(jLabel8, gridBagConstraints);

        jPanel1.add(ventana1, java.awt.BorderLayout.NORTH);

        jPanel3.setPreferredSize(new java.awt.Dimension(524, 262));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanelRedo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelRedo2MousePressed(evt);
            }
        });
        jPanelRedo2.setLayout(new java.awt.GridBagLayout());

        imagen3.setText("imagen2");
        imagen3.setRuta("/Recursos/Inventario.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        jPanelRedo2.add(imagen3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Historial de ventas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanelRedo2.add(jLabel4, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jPanelRedo2, gridBagConstraints);

        jPanelRedo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRedo4MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelRedo4MousePressed(evt);
            }
        });
        jPanelRedo4.setLayout(new java.awt.GridBagLayout());

        imagen4.setText("imagen4");
        imagen4.setPreferredSize(new java.awt.Dimension(50, 50));
        imagen4.setRuta("/Recursos/Distribuidor.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        jPanelRedo4.add(imagen4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Distribuidores");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanelRedo4.add(jLabel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jPanelRedo4, gridBagConstraints);

        jPanelRedo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRedo1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelRedo1MousePressed(evt);
            }
        });
        jPanelRedo1.setLayout(new java.awt.GridBagLayout());

        imagen2.setText("imagen2");
        imagen2.setRuta("/Recursos/Inventario.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        jPanelRedo1.add(imagen2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inventario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanelRedo1.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jPanelRedo1, gridBagConstraints);

        jPanelRedo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRedo5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelRedo5MousePressed(evt);
            }
        });
        jPanelRedo5.setLayout(new java.awt.GridBagLayout());

        imagen5.setText("imagen5");
        imagen5.setPreferredSize(new java.awt.Dimension(50, 50));
        imagen5.setRuta("/Recursos/Config.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        jPanelRedo5.add(imagen5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Configuración");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanelRedo5.add(jLabel6, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jPanelRedo5, gridBagConstraints);

        jPanelRedo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelRedo6MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelRedo6MousePressed(evt);
            }
        });
        jPanelRedo6.setLayout(new java.awt.GridBagLayout());

        imagen1.setText("imagen1");
        imagen1.setPreferredSize(new java.awt.Dimension(50, 50));
        imagen1.setRuta("/Recursos/Crear.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        jPanelRedo6.add(imagen1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanelRedo6.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel3.add(jPanelRedo6, gridBagConstraints);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE)
                .addGap(179, 179, 179))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelRedo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRedo1MousePressed
        new Inventario_tabla().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelRedo1MousePressed

    private void jPanelRedo1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRedo1MouseEntered
        jPanelRedo1.setCursor(mano);
    }//GEN-LAST:event_jPanelRedo1MouseEntered

    private void jPanelRedo4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRedo4MouseEntered
          jPanelRedo4.setCursor(mano);
    }//GEN-LAST:event_jPanelRedo4MouseEntered

    private void jPanelRedo4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRedo4MousePressed
        new Distribuidores_tabla().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelRedo4MousePressed

    private void jPanelRedo6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRedo6MouseEntered
        jPanelRedo6.setCursor(mano);
    }//GEN-LAST:event_jPanelRedo6MouseEntered

    private void jPanelRedo6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRedo6MousePressed
        new Crear_nuevo_usuario().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelRedo6MousePressed

    private void figura1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_figura1MousePressed
        int respuesta = JOptionPane.showConfirmDialog(
            this,
            "¿Estás seguro que deseas cerrar sesión?",
            "Confirmar Cierre de Sesión",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );
        
        if (respuesta == JOptionPane.YES_OPTION) {
                     new LoginView().setVisible(true);  
                      this.dispose();

        } else {
            JOptionPane.showMessageDialog(this, "Continúas en el sistema");
            
          
        }
        
       
        
    }//GEN-LAST:event_figura1MousePressed

    private void figura1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_figura1MouseEntered
        figura1.setCursor(mano);
    }//GEN-LAST:event_figura1MouseEntered

    private void jPanelRedo5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRedo5MouseEntered
        jPanelRedo5.setCursor(mano);
    }//GEN-LAST:event_jPanelRedo5MouseEntered

    private void jPanelRedo5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRedo5MousePressed
         if(config == null || config.isClosed()) {
        config = new Configuracion();
        jPanel2.add(config);
        config.setVisible(true);
        }
    }//GEN-LAST:event_jPanelRedo5MousePressed

    private void jPanelRedo2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRedo2MousePressed
       new Historial_de_venta().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jPanelRedo2MousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.Figura figura1;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private model.JPanelRedo jPanelRedo1;
    private model.JPanelRedo jPanelRedo2;
    private model.JPanelRedo jPanelRedo4;
    private model.JPanelRedo jPanelRedo5;
    private model.JPanelRedo jPanelRedo6;
    private model.Ventana ventana1;
    // End of variables declaration//GEN-END:variables
}
