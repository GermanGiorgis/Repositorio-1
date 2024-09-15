
package Agenda;

import Clase.BaseDeDatos;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.applet.AudioClip;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class Logear extends javax.swing.JFrame {
    Connection n = BaseDeDatos.getConnection(); // Conexion a base de datos
     
   
    public Logear() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Usuario1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Botoningresar = new javax.swing.JButton();
        BotonRegistrar = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Contraseña1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Ninja Naruto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("INICIO DE SESION ");

        jLabel2.setFont(new java.awt.Font("Ninja Naruto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText(" usuario");

        Usuario1.setBackground(new java.awt.Color(102, 102, 102));
        Usuario1.setForeground(new java.awt.Color(255, 255, 255));
        Usuario1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Usuario1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ninja Naruto", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Contraseña");

        Botoningresar.setBackground(new java.awt.Color(255, 255, 255));
        Botoningresar.setFont(new java.awt.Font("Ninja Naruto", 0, 14)); // NOI18N
        Botoningresar.setForeground(new java.awt.Color(255, 153, 0));
        Botoningresar.setText("Ingresar");
        Botoningresar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botoningresar.setBorderPainted(false);
        Botoningresar.setContentAreaFilled(false);
        Botoningresar.setDefaultCapable(false);
        Botoningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotoningresarActionPerformed(evt);
            }
        });

        BotonRegistrar.setFont(new java.awt.Font("Ninja Naruto", 0, 14)); // NOI18N
        BotonRegistrar.setForeground(new java.awt.Color(255, 153, 0));
        BotonRegistrar.setText("Registrar");
        BotonRegistrar.setBorderPainted(false);
        BotonRegistrar.setContentAreaFilled(false);
        BotonRegistrar.setDefaultCapable(false);
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonSalir.setFont(new java.awt.Font("Ninja Naruto", 0, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 153, 0));
        BotonSalir.setText("Salir");
        BotonSalir.setBorderPainted(false);
        BotonSalir.setContentAreaFilled(false);
        BotonSalir.setDefaultCapable(false);
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/narutovsssasukegrandef (1).jpg"))); // NOI18N

        Contraseña1.setBackground(new java.awt.Color(102, 102, 102));
        Contraseña1.setForeground(new java.awt.Color(255, 255, 255));
        Contraseña1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(150, 150, 150))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Botoningresar)
                .addGap(135, 135, 135)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contraseña1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSalir)
                    .addComponent(Botoningresar)
                    .addComponent(BotonRegistrar))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed

        Registro R = new Registro ();
        R.setVisible(true);
        R.setLocationRelativeTo(null);
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/pain-2.wav"));
        Sound.play();
        dispose();
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotoningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotoningresarActionPerformed
        USUARIO =  Usuario1.getText();
        PASW = Contraseña1.getText();
        String p = PASW;
        String u = USUARIO;

        if (!u.isEmpty()&&!p.isEmpty()) {
            String query = "SELECT*FROM Usuarios WHERE Nombre=? AND Contraseña=?";
            try (PreparedStatement stmt=n.prepareStatement(query)){
                stmt.setString(1,u);
                stmt.setString(2,hashpassword(p));
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this,"Bienvenido "+u);
                    Inicio in = new Inicio();
                    in.setVisible(true);
                    in.setLocationRelativeTo(null);
                    AudioClip Sound;
                    Sound = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/naruto-trap.wav"));
                    Sound.play();
                    dispose();

                }else{
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                    Registro r = new Registro();
                    r.setVisible(true);
                    r.setLocationRelativeTo(null);
                    dispose();

                }

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_BotoningresarActionPerformed

    private void Usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Usuario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Usuario1ActionPerformed
               public static String USUARIO;
               public static String PASW;
//METODO PARA VALIDAR CONTRASEÑA
    public static boolean ValidarContraseña(String contraseña1) {
        //EXPRESION REGULAR PARA VALIDAR CONTRASEÑA
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#-.,$%^&+=]).{6,}$";
        //COMPILA LA EXPRESION REGULAR EN UN PATRON
        Pattern pattern = Pattern.compile(regex);
        //CREA UN MATCHER PARA LA CONTRASEÑA DADA
         Matcher matcher = pattern.matcher(contraseña1);
         // Devuelve verdadero si la contraseña cumple con la expresión regular
         return matcher.matches();
    }
    private static String hashpassword(String password){
        try {
            MessageDigest h = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = h.digest(password.getBytes());
            return bytesToHex(encodedHash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
       private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton Botoningresar;
    private javax.swing.JPasswordField Contraseña1;
    private javax.swing.JTextField Usuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
