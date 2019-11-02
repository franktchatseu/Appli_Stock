/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vue.view;

import com.classes.pack.Commande_cli;
import com.vue.pack.*;
import com.classes.pack.Produit;
import com.classes.pack.SingletonConnecction;
import com.implementation.pack.Role;
import com.modele_table.pack.BeauteTableau.BeauteQteProduit;
import com.modele_table.pack.BeauteTableau.TableHeader;
import com.modele_table.pack.ModelTable;
import com.modele_table.pack.ModelTable_cli;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import jfree.piechart;

/**
 *
 * @author tchatseu
 */
public class vue_etat_stock1 extends javax.swing.JPanel {

    /**
     * Creates new form vue_produit
     */
     CardLayout cl=new CardLayout();
	piechart graph_stat=new piechart("Etat des Stocks A partir Du Graph Circuclaire");
	//ma liste
	List<Produit> l_p=new ArrayList<Produit>();
	Role r=new Role();
	//mon panel courant
	JPanel processus=new JPanel();
	//mon model de table
	ModelTable model=new ModelTable();
        ButtonGroup bg=new ButtonGroup();
    public vue_etat_stock1() {
        initComponents();
        panel_stat.setLayout(cl);
        panel_stat.setPreferredSize(new Dimension(400,450));
        panel_stat.add(graph_stat,"graph");
        cl.show(panel_stat, "graph");
        processus=this;
        //mise de tout les bouttons radio dans un group
        bg.add(stock_bas);
        bg.add(stock_eleve);
        bg.add(stock_null);
        
        table_com.getTableHeader().setDefaultRenderer(new TableHeader());
        //initialisation du tableau
        model.l_e=r.affiche_stock("tous");
        table_com.setModel(model);
        actualise_table();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        stock_eleve = new javax.swing.JRadioButton();
        stock_bas = new javax.swing.JRadioButton();
        stock_null = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_com = new javax.swing.JTable();
        panel_stat = new javax.swing.JPanel();
        vider1 = new javax.swing.JButton();
        imprimer1 = new javax.swing.JButton();

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(97, 117, 158));
        label1.setText("ETATS DES STOCKS DES PRODUITS");

        stock_eleve.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stock_eleve.setForeground(new java.awt.Color(0, 156, 52));
        stock_eleve.setText("STOCK NORMAL");
        stock_eleve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_eleveActionPerformed(evt);
            }
        });

        stock_bas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stock_bas.setForeground(new java.awt.Color(0, 102, 255));
        stock_bas.setText("ALERT APPROVISIONNEMENT");
        stock_bas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_basActionPerformed(evt);
            }
        });

        stock_null.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stock_null.setForeground(java.awt.Color.red);
        stock_null.setText("RUPTURE DE STOCK");
        stock_null.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_nullActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stock_eleve, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stock_bas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stock_null, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stock_eleve, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock_bas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stock_null, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jScrollPane1.setBackground(new java.awt.Color(191, 194, 204));
        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        table_com.setAutoCreateRowSorter(true);
        table_com.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        table_com.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        table_com.setModel(new javax.swing.table.DefaultTableModel(
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
        table_com.setAutoscrolls(true);
        table_com.setPreferredSize(new java.awt.Dimension(2000,2000));
        jScrollPane1.setViewportView(table_com);

        panel_stat.setBackground(new java.awt.Color(202, 204, 216));

        javax.swing.GroupLayout panel_statLayout = new javax.swing.GroupLayout(panel_stat);
        panel_stat.setLayout(panel_statLayout);
        panel_statLayout.setHorizontalGroup(
            panel_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );
        panel_statLayout.setVerticalGroup(
            panel_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        vider1.setBackground(new java.awt.Color(245, 240, 253));
        vider1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/nettoyer.png"))); // NOI18N
        vider1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vider1ActionPerformed(evt);
            }
        });

        imprimer1.setBackground(new java.awt.Color(245, 240, 253));
        imprimer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/vue/view/image_app/modifier2.png"))); // NOI18N
        imprimer1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        imprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimer1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(319, 319, 319))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(345, 345, 345)
                        .addComponent(imprimer1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(vider1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 239, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_stat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vider1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imprimer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(240, 240, 240))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void stock_eleveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_eleveActionPerformed
        // TODO add your handling code here:
        model.l_e=r.affiche_stock("eleve");
        table_com.setModel(model);
        actualise_table();
    }//GEN-LAST:event_stock_eleveActionPerformed

    private void stock_basActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_basActionPerformed
        // TODO add your handling code here:

        model.l_e=r.affiche_stock("bas");
        table_com.setModel(model);
        actualise_table();
    }//GEN-LAST:event_stock_basActionPerformed

    private void stock_nullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_nullActionPerformed
        // TODO add your handling code here:
        model.l_e=r.affiche_stock("null");
        table_com.setModel(model);
        actualise_table();
    }//GEN-LAST:event_stock_nullActionPerformed

    private void vider1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vider1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vider1ActionPerformed

    private void imprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimer1ActionPerformed

     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imprimer1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JPanel panel_stat;
    private javax.swing.JRadioButton stock_bas;
    private javax.swing.JRadioButton stock_eleve;
    private javax.swing.JRadioButton stock_null;
    private javax.swing.JTable table_com;
    private javax.swing.JButton vider1;
    // End of variables declaration//GEN-END:variables
   
     //on actualise la table
     public void actualise_table(){
    	 processus.repaint();
    	 processus.validate();
    	 
     }
}
