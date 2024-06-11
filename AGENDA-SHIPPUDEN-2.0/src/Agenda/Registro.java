
package Agenda;

import static Agenda.Logear.ValidarContraseña;
import Clase.BaseDeDatos;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;


public class Registro extends javax.swing.JFrame {
    Connection n4 = BaseDeDatos.getConnection();

    
    public Registro() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Usuario2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Contraseña2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Contraseña22 = new javax.swing.JTextField();
        BotonRegistrar2 = new javax.swing.JButton();
        BotonAtras = new javax.swing.JButton();
        BotonSalir2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Ninja Naruto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("REGISTRO");

        jLabel2.setBackground(new java.awt.Color(255, 153, 0));
        jLabel2.setFont(new java.awt.Font("Ninja Naruto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("USUARIO");

        Usuario2.setForeground(new java.awt.Color(102, 102, 102));
        Usuario2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuario2.setCaretColor(new java.awt.Color(102, 102, 102));
        Usuario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario2ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 153, 0));
        jLabel3.setFont(new java.awt.Font("Ninja Naruto", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("CONTRASEÑA");

        Contraseña2.setForeground(new java.awt.Color(102, 102, 102));
        Contraseña2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contraseña2.setCaretColor(new java.awt.Color(102, 102, 102));

        jLabel4.setBackground(new java.awt.Color(255, 153, 0));
        jLabel4.setFont(new java.awt.Font("Ninja Naruto", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("CONFIRMAR CONTRASEÑA");

        Contraseña22.setForeground(new java.awt.Color(102, 102, 102));
        Contraseña22.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contraseña22.setCaretColor(new java.awt.Color(102, 102, 102));

        BotonRegistrar2.setBackground(new java.awt.Color(102, 102, 102));
        BotonRegistrar2.setFont(new java.awt.Font("Ninja Naruto", 0, 14)); // NOI18N
        BotonRegistrar2.setForeground(new java.awt.Color(255, 153, 0));
        BotonRegistrar2.setText("Registrarse");
        BotonRegistrar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonRegistrar2.setBorderPainted(false);
        BotonRegistrar2.setContentAreaFilled(false);
        BotonRegistrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrar2ActionPerformed(evt);
            }
        });

        BotonAtras.setBackground(new java.awt.Color(102, 102, 102));
        BotonAtras.setFont(new java.awt.Font("Ninja Naruto", 0, 14)); // NOI18N
        BotonAtras.setForeground(new java.awt.Color(255, 153, 0));
        BotonAtras.setText("Atrás");
        BotonAtras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAtras.setBorderPainted(false);
        BotonAtras.setContentAreaFilled(false);
        BotonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAtrasActionPerformed(evt);
            }
        });

        BotonSalir2.setBackground(new java.awt.Color(102, 102, 102));
        BotonSalir2.setFont(new java.awt.Font("Ninja Naruto", 0, 14)); // NOI18N
        BotonSalir2.setForeground(new java.awt.Color(255, 153, 0));
        BotonSalir2.setText("Salir");
        BotonSalir2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonSalir2.setBorderPainted(false);
        BotonSalir2.setContentAreaFilled(false);
        BotonSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalir2ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yahiko-5120x2880-11912 (1).png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/yahiko-5120x2880-11912 (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(BotonSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(Usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Contraseña22, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(BotonRegistrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Contraseña2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Contraseña22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(BotonRegistrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalir2ActionPerformed
        dispose();
    }//GEN-LAST:event_BotonSalir2ActionPerformed

    private void BotonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAtrasActionPerformed
        Logear L2 = new Logear();
        L2.setVisible(true);
        L2.setLocationRelativeTo(null);
        L2.setTitle("Aldea");
        dispose();
    }//GEN-LAST:event_BotonAtrasActionPerformed

    private void BotonRegistrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrar2ActionPerformed
        String u2= Usuario2.getText();
        String p2= Contraseña2.getText();
        String p3= Contraseña22.getText();

        if (!u2.isEmpty()&&!p2.isEmpty()&&!p3.isEmpty()) {

            if (p2.equals(p3)) {
                if (ValidarContraseña(p2)) {
                    String veri = "SELECT COUNT(*)FROM usuarios WHERE Nombre = ?";// Verifica en la bdd si ya hay un usuario con ese nombre
                    try (PreparedStatement stmt = n4.prepareStatement(veri) ){
                        stmt.setString(1,u2);
                        ResultSet rst=stmt.executeQuery();
                        if (rst.next()&&rst.getInt(1)>0) { // Si el usuario ya existe envia e msj
                            JOptionPane.showMessageDialog(null, "El nombre de usuario ya esta en uso, coloque otro");

                        }else{
                            String agre="INSERT INTO usuarios (Nombre, Contraseña)VALUES(?,?)";
                            try (PreparedStatement stmt2 = n4.prepareStatement(agre)){
                                stmt2.setString(1,u2);
                                stmt2.setString(2,p2);
                                int act = stmt2.executeUpdate();// Ejecuta la consulta y obtiene el numero de filas afectadas
                                if (act>0) {
                                    JOptionPane.showMessageDialog(this,"Registro exitodo");
                                    Inicio ini = new  Inicio();
                                    ini.setVisible(true);
                                    ini.setTitle("Inicio Agenda");
                                    ini.setLocationRelativeTo(null);
                                    dispose();

                                }else{
                                    JOptionPane.showMessageDialog(this, "Registracion mala ");
                                }

                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(this, "ERROR "+e.getMessage());

                            }
                        }

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Usuario no vefiricado "+e.getMessage());

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "CONTRASEÑA NO VALIDA");
                }
            }else{JOptionPane.showMessageDialog(null,"CONTRASEÑAS DIFERENTES");}
        } else {
            JOptionPane.showMessageDialog(null, "LOS CAMPOS DEBEN ESTAR LLENOS");
        }

    }//GEN-LAST:event_BotonRegistrar2ActionPerformed

    private void Usuario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Usuario2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAtras;
    private javax.swing.JButton BotonRegistrar2;
    private javax.swing.JButton BotonSalir2;
    private javax.swing.JTextField Contraseña2;
    private javax.swing.JTextField Contraseña22;
    private javax.swing.JTextField Usuario2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
