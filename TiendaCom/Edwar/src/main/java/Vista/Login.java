/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package Vista;

import java.awt.Menu;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

    
    


       
public class Login extends javax.swing.JFrame {

    public Login() {
         initComponents();
    }

//    public JComboBox<String> getTipo() {
//        return tipo;
//    }
//
//    public void setTipo(JComboBox<String> tipo) {
//        this.tipo = tipo;
//    }

    public JButton getBtnIniciarSesion() {
        return BtnIniciarSesion;
    }

    public void setBtnIniciarSesion(JButton BtnIniciarSesion) {
        this.BtnIniciarSesion = BtnIniciarSesion;
    }  

    public JButton getBtnMostrar() {
        return BtnMostrar;
    }

    public void setBtnMostrar(JButton BtnMostrar) {
        this.BtnMostrar = BtnMostrar;
    }

    public JTextField getTxtUsuario() {
        return TxtUsuario;
    }

    public void setTxtUsuario(JTextField TxtUsuario) {
        this.TxtUsuario = TxtUsuario;
    }

    public JPasswordField getTxtcontrasena() {
        return Txtcontrasena;
    }

    public void setTxtcontrasena(JPasswordField Txtcontrasena) {
        this.Txtcontrasena = Txtcontrasena;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPcontrasena = new javax.swing.JPanel();
        iniciar_session = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        logi = new javax.swing.JLabel();
        BtnIniciarSesion = new javax.swing.JButton();
        TxtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        clave = new javax.swing.JLabel();
        Txtcontrasena = new javax.swing.JPasswordField();
        BtnMostrar = new javax.swing.JButton();
        tipo = new javax.swing.JComboBox<>();

        jLabel1.setText("Iniciar Secion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(381, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPcontrasena.setBackground(new java.awt.Color(0, 102, 102));
        jPcontrasena.setForeground(new java.awt.Color(0, 0, 153));
        jPcontrasena.setToolTipText("");

        iniciar_session.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        iniciar_session.setForeground(new java.awt.Color(255, 255, 255));
        iniciar_session.setText("Iniciar Sesion");

        usuario.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(255, 255, 255));
        contraseña.setText("Contraseña");

        logi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario (1).png"))); // NOI18N

        BtnIniciarSesion.setBackground(new java.awt.Color(0, 153, 153));
        BtnIniciarSesion.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        BtnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BtnIniciarSesion.setText("iniciar sesion");
        BtnIniciarSesion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2));
        BtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarSesionActionPerformed(evt);
            }
        });

        TxtUsuario.setBackground(new java.awt.Color(0, 102, 102));
        TxtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TxtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TxtUsuario.setBorder(null);
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario (3).png"))); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        clave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clave (2).png"))); // NOI18N

        Txtcontrasena.setBackground(new java.awt.Color(0, 102, 102));
        Txtcontrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Txtcontrasena.setForeground(new java.awt.Color(255, 255, 255));
        Txtcontrasena.setBorder(null);
        Txtcontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtcontrasenaActionPerformed(evt);
            }
        });

        BtnMostrar.setBackground(new java.awt.Color(0, 153, 153));
        BtnMostrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnMostrar.setForeground(new java.awt.Color(255, 255, 255));
        BtnMostrar.setText("mostrar");
        BtnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarActionPerformed(evt);
            }
        });

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPcontrasenaLayout = new javax.swing.GroupLayout(jPcontrasena);
        jPcontrasena.setLayout(jPcontrasenaLayout);
        jPcontrasenaLayout.setHorizontalGroup(
            jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcontrasenaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcontrasenaLayout.createSequentialGroup()
                        .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logi)
                            .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(181, 181, 181))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcontrasenaLayout.createSequentialGroup()
                        .addComponent(iniciar_session, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcontrasenaLayout.createSequentialGroup()
                        .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141))))
            .addGroup(jPcontrasenaLayout.createSequentialGroup()
                .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcontrasenaLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPcontrasenaLayout.createSequentialGroup()
                                .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPcontrasenaLayout.createSequentialGroup()
                                        .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator1)
                                            .addComponent(TxtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPcontrasenaLayout.createSequentialGroup()
                                        .addComponent(Txtcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                        .addGap(28, 28, 28)))
                                .addComponent(BtnMostrar))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPcontrasenaLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(contraseña)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPcontrasenaLayout.setVerticalGroup(
            jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcontrasenaLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(iniciar_session)
                .addGap(27, 27, 27)
                .addComponent(logi)
                .addGap(36, 36, 36)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(TxtUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPcontrasenaLayout.createSequentialGroup()
                        .addGroup(jPcontrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clave)
                            .addGroup(jPcontrasenaLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(BtnMostrar)))
                        .addGap(9, 9, 9))
                    .addGroup(jPcontrasenaLayout.createSequentialGroup()
                        .addComponent(Txtcontrasena)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//   void ocultar(){
//       if (tipo.getSelectedItem().equals("Administrador"))
//       {
//          Principal P = new Principal();
//            P.show();
//       }else {
//           if (tipo.getSelectedItem().equals("Usuario")){
//               Principal p = new Principal();
//             p.getFactura().setVisible(false);
//             p.show();         
//           }
//       }
//           }
    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void BtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarSesionActionPerformed
      
    }//GEN-LAST:event_BtnIniciarSesionActionPerformed

    private void BtnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnMostrarActionPerformed

    private void TxtcontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtcontrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtcontrasenaActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed
//        String usu = usuario.getText(),
//            con = contraseña.getText();
//        if(usu.equals("1")&& con.equals("1")){
//             Principal P = new Principal();
//            JOptionPane.showMessageDialog(null, "Bienvenido" + usu);
//           
//            ocultar();
//        }else {
//             JOptionPane.showMessageDialog(null, "Error verifique los datos");
//        }
//      
    }//GEN-LAST:event_tipoActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnIniciarSesion;
    private javax.swing.JButton BtnMostrar;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JPasswordField Txtcontrasena;
    private javax.swing.JLabel clave;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel iniciar_session;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPcontrasena;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logi;
    private javax.swing.JComboBox<String> tipo;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}