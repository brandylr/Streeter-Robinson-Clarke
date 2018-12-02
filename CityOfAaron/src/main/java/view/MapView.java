/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.MapControl;
import exceptions.MapControlException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Location;
import model.Map;
import java.util.Arrays;


/**
 *
 * @author brobinson
 */
public class MapView extends ViewBase {
    
    /**
     * Constructor
     */
    public MapView(){
        super();    
    }
    
    @Override
    protected String getMessage() {
        
            return "Welcome to the map.\n"
                    + "On your map you'll be able to locate the village, the Temple,\n"
                    + "the wheat fields, any undeveloped land, the river, the storehouse,\n"
                    + "and the area where you hold court.\n"
                    + "\nMap Key: \n"
                    + "U = Undeveloped Land\n"
                    + "F = Fields\n"
                    + "V = Village\n"
                    + "R = River\n"
                    + "T = Temple\n"
                    + "C = Courthouse\n"
                    + "W = Watchtower\n"
                    + "S = Storehouse\n"
                    + "B = Borderline\n";
        
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // This view is not interactive. All it does is show the map. 
        
        return null;
    }
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        
        displayMap();
        pause (2000);
        
       return false; 
    }

    public void displayMap() {
        try {
            Map map = MapControl.createMap();
            Location[][] locations = map.getLocations();
            int i;
            
            for (i = 0; i < locations.length; i++) {
                int j;
                
                for (j = 0; j < locations[i].length; j++) {
                    System.out.println(map.getLocations()[i][j].getMapSymbol());
                }
                System.out.println();
            }
        } catch (MapControlException ex) {
            Logger.getLogger(MapView.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
