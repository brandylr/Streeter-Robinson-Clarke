/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.InventoryItem;
import model.Condition;
import model.Storehouse;
import model.Provision;
import model.Animal;
import model.ItemType;


/**
 *
 * @author brobinson
 */
public class StorehouseControl {
    
    public StorehouseControl() {
        
    }
   
    public static InventoryItem[] createTools(){
        // Create InventoryItem object and assign values to it.
        InventoryItem[] tool = new InventoryItem[5];
        
        tool[0] = new InventoryItem("Shovel ", ItemType.Tools, 10, Condition.GOOD);
        tool[1] = new InventoryItem("Rake ", ItemType.Tools, 6, Condition.GOOD);
        tool[2] = new InventoryItem("Lumber ", ItemType.Tools, 30, Condition.GOOD);
        tool[3] = new InventoryItem("Scythe ", ItemType.Tools, 3, Condition.FAIR);
        tool[4] = new InventoryItem("Hammer ", ItemType.Tools, 4, Condition.FAIR);
        
        
        return tool;
        
    } 
}
