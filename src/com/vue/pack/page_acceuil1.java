/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vue.pack;

import com.vue.view.barre_outil;
import com.vue.view.journal_com_four1;
import com.vue.view.journal_facture;
import com.vue.view.journal_vente1;
import com.vue.view.journal_vente_stat1;
import com.vue.view.pannier_com_four;
import com.vue.view.vue_categorie;
import com.vue.view.vue_choisir_client;
import com.vue.view.vue_client1;
import com.vue.view.vue_depense1;
import com.vue.view.vue_etat_stock1;
import com.vue.view.vue_fournisseur2;
import com.vue.view.vue_utilisateur1;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 *
 * @author tchatseu
 */
public class page_acceuil1 extends javax.swing.JFrame  {

    /**
     * Creates new form page_acceuil
     */
    
    static public JPanel jPanel3=new JPanel();
   
     static public CardLayout cl=new CardLayout();
    //Etat_stock_g et=new Etat_stock_g();
     vue_etat_stock1 et=new vue_etat_stock1();
   // Produit_g jp=new Produit_g();
    vue_pro jp=new vue_pro(this);
    //Fournisseur_g four=new Fournisseur_g();
   vue_fournisseur2 four=new vue_fournisseur2();
    
    //Client_g cli=new Client_g();
    vue_client1 cli=new vue_client1();
    vue_utilisateur1 user=new vue_utilisateur1();
    
    //activation de la nouvelle version � la date du 04/03/2018;
   //public Commande_client_g cm_cli=new Commande_client_g();
    
    // vue avant pour les commmandes
    //public commande_client cm_cli=new commande_client();
    //vue apres
    journal_facture cm_cli=new journal_facture();
    //journal_vente1 cm_cli=new journal_vente1();
    journal_vente_stat1 journal_vente;
    //Commande_fournisseur cm_four=new Commande_fournisseur();
    
