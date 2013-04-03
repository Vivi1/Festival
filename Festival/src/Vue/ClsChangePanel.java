/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vue;

/**
 *
 * @author etudSIO
 */
public class ClsChangePanel {

    protected String ModePanel ; 

    public ClsChangePanel(String panel) {
        this.ModePanel = panel;
    }

    public String getPanel() {
        return ModePanel;
    }

    public void setPanel(String panel) {
        this.ModePanel = panel;
    }
    
}
