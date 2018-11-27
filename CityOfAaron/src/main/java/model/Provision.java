/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author brobinson
 */
public class Provision extends InventoryItem implements Serializable {
    
    private boolean perishable;
    
    public Provision(){
        
    }
    
    public boolean isPerishable(){
        return perishable;
    }
    
    public void setIsPerishable(boolean perishable){
        this.perishable = perishable;
    }

    @Override
    public String toString() {
        return "Provision{" 
                + "perishable=" + perishable 
                + " }";
    }
    
    
    
}
