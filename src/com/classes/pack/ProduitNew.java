package com.classes.pack;


import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ProduitNew {
		
	//les differents attributs
		private int id_produit;
		private String nom_produit;
		private float prix_unitaire;
		private String num_rayon;
		private String id_categorie;
		private int quantite;
		private int alert;
		public ProduitNew(){}
		
		public ProduitNew(String nom_produit, float prix_unitaire,
				String num_rayon, String id_categorie, int quantite,int alert) {
			super();
			
			this.nom_produit = nom_produit;
			this.prix_unitaire = prix_unitaire;
			this.num_rayon = num_rayon;
			this.id_categorie = id_categorie;
			this.quantite = quantite;
                        this.alert=alert;
		}
		
		public String getNom_produit() {
			return nom_produit;
		}
		public void setNom_produit(String nom_produit) {
			this.nom_produit = nom_produit;
		}
		public float getPrix_unitaire() {
			return prix_unitaire;
		}
		public void setPrix_unitaire(float prix_unitaire) {
			this.prix_unitaire = prix_unitaire;
		}
		public String getNum_rayon() {
			return num_rayon;
		}
		public void setNum_rayon(String num_rayon) {
			this.num_rayon = num_rayon;
		}
		public String getId_categorie() {
			return id_categorie;
		}
		public void setId_categorie(String id_categorie) {
			this.id_categorie = id_categorie;
		}
		public int getQuantite() {
			return quantite;
		}
		public void setQuantite(int quantite) {
			this.quantite = quantite;
		}
                public int getAlert() {
			return alert;
		}
		public void setAlert(int alert) {
			this.alert = alert;
                        
		}
                //ajout de produit
                public boolean ajouter_produit(ProduitNew p) {
		// TODO Auto-generated method stub
		try {
                    Connection co=SingletonConnecction.getConnexion();
                            
			PreparedStatement ps=co.prepareStatement("insert into PRODUIT(NOM_CATEGORIE,NOM_RAYON,NOM_PRO,PRI_UNI,QUANTITE,stock_alert) value(?,?,?,?,?,?)");
			
			ps.setString(1, p.getId_categorie());
			ps.setString(2, p.getNum_rayon());
			ps.setString(3, p.getNom_produit());
			ps.setInt(5, p.getQuantite());
			ps.setFloat(4, p.getPrix_unitaire());
                        ps.setInt(6, p.getAlert());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
                        return false;
			
		}
                        return true;
	}

		
		public static String[] recherche(String val) {
		// TODO Auto-generated method stub
		//List<Produit> lp=new ArrayList<>();
		String[] tab = new String[10];
		SingletonConnecction sg=new SingletonConnecction();
		Connection co=sg.getConnexion();
		int i=0;
		try {
			PreparedStatement ps;
			
				 ps=co.prepareStatement("select nom_pro from PRODUIT where nom_pro like ?");
				 ps.setString(1, val+"%");
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
				
				tab[i]=rs.getString("nom_pro");
				i++;
				
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			if(tab.length==0)throw new RuntimeException("pas de produit trouver");
		return tab;
	}
		
                //on surcharve la methose rechercher pour une implementation avec autocompletion
                public static ArrayList<String> recherche() {
		// TODO Auto-generated method stub
		//List<Produit> lp=new ArrayList<>();
		ArrayList<String> ls=new ArrayList<String>();
		SingletonConnecction sg=new SingletonConnecction();
		Connection co=sg.getConnexion();
		try {
			PreparedStatement ps;
			
				 ps=co.prepareStatement("select nom_pro from PRODUIT");
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
				
				ls.add(rs.getString("nom_pro"));
				
				
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return ls;
	}
                
                 //exportation de la liste des produits
                public static void export_excel(){
                    
                    
                    Workbook workbook = null;
                    List<ProduitNew> lp=new ArrayList<ProduitNew>();
                    ProduitNew p = null;
                    int nombre_exportaion=0;
                    int i=1;
		try {
			/* Récupération du classeur Excel (en lecture) */
			workbook = Workbook.getWorkbook(new File("G:\\exemple.xls"));
			
			/* Un fichier excel est composé de plusieurs feuilles, on y accède de la manière suivante*/
			Sheet sheet = workbook.getSheet(0);
		
                        for( i=1;i<sheet.getRows();i++){
                            p=new ProduitNew();
                            for(int j=0;j<sheet.getColumns();j++){
                                
                                switch(j){
                                    
                                    case 0:
                                    break;
                                    case 1: p.setNom_produit(sheet.getCell(j, i).getContents());
                                    break;
                                    case 2: p.setId_categorie(sheet.getCell(j, i).getContents());
                                    break;
                                    case 3: p.setNum_rayon(sheet.getCell(j, i).getContents());
                                    break;
                                    case 4:p.setPrix_unitaire(Float.parseFloat(sheet.getCell(j, i).getContents()));
                                    break;
                                    case 5:p.setQuantite(Integer.parseInt(sheet.getCell(j, i).getContents()));
                                    break;
                                    case 6:p.setAlert(Integer.parseInt(sheet.getCell(j, i).getContents()));
                                    break;
                                    default:System.out.println("rien"+ j);
                                }
                                
                            }
                                if(p.ajouter_produit(p)){
                                    nombre_exportaion++;
                                }
                                
                            
                        } 
		} 
		catch (BiffException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		finally {
			if(workbook!=null){
				/* On ferme le worbook pour libérer la mémoire */
				workbook.close(); 
                                 
			}
		}
                   
                    JOptionPane.showMessageDialog(null, "vous avez pu exporter en terme de produit: "+nombre_exportaion+"/"+(i-1));
                
                }
}
