/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.streeterrobinsonclarkes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

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
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.authors);
        hash = 67 * hash + Arrays.deepHashCode(this.animals);
        hash = 67 * hash + Arrays.deepHashCode(this.tools);
        hash = 67 * hash + Arrays.deepHashCode(this.provisions);
        return hash;
    }

    @Override
    public String toString() {
        return "Storehouse{" + "authors=" + authors + ", animals=" + animals + ", tools=" + tools + ", provisions=" + provisions + '}';
    }

    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Storehouse other = (Storehouse) obj;
        if (!Objects.equals(this.authors, other.authors)) {
            return false;
        }
        if (!Arrays.deepEquals(this.animals, other.animals)) {
            return false;
        }
        if (!Arrays.deepEquals(this.tools, other.tools)) {
            return false;
        }
        if (!Arrays.deepEquals(this.provisions, other.provisions)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
