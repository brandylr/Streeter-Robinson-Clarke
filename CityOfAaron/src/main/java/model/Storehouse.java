/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author arthu
 */
public class Storehouse implements Serializable {
    
    public ArrayList<Author> authors = new ArrayList<Author>();
    public Animal[] animals;
    public InventoryItem[] tools;
    public Provision[] provisions;

    public Storehouse() {
    }

    
    
    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public InventoryItem[] getTools() {
        return tools;
    }

    public void setTools(InventoryItem[] tools) {
        this.tools = tools;
    }

    public Provision[] getProvisions() {
        return provisions;
    }

    public void setProvisions(Provision[] provisions) {
        this.provisions = provisions;
    }

    @Override
    public String toString() {
        return "Storehouse{" 
                + "authors=" + authors 
                + ", animals=" + animals 
                + ", tools=" + tools 
                + ", provisions=" + provisions 
                + " }";
    }

    
}
