/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vue.view;

import com.classes.pack.Client;
import com.classes.pack.Controle;
import com.vue.pack.*;
import com.classes.pack.SingletonConnecction;
import com.implementation.pack.Role;
import com.modele_table.pack.BeauteTableau.BeauteQteProduit;
import com.modele_table.pack.BeauteTableau.TableHeader;
import com.modele_table.pack.ModelTable;
import com.modele_table.pack.ModelTable_client;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author tchatseu
 */
public class vue_client1 extends javax.swing.JPanel {

    /**
     * Creates new form vue_produit
     */
    Role r = new Role();
    JOptionPane jop = new JOptionPane();
    List<Client> lp = new ArrayList<Client>();
    ModelTable_client model = new ModelTable_client();
    JPanel processus = new JPanel();
    public vue_client1()  {
        initComponents();
        processus=this;
        actualise_table();
        table_client.addMouseListener(new remplissage());
        selection_recher.setAutoscrolls(true);
        
        table_client.getTableHeader().setDefaultRenderer(new TableHeader());
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
        imprimer = new javax.swing.JButton();
        l_recherpar = new javax.swing.JLabel();
        selection_recher = new javax.swing.JComboBox<>();
        valeur_recher = new javax.swing.JTextField();
        rechercher = new javax.swing.JButton();
        supprimer = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_client = new javax.swing.JTable();
        label2 = new java.awt.Label();
        jPanel2 = new javax.swing.JPanel();
        nom_client = new javax.swing.JTextField();
        l_nom = new javax.swing.JLabel();
        l_add = new javax.swing.JLabel();
        l_ville = new javax.swing.JLabel();
        l_tel = new javax.swing.JLabel();
        actualiser = new javax.swing.JButton();
        tel_cli = new javax.swing.JFormattedTextField();
        ajouter = new javax.swing.JButton();
        ville = new javax.swing.JTextField();
        add_cli = new javax.swing.JTextField();
        modifier = new javax.swing.JButton();

        imprimer.setBackground(new java.awt.Color(245, 240, 253));
        imprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/modifier2.png"))); // NOI18N
        imprimer.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        imprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimerActionPerformed(evt);
            }
        });

        l_recherpar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        l_recherpar.setForeground(java.awt.Color.red);
        l_recherpar.setText("RECHERCHER PAR");

        selection_recher.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        selection_recher.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "code client", "nom client", "ville" }));
        selection_recher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selection_recherActionPerformed(evt);
            }
        });

        valeur_recher.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        valeur_recher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valeur_recherActionPerformed(evt);
            }
        });

        rechercher.setBackground(new java.awt.Color(245, 240, 253));
        rechercher.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        rechercher.setForeground(new java.awt.Color(255, 0, 0));
        rechercher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/search.png"))); // NOI18N
        rechercher.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercherActionPerformed(evt);
            }
        });

        supprimer.setBackground(new java.awt.Color(245, 240, 253));
        supprimer.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        supprimer.setForeground(new java.awt.Color(255, 0, 0));
        supprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/sup.png"))); // NOI18N
        supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supprimerActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(245, 240, 253));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/nettoyer.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(l_recherpar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(selection_recher, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(valeur_recher, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(rechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(imprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(imprimer)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(rechercher, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l_recherpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selection_recher)
                    .addComponent(valeur_recher, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        jScrollPane1.setBackground(new java.awt.Color(191, 194, 204));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        table_client.setAutoCreateRowSorter(true);
        table_client.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        table_client.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        table_client.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CODE PRODUIT", "NOM PRODUIT", "N° CATEGORIE", "N° RAYON", "PRIX UNITAIRE", "QUANTITE", "STOCK ALERT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_client.setAutoscrolls(true);
        table_client.setPreferredSize(new java.awt.Dimension(2000,2000));
        jScrollPane1.setViewportView(table_client);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(97, 117, 158));
        label2.setText("Formulaire Ajout ");

        nom_client.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        l_nom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l_nom.setText("Nom Client");

        l_add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l_add.setText("Addresse");

        l_ville.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l_ville.setText("Ville");

        l_tel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        l_tel.setText("phone");

        actualiser.setBackground(new java.awt.Color(245, 240, 253));
        actualiser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        actualiser.setForeground(new java.awt.Color(255, 0, 0));
        actualiser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/refresh5.png"))); // NOI18N
        actualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualiserActionPerformed(evt);
            }
        });

        tel_cli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("6#"))));
        tel_cli.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tel_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel_cliActionPerformed(evt);
            }
        });

        ajouter.setBackground(new java.awt.Color(245, 240, 253));
        ajouter.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ajouter.setForeground(new java.awt.Color(255, 0, 0));
        ajouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/add.png"))); // NOI18N
        ajouter.setBorder(null);
        ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterActionPerformed(evt);
            }
        });

        ville.setFont(new java.awt.Font("Tibetan Machine Uni", 0, 18)); // NOI18N

        add_cli.setFont(new java.awt.Font("Tibetan Machine Uni", 0, 18)); // NOI18N

        modifier.setBackground(new java.awt.Color(245, 240, 253));
        modifier.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        modifier.setForeground(new java.awt.Color(255, 0, 0));
        modifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/modifier.png"))); // NOI18N
        modifier.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifierActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_ville, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_tel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(actualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ville, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(add_cli)
                                    .addComponent(tel_cli)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(l_nom)
                        .addGap(56, 56, 56)
                        .addComponent(nom_client, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_client, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_ville, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ville, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l_tel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tel_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actualiser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ajouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(modifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(341, 341, 341))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimerActionPerformed

    private void actualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualiserActionPerformed
        // TODO add your handling code here:
        //ici on met tous les formulaire � vide

       
        actualise_table();
        actualise_panel();
    }//GEN-LAST:event_actualiserActionPerformed

    private void tel_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tel_cliActionPerformed

    private void ajouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterActionPerformed
        // TODO add your handling code here:
        Client c=new Client();
       
        try{
            //recuperation des valeures dans les champs de saisie4
            JTextField[] tj={nom_client,add_cli,ville};
            JFormattedTextField[] jf={tel_cli};
            if(Controle.verification_textfield(tj)&& Controle.verification_formatedfields(jf)){
            c.setNom_client(nom_client.getText());
            c.setAddresse(add_cli.getText());
            c.setTelephone(tel_cli.getText());
            c.setVille(ville.getText());

            //operation ajout dans la bd et dans les tables
            if(r.ajouter_client(c)){
                lp.add(c);
                model.l_e=lp;
                table_client.setModel(model);
                jop.showMessageDialog(null, "ajout reussi","good",JOptionPane.INFORMATION_MESSAGE);
                actualise_panel();
                actualise_table();
            }

            else{
                jop.showMessageDialog(null, "code du client deja existant","erreur d'ajout",JOptionPane.ERROR_MESSAGE);
            }
            }
            else{
                 jop.showMessageDialog(null, "remplir tout vos champs","erreur de remplissage",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException p){
            p.getMessage();
        }
        
      

    }//GEN-LAST:event_ajouterActionPerformed

    private void supprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supprimerActionPerformed
        // TODO add your handling code here:
        //int selection=table.getSelectedRow();
        try{
            int selection=table_client.getSelectedRow();
            Client c=new Client();
            c=model.l_e.get(selection);
            int confirmation=jop.showConfirmDialog(null, "voulez vous vraiment supprimer le client: " +c.getNom_client(),"confirmation de suppression",JOptionPane.YES_NO_CANCEL_OPTION);
            if(confirmation==0){
                if(r.supprimer_client(c)){

                    model.l_e.remove(c);
                    jop.showMessageDialog(null,"suppression reussie","suppression",JOptionPane.INFORMATION_MESSAGE);
                    actualise_panel();
                    actualise_table();
                }
                else{
                    jop.showMessageDialog(null,"erreur de suppression","error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        catch(IndexOutOfBoundsException i){
            jop.showMessageDialog(null, "aucune selection de client","selection requise",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_supprimerActionPerformed

    private void modifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifierActionPerformed
        // TODO add your handling code here:

        try{
            Client c=new Client();
            int selection=table_client.getSelectedRow();
            c=model.l_e.get(selection);
            //recuperation des valeures dans les champs de saisie

            c.setNom_client(nom_client.getText());
            c.setAddresse(add_cli.getText());
            c.setTelephone(tel_cli.getText());
            c.setVille(ville.getText());
            //operation ajout dans la bd et dans les tables
            int confirmation=jop.showConfirmDialog(null, "voulez vous vraiment modifier le client de code: " +c.getId_client(),"confirmation de modification",JOptionPane.YES_NO_CANCEL_OPTION);
            if(confirmation==0)
            if(r.modifier_client(c)){
                actualise_table();
                jop.showMessageDialog(null, "modification reussie","good",JOptionPane.INFORMATION_MESSAGE);
                actualise_panel();
                actualise_table();
            }
            else{
                jop.showMessageDialog(null, "erreur! verifier que le clientt existe!:","erreur de modification",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException n){
            jop.showMessageDialog(null, "veuillez remplir tout vos chamos","warming",JOptionPane.WARNING_MESSAGE);
        }
        catch(IndexOutOfBoundsException i){
            jop.showMessageDialog(null, "aucune selection de client","selection requise",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_modifierActionPerformed

    private void selection_recherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selection_recherActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_selection_recherActionPerformed

    private void valeur_recherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valeur_recherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valeur_recherActionPerformed

    private void rechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercherActionPerformed
        // TODO add your handling code here:
        //la recherche peut renvoyer un RuntimeException ie pas de produit trouver
        try{
            //on recupere la valeur issue de la categorie � rechercher
            String valeur=valeur_recher.getText();

            //on recherche en fonction de sa categorie selectionn�e dans la liste
            if(selection_recher.getSelectedItem()=="ville"){
                model.l_e=r.rechercher_liste_client(valeur,"ville");
            }
            else if(selection_recher.getSelectedItem()=="nom client"){
                model.l_e=r.rechercher_liste_client(valeur,"nom");
            }
            else if(selection_recher.getSelectedItem()=="code client"){
                int code=Integer.parseInt(valeur_recher.getText());
                model.l_e.clear();
                model.l_e.add(r.rechercher_client(code));
            }

            table_client.setModel(model);
            actualise_panel();
            actualise_panel();
        }
        catch(RuntimeException r){
            jop.showMessageDialog(null,"pas de produit correspondant � cette recherche","pas de produit trouver",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_rechercherActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
//la classe interne remplissage
    public class remplissage implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			int selection=table_client.getSelectedRow();
			Client c=model.l_e.get(selection);
			nom_client.setText(c.getNom_client());
			tel_cli.setText(c.getTelephone());
			ville.setText(c.getVille());
                        add_cli.setText(c.getAddresse());
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton actualiser;
    private javax.swing.JTextField add_cli;
    private javax.swing.JButton ajouter;
    private javax.swing.JButton imprimer;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l_add;
    private javax.swing.JLabel l_nom;
    private javax.swing.JLabel l_recherpar;
    private javax.swing.JLabel l_tel;
    private javax.swing.JLabel l_ville;
    private java.awt.Label label2;
    private javax.swing.JButton modifier;
    private javax.swing.JTextField nom_client;
    private javax.swing.JButton rechercher;
    private javax.swing.JComboBox<String> selection_recher;
    private javax.swing.JButton supprimer;
    private javax.swing.JTable table_client;
    private javax.swing.JFormattedTextField tel_cli;
    private javax.swing.JTextField valeur_recher;
    private javax.swing.JTextField ville;
    // End of variables declaration//GEN-END:variables

   
    //methode pour actualiser le panel
    public void actualise_panel(){
         tel_cli.setText("");
        nom_client.setText("");
        add_cli.setText("");
        ville.setText("");
    	processus.repaint();
        processus.validate();
    }
    //on actualise le tableau en affichant tous les produits
    public void actualise_table(){
    	model.l_e=r.rechercher_liste_client("tout","tous");
		table_client.setModel(model);
                //il sagit d'une methode pour selectionner une seule ligne a la fois
                table_client.setSelectionMode(0);
    }
     
}
