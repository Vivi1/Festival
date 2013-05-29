/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Hibernate.Etablissement;
import Vue.Accueil;
import org.hibernate.Query;

/**
 *
 * @author etudSIO
 */
public class EtablissementDAO {

    //recupére un objet établissement avec son nom.
    public static Etablissement getEtabliByNom(String sNomEtab) {
        
        String sReq= "from Etablissement where NOM = '"+sNomEtab+"'";
        Accueil.getSession().beginTransaction();
        Query q = Accueil.getSession().createQuery(sReq);
        // Ajouter le code qui enleve les cottes 
        Etablissement unetablissement = (Etablissement)q.uniqueResult();
        return unetablissement;
        
    }
// Donne la liste de tous les établissements.
    public static Query listeEtab() {
        String sReq = "from Etablissement";
        Accueil.getSession().beginTransaction();
        Query q = Accueil.getSession().createQuery(sReq);
        return q;
    }
    
    
}
