/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

import Hibernate.Typechambre;
import java.util.Iterator;
import org.hibernate.Query;

/**
 *
 * @author etudSIO
 */
public class pTypeChambres extends javax.swing.JPanel {
    static boolean bCharge = false;
    Typechambre unechambre;
    /**
     * Creates new form pEtablissements
     */
    public pTypeChambres() {
        initComponents();
        chargerType();
     
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgir = new javax.swing.JButton();
        jCmbTypeChambres = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLblId = new javax.swing.JLabel();
        jLblTypeChambre = new javax.swing.JLabel();

        btnAgir.setText("Ajouter");

        jCmbTypeChambres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCmbTypeChambres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbTypeChambresActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Type de chambres");
        jLabel1.setToolTipText("");

        jLabel2.setText("Id :");

        jLabel3.setText("Type de chambre :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnAgir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jCmbTypeChambres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLblTypeChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCmbTypeChambres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLblId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLblTypeChambre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(btnAgir)
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents
     
    private void jCmbTypeChambresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbTypeChambresActionPerformed
        String sNom;
        String sQuery;
        
//        if(bCharge){
//            sNom = (String)jCmbTypeChambres.getSelectedItem();
//            sNom = sNom.replace("","");
//            sQuery = "From Typechambre where libelle = '"+ sNom +"'";
//            Accueil.getSession().beginTransaction();
//            Query q = Accueil.getSession().createQuery(sQuery);
//            unechambre = (Typechambre)q.uniqueResult();
//            jCmbTypeChambres.setEnabled(false);    
//        }
    }
        private void chargerType(){
        String sReq = "from Typechambre";
        Accueil.getSession().beginTransaction();
        Query q = Accueil.getSession().createQuery(sReq);
        jCmbTypeChambres.removeAllItems();
        Iterator Typechambre = q.iterate();
        System.out.println("zzzz");
        while(Typechambre.hasNext()){
            Typechambre unechambre = (Typechambre) Typechambre.next();
            jCmbTypeChambres.addItem(unechambre.getLibelle()); 
            System.out.println("zzaaaazz");
            
        }
          bCharge = true;          
    }//GEN-LAST:event_jCmbTypeChambresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgir;
    private javax.swing.JComboBox jCmbTypeChambres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblTypeChambre;
    // End of variables declaration//GEN-END:variables

    void setMode() {
        String sMode;
      sMode=ClsChangePanel.getModePanel();
    }
}
