/*
 * AbstractViewPanel.java
 *
 * Created on January 22, 2007, 9:06 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package Vista2;

import java.beans.PropertyChangeEvent;
import javax.swing.JPanel;

/**
 * This class provides the base level abstraction for views in this example. All
 * views that extend this class also extend JPanel (which is useful for performing
 * GUI manipulations on the view in NetBeans Matisse), as well as providing the 
 * modelPropertyChange() method that controllers can use to propogate model 
 * property changes.
 *
 * @author Robert Eckstein
 */

public abstract class AbstractViewPanel extends JPanel {
    
    /**
     * Called by the controller when it needs to pass along a property change 
     * from a model.
     *
     * @param evt The property change event from the model
     */
    
    public abstract void modelPropertyChange(PropertyChangeEvent evt);
    
    
}
