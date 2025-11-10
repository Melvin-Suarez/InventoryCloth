package view;

import controller.Listas;
import controller.Login;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import model.User;

public class Crear_nuevo_usuario extends javax.swing.JFrame {

    Login controller;
    private Listas lista;
    private boolean isAdmin;
    private Cursor mano = new Cursor(Cursor.HAND_CURSOR);
    
    
    public Crear_nuevo_usuario() {
        initComponents();
        jPanel1.requestFocus();
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jPanel1.setFocusable(true);
        controller = new Login();
        lista = Listas.getInstance();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ventana1 = new model.Ventana();
        jPanel1 = new javax.swing.JPanel();
        txtUser = new model.txtField();
        txtPass = new model.PassField();
        jPanelRedo1 = new model.JPanelRedo();
        jLabel7 = new javax.swing.JLabel();
        jPanelRedo2 = new model.JPanelRedo();
        imagen1 = new model.Imagen();
        cboxAdmin = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        figura3 = new model.Figura();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        figura4 = new model.Figura();
        imagen2 = new model.Imagen();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ventana1.setLayout(new java.awt.GridBagLayout());

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new java.awt.GridBagLayout());

        txtUser.setForeground(Color.gray);
        txtUser.setText("Usuario");
        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(35, 100, 0, 100);
        jPanel1.add(txtUser, gridBagConstraints);

        txtPass.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPass.setForeground(Color.gray);
        txtPass.setText("123456789");
        txtPass.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(35, 100, 0, 100);
        jPanel1.add(txtPass, gridBagConstraints);

        jPanelRedo1.setLayout(new java.awt.GridBagLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText(" Crear cuenta");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanelRedo1.add(jLabel7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(74, 0, 51, 0);
        jPanel1.add(jPanelRedo1, gridBagConstraints);

        jPanelRedo2.setRadio(180.0);
        jPanelRedo2.setLayout(new java.awt.GridBagLayout());

        imagen1.setText("imagen1");
        imagen1.setRuta("/Recursos/User.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 67;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(29, 33, 37, 32);
        jPanelRedo2.add(imagen1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -20;
        gridBagConstraints.ipady = -14;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(33, 0, 0, 0);
        jPanel1.add(jPanelRedo2, gridBagConstraints);

        cboxAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cboxAdmin.setForeground(new java.awt.Color(51, 102, 255));
        cboxAdmin.setText("Admin");
        cboxAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAdminActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 100, 150, 100);
        jPanel1.add(cboxAdmin, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ventana1.add(jPanel1, gridBagConstraints);

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridBagLayout());

        figura3.setColorRelleno(new java.awt.Color(33, 0, 110));
        figura3.setPreferredSize(new java.awt.Dimension(400, 200));
        figura3.setRuta("/Recursos/Vector.png");
        figura3.setTransparenciaPorcentaje(50);
        figura3.setLayout(new java.awt.GridBagLayout());

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Crear Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 20, 100);
        figura3.add(lblTitulo, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa tu correo o contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        figura3.add(jLabel2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 100, 50);
        jPanel2.add(figura3, gridBagConstraints);

        figura4.setColorRelleno(new java.awt.Color(33, 0, 110));
        figura4.setPreferredSize(new java.awt.Dimension(400, 200));
        figura4.setRuta("/Recursos/VectorAbajo.png");
        figura4.setTransparenciaPorcentaje(50);
        figura4.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 50);
        jPanel2.add(figura4, gridBagConstraints);

        imagen2.setText("imagen1");
        imagen2.setName(""); // NOI18N
        imagen2.setPreferredSize(new java.awt.Dimension(42, 42));
        imagen2.setRuta("/recursos/atras.png");
        imagen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagen2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagen2MousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(imagen2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        ventana1.add(jPanel2, gridBagConstraints);

        getContentPane().add(ventana1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        crearUsuario();
    }//GEN-LAST:event_jLabel7MousePressed

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("Usuario")) {
            txtUser.setText("");

            txtUser.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().equals("")) {
            txtUser.setText("Usuario");

            txtUser.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        String Contrasenia = new String(txtPass.getPassword());

        if (Contrasenia.equals("123456789")) {
            txtPass.setText("");

            txtPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        String Contrasenia = new String(txtPass.getPassword());

        if (Contrasenia.equals("")) {
            txtPass.setText("123456789");

            txtPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        jPanel1.requestFocus();
    }//GEN-LAST:event_jPanel1MousePressed

    private void cboxAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAdminActionPerformed
        if (cboxAdmin.isSelected()) {
            lblTitulo.setText("Crear Admin");
            isAdmin = true;
        } else {
            lblTitulo.setText("Crear Usuario");
            isAdmin = false;
        }
    }//GEN-LAST:event_cboxAdminActionPerformed

    private void txtUserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPass.requestFocus();
        }
    }//GEN-LAST:event_txtUserKeyPressed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            crearUsuario();
        }
    }//GEN-LAST:event_txtPassKeyPressed

    private void imagen2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MouseEntered
        imagen2.setCursor(mano);
    }//GEN-LAST:event_imagen2MouseEntered

    private void imagen2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagen2MousePressed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_imagen2MousePressed

    private void crearUsuario() {
        String contra = new String(txtPass.getPassword());
        User usuario = new User(isAdmin, txtUser.getText().trim(), contra);
        if(controller.compararUsuarioCon(usuario)) {
            lista.setAgregarUsuario(usuario);
            new MenuPrincipal().setVisible(true);
            this.dispose();
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_nuevo_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cboxAdmin;
    private model.Figura figura3;
    private model.Figura figura4;
    private model.Imagen imagen1;
    private model.Imagen imagen2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private model.JPanelRedo jPanelRedo1;
    private model.JPanelRedo jPanelRedo2;
    private javax.swing.JLabel lblTitulo;
    private model.PassField txtPass;
    private model.txtField txtUser;
    private model.Ventana ventana1;
    // End of variables declaration//GEN-END:variables
}
