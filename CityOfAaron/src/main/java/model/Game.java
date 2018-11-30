/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import control.PopulationControl;
import exceptions.GameControlException;
import java.io.Serializable;

/**
 *
 * @author arthu
 */
public class Game implements Serializable {




    
    private Player thePlayer;
    private Map theMap;
    private Storehouse theStorehouse;
    private int currentPopulation;
    private int acresOwned;
    private int wheatInStorage;

    public Game() {
    }
    
    /* testing a builder class here */
    public static class builder {
        
        private int acresOwned;
        private int currentPopulation;
        private int wheatInStorage;
        
        public builder acresOwned(int acresOwned){
            this.acresOwned = acresOwned;            
            return this;
        }
        
        public builder currentPopulation(int currentPopulation){
            this.currentPopulation = currentPopulation;
            return this;
        }
        
        public builder wheatInStorage(int wheatInStorage){
            this.wheatInStorage = wheatInStorage;
            return this;
        }
        
        public Game build(){
            Game game = new Game();
            game.acresOwned = this.acresOwned;
            game.currentPopulation = this.currentPopulation;
            game.wheatInStorage = this.wheatInStorage;
            
            return game;
        }
        
        
    }
        /* testing a builder class above */
    
    

    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

    public Map getTheMap() {
        return theMap;
    }

    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }

    public Storehouse getTheStorehouse() {
        return theStorehouse;
    }

    public void setTheStorehouse(Storehouse theStorehouse) {
        this.theStorehouse = theStorehouse;
    }

    public int getCurrentPopulation() {
        return currentPopulation;
    }
    public int peopleMovedIn()
            throws GameControlException {
        return PopulationControl.calculateNewMoveIns(currentPopulation);
    }
    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopulation = currentPopulation;
    }

    public int getAcresOwned() {
        return acresOwned;
    }

    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }

    public int getWheatInStorage() {
        return wheatInStorage;
    }

    public void setWheatInStorage(int wheatInStorage) {
        this.wheatInStorage = wheatInStorage;
    }

    @Override
    public String toString() {
        return "Game {" 
                + "thePlayer=" + thePlayer 
                + ", theMap=" + theMap 
                + ", theStorehouse=" + theStorehouse 
                + ", currentPopulation=" + currentPopulation 
                + ", acresOwned=" + acresOwned 
                + ", wheatInStorage=" + wheatInStorage 
                + " }";
    }
    
    
    
}
