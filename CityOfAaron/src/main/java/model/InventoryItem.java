/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author brobinson
 */
public class InventoryItem implements Serializable {
    private String name;
    private ItemType itemType;
    private int quantity;
    private Condition condition;

    public InventoryItem() {
        // Empty constructor
    }

    public InventoryItem(String name, ItemType itemType, int quantity, Condition condition) {
        setName(name);
        setItemType(itemType);
        setQuantity(quantity);
        setCondition(condition);
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "InventoryItem: "
                + name
                + "Item type= " + itemType
                + ", Quantity= " + quantity
                + ", Condition= " + condition
                + " ";
    }

    public Object createTools() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
