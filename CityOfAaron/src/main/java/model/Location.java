
package model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Location implements Serializable {
    
    private static String name;
    private static String description;
    private String mapSymbol;
    private String[] gameTips;
    

    public Location() {
    }

    public Location(String mapSymbol, String name, String description, String[] tips){
        setMapSymbol(mapSymbol);
        setName(name);
        setDescription(description);
        setGameTips(tips);
    }
    
    
    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMapSymbol() {
        return mapSymbol;
    }

    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }

    public String[] getGameTips() {
        return gameTips;
    }

    public void setGameTips(String[] gameTips) {
        this.gameTips = gameTips;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.name);
        hash = 13 * hash + Objects.hashCode(this.description);
        hash = 13 * hash + Objects.hashCode(this.mapSymbol);
        hash = 13 * hash + Arrays.deepHashCode(this.gameTips);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" 
                + "name=" + name 
                + ", description=" + description 
                + ", mapSymbol=" + mapSymbol 
                + ", gameTips=" + Arrays.toString(gameTips) 
                + '}';
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
        final Location other = (Location) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.mapSymbol, other.mapSymbol)) {
            return false;
        }
        if (!Arrays.deepEquals(this.gameTips, other.gameTips)) {
            return false;
        }
        return true;
    }
    
    
    
}
