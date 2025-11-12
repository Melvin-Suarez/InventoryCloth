package view;

public class Configuracion extends javax.swing.JInternalFrame {

    public Configuracion() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnperfil = new model.Jpanelbtn();
        jLabel3 = new javax.swing.JLabel();
        imagen1 = new model.Imagen();
        btnperfil1 = new model.Jpanelbtn();
        jLabel2 = new javax.swing.JLabel();
        figura3 = new model.Figura();
        btnperfil2 = new model.Jpanelbtn();
        jLabel4 = new javax.swing.JLabel();
        imagen2 = new model.Imagen();
        btnperfil3 = new model.Jpanelbtn();
        jLabel5 = new javax.swing.JLabel();
        imagen3 = new model.Imagen();
        btnperfil4 = new model.Jpanelbtn();
        jLabel6 = new javax.swing.JLabel();
        imagen4 = new model.Imagen();
        jPanelRedo2 = new model.JPanelRedo();
        figura1 = new model.Figura();
        figura2 = new model.Figura();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(527, 763));
        setMinimumSize(new java.awt.Dimension(527, 763));
        setPreferredSize(new java.awt.Dimension(527, 763));

        jPanel1.setBackground(new java.awt.Color(208, 208, 208));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(527, 763));
        jPanel1.setMinimumSize(new java.awt.Dimension(527, 763));
        jPanel1.setPreferredSize(new java.awt.Dimension(527, 763));

        btnperfil.setBackground(new java.awt.Color(206, 206, 206));
        btnperfil.setBorder(null);
        btnperfil.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cambiar foto de perfil");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnperfil.add(jLabel3, gridBagConstraints);

        imagen1.setText("imagen1");
        imagen1.setRuta("/Recursos/UserLapiz.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnperfil.add(imagen1, gridBagConstraints);

        btnperfil1.setBackground(new java.awt.Color(206, 206, 206));
        btnperfil1.setBorder(null);
        btnperfil1.setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("cambiar nombre ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnperfil1.add(jLabel2, gridBagConstraints);

        figura3.setColorRelleno(new java.awt.Color(0, 0, 0));
        figura3.setRuta("/Recursos/Editar.png");

        javax.swing.GroupLayout figura3Layout = new javax.swing.GroupLayout(figura3);
        figura3.setLayout(figura3Layout);
        figura3Layout.setHorizontalGroup(
            figura3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        figura3Layout.setVerticalGroup(
            figura3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnperfil1.add(figura3, gridBagConstraints);

        btnperfil2.setBackground(new java.awt.Color(206, 206, 206));
        btnperfil2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnperfil2.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Privacidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnperfil2.add(jLabel4, gridBagConstraints);

        imagen2.setText("imagen2");
        imagen2.setRuta("/Recursos/Privacidad.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnperfil2.add(imagen2, gridBagConstraints);

        btnperfil3.setBackground(new java.awt.Color(206, 206, 206));
        btnperfil3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnperfil3.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Cambiar Tema");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnperfil3.add(jLabel5, gridBagConstraints);

        imagen3.setText("imagen3");
        imagen3.setRuta("/Recursos/Temas.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnperfil3.add(imagen3, gridBagConstraints);

        btnperfil4.setBackground(new java.awt.Color(206, 206, 206));
        btnperfil4.setForeground(new java.awt.Color(208, 208, 208));
        btnperfil4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnperfil4MousePressed(evt);
            }
        });
        btnperfil4.setLayout(new java.awt.GridBagLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Salir de la cuenta");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnperfil4.add(jLabel6, gridBagConstraints);

        imagen4.setText("imagen4");
        imagen4.setRuta("/Recursos/Cerrarsesion.png");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 24;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        btnperfil4.add(imagen4, gridBagConstraints);

        jPanelRedo2.setCenterColor(new java.awt.Color(255, 255, 255));
        jPanelRedo2.setOuterColor(new java.awt.Color(255, 255, 255));
        jPanelRedo2.setRadio(180.0);
        jPanelRedo2.setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout figura1Layout = new javax.swing.GroupLayout(figura1);
        figura1.setLayout(figura1Layout);
        figura1Layout.setHorizontalGroup(
            figura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        figura1Layout.setVerticalGroup(
            figura1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -200;
        gridBagConstraints.ipady = -200;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelRedo2.add(figura1, gridBagConstraints);

        figura2.setColorRelleno(new java.awt.Color(0, 0, 0));
        figura2.setRuta("/Recursos/User.png");

        javax.swing.GroupLayout figura2Layout = new javax.swing.GroupLayout(figura2);
        figura2.setLayout(figura2Layout);
        figura2Layout.setHorizontalGroup(
            figura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        figura2Layout.setVerticalGroup(
            figura2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.ipady = 90;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanelRedo2.add(figura2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnperfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnperfil1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addComponent(btnperfil2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnperfil3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnperfil4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelRedo2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanelRedo2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addComponent(btnperfil, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnperfil1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnperfil2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnperfil3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnperfil4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnperfil4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperfil4MousePressed
        new LoginView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnperfil4MousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private model.Jpanelbtn btnperfil;
    private model.Jpanelbtn btnperfil1;
    private model.Jpanelbtn btnperfil2;
    private model.Jpanelbtn btnperfil3;
    private model.Jpanelbtn btnperfil4;
    private model.Figura figura1;
    private model.Figura figura2;
    private model.Figura figura3;
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
    private javax.swing.JPanel jPanel1;
    private model.JPanelRedo jPanelRedo2;
    // End of variables declaration//GEN-END:variables
}
