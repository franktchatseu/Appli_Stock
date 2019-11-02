/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vue.view;

import com.vue.pack.*;
import com.classes.pack.Client;
import com.classes.pack.Utilisateur;
import com.implementation.pack.Acteur;
import com.implementation.pack.Role;
import com.sun.glass.events.KeyEvent;
import com.vue.view.vue_panier;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author tchatseu
 */
public class vue_connection extends javax.swing.JDialog {

    /**
     * Creates new form Choisir_Client
     */
    
    JDialog jconnection;
    public static Utilisateur user;
    public vue_connection(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        jconnection=this;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("PAGE DE CONNECTION A APPLI-STOCK");
        
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
        l_type = new javax.swing.JLabel();
        annuler = new javax.swing.JButton();
        l_idcli = new javax.swing.JLabel();
        login = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        connection = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        l_type.setFont(new java.awt.Font("Liberation Mono", 1, 16)); // NOI18N
        l_type.setForeground(new java.awt.Color(242, 153, 97));
        l_type.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_type.setText("Login");

        annuler.setBackground(new java.awt.Color(245, 240, 253));
        annuler.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        annuler.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/quitter.png"))); // NOI18N
        annuler.setToolTipText("annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerActionPerformed(evt);
            }
        });

        l_idcli.setFont(new java.awt.Font("Liberation Mono", 1, 16)); // NOI18N
        l_idcli.setForeground(new java.awt.Color(242, 153, 97));
        l_idcli.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        l_idcli.setText("Password");

        login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginKeyPressed(evt);
            }
        });

        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordKeyPressed(evt);
            }
        });

        connection.setBackground(new java.awt.Color(245, 240, 253));
        connection.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        connection.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/Key_32x32.png"))); // NOI18N
        connection.setToolTipText("connection");
        connection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(l_type, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(l_idcli, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(connection, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(annuler, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                        .addComponent(login)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_type, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_idcli, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(connection)
                    .addComponent(annuler))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setBackground(new java.awt.Color(245, 206, 189));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(65, 104, 59));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INTERFACE DE CONNECTION AU LOGICIEL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/image_de_connection.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_annulerActionPerformed

    private void connectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectionActionPerformed
        // TODO add your handling code here:
            connection();
    }//GEN-LAST:event_connectionActionPerformed

    private void passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyPressed
        // TODO add your handling code here:
         // TODO add your handling code here:
          switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                connection();
                break;
            default:
                break;
          }
    }//GEN-LAST:event_passwordKeyPressed

    private void loginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginKeyPressed
        // TODO add your handling code here:
         // TODO add your handling code here:
          switch(evt.getKeyCode()){
            case KeyEvent.VK_ENTER:
                connection();
                break;
            default:
                break;
          }
    }//GEN-LAST:event_loginKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vue_connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vue_connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vue_connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vue_connection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vue_connection dialog = new vue_connection(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private javax.swing.JButton connection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l_idcli;
    private javax.swing.JLabel l_type;
    private javax.swing.JTextField login;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
    
    public void connection(){
    
        String login=this.login.getText();
        String password=this.password.getText();
        if(login.length()==0||password.length()==0){
                JOptionPane.showMessageDialog(null, "veuillez remplir tout les champs");
        }
        else{
                Acteur acteur=new Acteur();
                 user=acteur.connection(login, password);
                   if(user!=null){
                    try {
                        this.dispose();
                        page_acceuil1 fe=new page_acceuil1();
                        
                        
                      //si on est en presence du vendeur
                        if(user.getType().equals("vendeur1")||user.getType().equals("vendeur2")){
                            page_acceuil1.cl.show(page_acceuil1.jPanel3, "journal_vente");
//                            fe.getClient1().setEnabled(false);
//                            fe.getUtilisateur().setEnabled(false);
//                            fe.getEntree().setEnabled(false);
//                            fe.getProduit().setEnabled(false);
//                            fe.getDepense().setEnabled(false);
//                            fe.getFournisseur().setEnabled(false);
                                barre_outil.tool_produit.setVisible(false);
                                barre_outil.tool_client.setVisible(false);
                                barre_outil.tool_entree.setVisible(false);
                                barre_outil.tool_four.setVisible(false);
                                barre_outil.tool_produit.setVisible(false);
                               barre_outil.tool_user.setVisible(false);
                               barre_outil.acceuil.setVisible(false);
                            
                        }
                        //en presence du magasinier
                        else {
                             barre_outil.tool_depense.setVisible(false);
                            //on desactive les menus
                            
                        }
                        //sinon en presence du gerant il dispose tout les droits
                        
                        //affecttatio du nom utilisateur a la page acceuil
                        fe.setname_user(user.getNom());
                        fe.setStatut(user.getType());
                        fe.setVisible(true);
                        //jconnection.dispose();
                    } catch (Exception ex) {
                        Logger.getLogger(vue_connection.class.getName()).log(Level.SEVERE, null, ex);
                    }
                  }
                   else{
                       new errorClasse(null, true, "PAS UTILISATEUR TROUVER", "null.png");
                   }
        }
    
    }
      
}
