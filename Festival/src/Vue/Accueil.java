/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;
import Hibernate.HibernateUtil;
import java.awt.Container;
import org.hibernate.Session;
/**
 *
 * @author etudSIO
 */
public class Accueil extends javax.swing.JFrame {
        //protected pEtablissements pnlEtabli = new pEtablissements();
//        protected pEtablissements pnlEtab = new pEtablissements();
//        protected pAttribution pnlAttri = new pAttribution();
//        protected pEtablissements pnlPart = new pEtablissements();
        //protected ptest paneltest = new ptest();
    protected pEtablissements pnlEtab = new pEtablissements();
    protected pHebergement pnlHeb = new pHebergement();
    protected pAttribution pnlAtt = new pAttribution();
    protected pTypeChambres pnlTC = new pTypeChambres();
    private Container pnlPrinc = null; 
    private static Session session = HibernateUtil.getSessionFactory().openSession();
        
    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mAccueil = new javax.swing.JMenu();
        mEtablissements = new javax.swing.JMenu();
        mConsutEtab = new javax.swing.JMenuItem();
        mAjEtab = new javax.swing.JMenuItem();
        mModifEtab = new javax.swing.JMenuItem();
        mSupprEtab = new javax.swing.JMenuItem();
        mTypChambres = new javax.swing.JMenu();
        mConsultTC = new javax.swing.JMenuItem();
        mAjTC = new javax.swing.JMenuItem();
        mModifTC = new javax.swing.JMenuItem();
        mOffreHebergement = new javax.swing.JMenu();
        mConsultOH = new javax.swing.JMenuItem();
        mModifOH = new javax.swing.JMenuItem();
        mAttribution = new javax.swing.JMenu();
        mConsultAC = new javax.swing.JMenuItem();
        mAjAC = new javax.swing.JMenuItem();
        mModifAC = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTitre.setText("Bienvenue sur l'application de gestion d'hébergement du festival Folklores du monde");

        jLabel2.setText("Accédez aux différentes parties de l'application via le menu du haut");

        jLabel1.setText("");

        mAccueil.setText("Accueil");
        jMenuBar1.add(mAccueil);

        mEtablissements.setText("Etablissements");

