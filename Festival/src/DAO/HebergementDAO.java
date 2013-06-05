/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Hibernate.Offre;
import Vue.Accueil;
import org.hibernate.Query;
import org.hibernate.Transaction;

/**
 *
 * @author etudSIO
 */
public class HebergementDAO {

    //Permet l'ajout d'une offre.
    public static void ajouter(Offre uneOffreAdd) {
        try{
            Transaction tx1= Accueil.getSession().beginTransaction();
        Accueil.getSession().save(uneOffreAdd);
            tx1.commit(); 
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout.");
        }
       
    }
//Permet la modification du nombre de chambre.
    public static void Modifier(Offre uneOffreUp) {
        try{
        Transaction tx = Accueil.getSession().beginTransaction();
            Accueil.getSession().update(uneOffreUp);
            tx.commit();    
        }
        catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null, "Erreur lors de la modification.");
        }
        
    }
//Trouver une offre à partir de l'id type et de l'idEtablissement.
    public static Offre trouverOffre(String idType, String IdEtab) {
       String hql ="from Offre where IDTYPECHAMBRE='"+idType+"' and IDETAB = '"+IdEtab+"'";
        Accueil.getSession().beginTransaction();
        Query exhql = Accueil.getSession().createQuery(hql);
        Offre uneOffreUp = (Offre)exhql.uniqueResult();
        return uneOffreUp;
    }
    

    
}