    journal_com_four1 cm_four=new journal_com_four1();
    //depense dp=new depense();
    vue_depense1 dp=new vue_depense1();
    //processus courant de la fenetre
    JFrame page_acc;
    JToolBar toolbar=new JToolBar();
    JPanel jpere=new JPanel();
    public static  JFrame container;
    public page_acceuil1() throws SQLException, ParseException, IOException {
        initComponents();
        container=this;
        
         journal_vente=new journal_vente_stat1();
        //propriete de la fenetre
        page_acc=this;
        this.setResizable(true);
       // this.setSize(1400, 833);
       //ici on fixe la taille de la fenetre en recuperant les dimmentiond de ecran de la machine considere
       default_dimention();
        
         
        //ajout de mes panneaux dans le cari layouts
        jpere.setLayout(new BoxLayout(jpere,BoxLayout.PAGE_AXIS));
        jpere.add(new barre_outil());
        jpere.add(jPanel3);
        //pan2.setLayout(car);
        
        jPanel3.setLayout(cl);
        //jPanel3.add(jPanel1,"prin");
        
        jPanel3.add(jp,"produit");
        jPanel3.add(et,"etat de stock");
        jPanel3.add(four,"fournisseur");
        jPanel3.add(cm_cli,"com_client");
        jPanel3.add(cm_four,"com_fournisseur");
        jPanel3.add(dp,"depense");
        jPanel3.add(cli,"client");
        jPanel3.add(user,"user");
         jPanel3.add(journal_vente,"journal_vente");
        //methode pour la gestion du boutton acceuil
        
        //autres proprietes de la fenetre
        this.setLocationRelativeTo(null);
       // jTextPane1.setText("EQUIPE TECHNIQUE: FRANK TCHATSEU LGNE" );
//       toolbar.add(produit);
//        toolbar.add(client1);
//        toolbar.setPreferredSize(new Dimension(40,40));
       //jpere.add(toolbar);
       
        jpere.add(jPanel3);
        this.setContentPane(jpere);
        //on met icone de notre fentre
        Image icone = Toolkit.getDefaultToolkit().getImage("AppliStock.jpg");
        this.setIconImage(icone);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        vente = new javax.swing.JButton();
        fournisseur = new javax.swing.JButton();
        etat = new javax.swing.JButton();
        client1 = new javax.swing.JButton();
        depense = new javax.swing.JButton();
        produit = new javax.swing.JButton();
        label_principal = new BlinkingLabel("fs",new java.awt.Color(97, 117, 158),new Color(85,170,255), new Color(186,61,70));
        utilisateur = new javax.swing.JButton();
        etat_vente = new javax.swing.JButton();
        entree = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        name_user = new javax.swing.JLabel();
        lab_image = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        statut = new javax.swing.JLabel();

        jMenu3.setText("jMenu3");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenuItem1.setText("jMenuItem1");

        jMenu8.setText("jMenu8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APPLICATION DE GESTION DE STOCK+FACTURATION(APPLI-STOCK)");

        vente.setBackground(new java.awt.Color(245, 240, 253));
        vente.setFont(new java.awt.Font("Waree", 3, 16)); // NOI18N
        vente.setForeground(new java.awt.Color(97, 117, 158));
        vente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/pack/vente.png"))); // NOI18N
        vente.setText("VENTE");
        vente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venteActionPerformed(evt);
            }
        });

        fournisseur.setBackground(new java.awt.Color(245, 240, 253));
        fournisseur.setFont(new java.awt.Font("Waree", 3, 15)); // NOI18N
        fournisseur.setForeground(new java.awt.Color(97, 117, 158));
        fournisseur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/FOURN.png"))); // NOI18N
        fournisseur.setText("FOURNISSEUR");
        fournisseur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fournisseurActionPerformed(evt);
            }
        });

        etat.setBackground(new java.awt.Color(245, 240, 253));
        etat.setFont(new java.awt.Font("Waree", 3, 16)); // NOI18N
        etat.setForeground(new java.awt.Color(97, 117, 158));
        etat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/ET3.png"))); // NOI18N
        etat.setText("ETAT STOCK");
        etat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etatActionPerformed(evt);
            }
        });

        client1.setBackground(new java.awt.Color(245, 240, 253));
        client1.setFont(new java.awt.Font("Waree", 3, 16)); // NOI18N
        client1.setForeground(new java.awt.Color(97, 117, 158));
        client1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/CLI.png"))); // NOI18N
        client1.setText("CLIENT");
        client1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client1ActionPerformed(evt);
            }
        });

        depense.setBackground(new java.awt.Color(245, 240, 253));
        depense.setFont(new java.awt.Font("Waree", 3, 16)); // NOI18N
        depense.setForeground(new java.awt.Color(97, 117, 158));
        depense.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/DEPEN.png"))); // NOI18N
        depense.setText("DEPENSE");
        depense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depenseActionPerformed(evt);
            }
        });

        produit.setBackground(new java.awt.Color(245, 240, 253));
        produit.setFont(new java.awt.Font("Waree", 3, 16)); // NOI18N
        produit.setForeground(new java.awt.Color(97, 117, 158));
        produit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/ACC_pro.png"))); // NOI18N
        produit.setText("PRODUIT");
        produit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produitActionPerformed(evt);
            }
        });

        label_principal.setFont(new java.awt.Font("Noto Sans CJK SC Black", 3, 36)); // NOI18N
        label_principal.setForeground(new java.awt.Color(97, 117, 158));
        label_principal.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        label_principal.setText("APPLICATION DE GESTION DE STOCK  COMMERCIALE");

        utilisateur.setBackground(new java.awt.Color(245, 240, 253));
        utilisateur.setFont(new java.awt.Font("Waree", 3, 16)); // NOI18N
        utilisateur.setForeground(new java.awt.Color(97, 117, 158));
        utilisateur.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/CLI.png"))); // NOI18N
        utilisateur.setText("Utilisateur");
        utilisateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilisateurActionPerformed(evt);
            }
        });

        etat_vente.setBackground(new java.awt.Color(245, 240, 253));
        etat_vente.setFont(new java.awt.Font("Waree", 3, 16)); // NOI18N
        etat_vente.setForeground(new java.awt.Color(97, 117, 158));
        etat_vente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/DEPENSE.png"))); // NOI18N
        etat_vente.setText("ETAT VENTE");
        etat_vente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etat_venteActionPerformed(evt);
            }
        });

        entree.setBackground(new java.awt.Color(245, 240, 253));
        entree.setFont(new java.awt.Font("Waree", 3, 16)); // NOI18N
        entree.setForeground(new java.awt.Color(97, 117, 158));
        entree.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/email_send.png"))); // NOI18N
        entree.setText("ENTREE");
        entree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entreeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(81, 86, 113));
        jLabel1.setText("Utilisateur connecté: ");

        name_user.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        lab_image.setBackground(new java.awt.Color(102, 102, 102));
        lab_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/image_acceuil.jpg"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/logo_vente.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(81, 86, 113));
        jLabel4.setText("Statut:");

        statut.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        statut.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(entree, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(etat)
                                    .addGap(70, 70, 70))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(client1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(71, 71, 71)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(produit, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etat_vente)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2))))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_user, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(statut, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(443, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vente, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(depense, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lab_image, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(label_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(443, 443, 443))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(name_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(client1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produit, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fournisseur, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(etat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(etat_vente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(utilisateur, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(entree, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(depense, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lab_image, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public  class acceul implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
          //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           page_acc.setResizable(false);
           // page_acc.setSize(2522,605);
           default_dimention();
          page_acc.setLocationRelativeTo(null);  
          cl.show(jPanel3, "prin");
            
           
            
        }
    }
    
  
    
    private void entreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entreeActionPerformed
        // TODO add your handling code here:
        default_dimention();
        cl.show(jPanel3, "com_fournisseur");
        this.setContentPane(jpere);
        
    }//GEN-LAST:event_entreeActionPerformed

    private void etat_venteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etat_venteActionPerformed
        // TODO add your handling code here:
        default_dimention();
        cl.show(jPanel3, "journal_vente");
        this.setContentPane(jpere);
    }//GEN-LAST:event_etat_venteActionPerformed

    private void utilisateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilisateurActionPerformed
        // TODO add your handling code here:
        default_dimention();
        cl.show(jPanel3, "user");
        this.setContentPane(jpere);
    }//GEN-LAST:event_utilisateurActionPerformed

    private void produitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produitActionPerformed
        // TODO add your handling code here:
        default_dimention();
        cl.show(jPanel3, "produit");
        this.setContentPane(jpere);
        //on actualise aussi l'espace produit via ce boutton
        jp.actualise_table();
        jp.actualise_panel();
    }//GEN-LAST:event_produitActionPerformed

    private void depenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depenseActionPerformed
        // TODO add your handling code here:
        default_dimention();
        cl.show(jPanel3, "depense");
        this.setContentPane(jpere);
    }//GEN-LAST:event_depenseActionPerformed

    private void client1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client1ActionPerformed
        // TODO add your handling code here:
        this.setContentPane(jpere);
        
        cl.show(jPanel3, "client");
        default_dimention();
        
    }//GEN-LAST:event_client1ActionPerformed

    private void etatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etatActionPerformed
        // TODO add your handling code here:
        default_dimention();
        cl.show(jPanel3, "etat de stock");
        this.setContentPane(jpere);
    }//GEN-LAST:event_etatActionPerformed

    private void fournisseurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fournisseurActionPerformed
        // TODO add your handling code here:
        default_dimention();
        cl.show(jPanel3, "fournisseur");
        this.setContentPane(jpere);
    }//GEN-LAST:event_fournisseurActionPerformed

    private void venteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venteActionPerformed
        // TODO add your handling code here:
        default_dimention();
        cl.show(jPanel3, "com_client");
        this.setContentPane(jpere);
    }//GEN-LAST:event_venteActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton client1;
    private javax.swing.JButton depense;
    private javax.swing.JButton entree;
    private javax.swing.JButton etat;
    private javax.swing.JButton etat_vente;
    private javax.swing.JButton fournisseur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lab_image;
    private javax.swing.JLabel label_principal;
    private javax.swing.JLabel name_user;
    private javax.swing.JButton produit;
    private javax.swing.JLabel statut;
    private javax.swing.JButton utilisateur;
    private javax.swing.JButton vente;
    // End of variables declaration//GEN-END:variables
