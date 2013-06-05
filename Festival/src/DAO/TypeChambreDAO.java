/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Vue.Accueil;
import org.hibernate.Query;

/**
 *
 * @author etudSIO
 */
public class TypeChambreDAO {

    public static Query listeTypechambre() {
            String sReq0= "from Typechambre";
       Accueil.getSession().beginTransaction();
       Query q0 = Accueil.getSession().createQuery(sReq0);
        return q0 ;
    }
    
}