        mConsutEtab.setText("Consulter");
        mConsutEtab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsutEtabActionPerformed(evt);
            }
        });
        mEtablissements.add(mConsutEtab);

        mAjEtab.setText("Ajouter");
        mAjEtab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAjEtabActionPerformed(evt);
            }
        });
        mEtablissements.add(mAjEtab);

        mModifEtab.setText("Modifier");
        mModifEtab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModifEtabActionPerformed(evt);
            }
        });
        mEtablissements.add(mModifEtab);

        mSupprEtab.setText("Supprimer");
        mSupprEtab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSupprEtabActionPerformed(evt);
            }
        });
        mEtablissements.add(mSupprEtab);

        jMenuBar1.add(mEtablissements);

        mTypChambres.setText("Type chambres");

        mConsultTC.setText("Consulter");
        mConsultTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsultTCActionPerformed(evt);
            }
        });
        mTypChambres.add(mConsultTC);

        mAjTC.setText("Ajouter");
        mAjTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAjTCActionPerformed(evt);
            }
        });
        mTypChambres.add(mAjTC);

        mModifTC.setText("Modifier");
        mModifTC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModifTCActionPerformed(evt);
            }
        });
        mTypChambres.add(mModifTC);

        jMenuBar1.add(mTypChambres);

        mOffreHebergement.setText("Offre hébergements");

        mConsultOH.setText("Consulter");
        mConsultOH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsultOHActionPerformed(evt);
            }
        });
        mOffreHebergement.add(mConsultOH);

        mModifOH.setText("Modifier");
        mModifOH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModifOHActionPerformed(evt);
            }
        });
        mOffreHebergement.add(mModifOH);

        jMenuBar1.add(mOffreHebergement);

        mAttribution.setText("Attribution chambres");

        mConsultAC.setText("Consulter");
        mConsultAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mConsultACActionPerformed(evt);
            }
        });
        mAttribution.add(mConsultAC);

        mAjAC.setText("Ajouter");
        mAjAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAjACActionPerformed(evt);
            }
        });
        mAttribution.add(mAjAC);

        mModifAC.setText("Modifier");
        mModifAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mModifACActionPerformed(evt);
            }
        });
        mAttribution.add(mModifAC);

        jMenuBar1.add(mAttribution);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(lblTitre, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .add(19, 19, 19))
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(68, 68, 68)
                        .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 360, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(231, 231, 231)
                        .add(jLabel1)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(33, 33, 33)
                .add(jLabel1)
                .add(56, 56, 56)
                .add(lblTitre, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(70, 70, 70)
                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static Session getSession(){
   return session;
    }

    public static void setSession(Session session) {
        Accueil.session = session;
    }
    private void mConsutEtabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsutEtabActionPerformed
      //  this.setContentPane(pnlEtabli); 
        this.setContentPane(pnlEtab);
        pack();
        ClsChangePanel.setModePanel("Consulter");
        pnlEtab.setMode();
    }//GEN-LAST:event_mConsutEtabActionPerformed

    private void mAjEtabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAjEtabActionPerformed
       // this.setContentPane(pnlEtab);
        this.setContentPane(pnlEtab);
         pack();
         ClsChangePanel.setModePanel("Ajouter");
         pnlEtab.setMode();
         
    }//GEN-LAST:event_mAjEtabActionPerformed

    private void mModifEtabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModifEtabActionPerformed
       // this.setContentPane(pnlEtab);
        this.setContentPane(pnlEtab);
         pack();
         ClsChangePanel.setModePanel("Modifier");
         pnlEtab.setMode();
         
    }//GEN-LAST:event_mModifEtabActionPerformed

    private void mSupprEtabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSupprEtabActionPerformed
       // this.setContentPane(pnlEtab);
        this.setContentPane(pnlEtab);
         pack();
         ClsChangePanel.setModePanel("Supprimer");
         pnlEtab.setMode();
    }//GEN-LAST:event_mSupprEtabActionPerformed

    private void mAjTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAjTCActionPerformed
        this.setContentPane(pnlTC);
        pack();
        ClsChangePanel.setModePanel("Ajouter");
        pnlTC.setMode();
    }//GEN-LAST:event_mAjTCActionPerformed

    private void mConsultACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsultACActionPerformed
         //this.setContentPane(pnlAttri);
        this.setContentPane(pnlAtt);
        pack();
        ClsChangePanel.setModePanel("Consulter");
        pnlAtt.setMode();
    }//GEN-LAST:event_mConsultACActionPerformed

    private void mConsultTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsultTCActionPerformed
       //this.setContentPane(pnlPart);
        this.setContentPane(pnlTC);
        pack();
        ClsChangePanel.setModePanel("Consulter");
        pnlTC.setMode();
    }//GEN-LAST:event_mConsultTCActionPerformed

    private void mConsultOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mConsultOHActionPerformed
        this.setContentPane(pnlHeb);
        pack();
        ClsChangePanel.setModePanel("Consulter");
        pnlHeb.setMode();
    }//GEN-LAST:event_mConsultOHActionPerformed

    private void mModifTCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModifTCActionPerformed
        this.setContentPane(pnlTC);
        pack();
        ClsChangePanel.setModePanel("Modifier");
        pnlTC.setMode();
    }//GEN-LAST:event_mModifTCActionPerformed

    private void mAjACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAjACActionPerformed
         this.setContentPane(pnlAtt);
        pack();
        ClsChangePanel.setModePanel("Ajouter");
        pnlAtt.setMode();
    }//GEN-LAST:event_mAjACActionPerformed

    private void mModifACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModifACActionPerformed
        this.setContentPane(pnlAtt);
        pack();
        ClsChangePanel.setModePanel("Modifier");
        pnlAtt.setMode();
    }//GEN-LAST:event_mModifACActionPerformed

    private void mModifOHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mModifOHActionPerformed
        this.setContentPane(pnlHeb);
        pack();
        ClsChangePanel.setModePanel("Modifier");
        pnlHeb.setMode();
    }//GEN-LAST:event_mModifOHActionPerformed

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
             
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblTitre;
    private javax.swing.JMenu mAccueil;
    private javax.swing.JMenuItem mAjAC;
    private javax.swing.JMenuItem mAjEtab;
    private javax.swing.JMenuItem mAjTC;
    private javax.swing.JMenu mAttribution;
    private javax.swing.JMenuItem mConsultAC;
    private javax.swing.JMenuItem mConsultOH;
    private javax.swing.JMenuItem mConsultTC;
    private javax.swing.JMenuItem mConsutEtab;
    private javax.swing.JMenu mEtablissements;
    private javax.swing.JMenuItem mModifAC;
    private javax.swing.JMenuItem mModifEtab;
    private javax.swing.JMenuItem mModifOH;
    private javax.swing.JMenuItem mModifTC;
    private javax.swing.JMenu mOffreHebergement;
    private javax.swing.JMenuItem mSupprEtab;
    private javax.swing.JMenu mTypChambres;
    // End of variables declaration//GEN-END:variables
    
}