//fonction pour les diments=ion ^par defaut de la fenetre
    public void default_dimention(){
        
        //recuperation de la taille de ecran
        Toolkit toolkit = Toolkit.getDefaultToolkit();

// On récupère la taille de l'écran par défaut : 
        Dimension dim = toolkit.getScreenSize();
        System.out.println(dim);

// On récupère la configuration par défaut de l'écran par défaut : 
        GraphicsConfiguration gconf = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getDefaultScreenDevice().getDefaultConfiguration();

// On récupère les 'marges' de l'écran : 
        Insets insets = toolkit.getScreenInsets(gconf);
        System.out.println(insets);
        //this.setResizable(false);
        this.setSize(dim.width-insets.right, dim.height - insets.bottom);
        //this.setSize(1400, 870);
        this.setLocationRelativeTo(null);


    }
    //insertion du nom utilisateur
    public void setname_user(String name){
            name_user.setText(name);
    }
    //mes getteurs pour mes bouttons

    

    public JButton getClient1() {
        return client1;
    }

    public JButton getEntree() {
        return entree;
    }

    public JButton getEtat() {
        return etat;
    }

    public JButton getUtilisateur() {
        return utilisateur;
    }

    public JButton getVente() {
        return vente;
    }

    public JButton getProduit() {
        return produit;
    }

    public JButton getDepense() {
        return depense;
    }

    public JButton getFournisseur() {
        return fournisseur;
    }

   
   
    public void setStatut(String statut) {
        this.statut.setText(statut);
    }

    public static JPanel getjPanel1() {
        return jPanel1;
    }

    public static void setjPanel1(JPanel jPanel1) {
        page_acceuil1.jPanel1 = jPanel1;
    }
    
}
