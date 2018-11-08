/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;
import model.AnnualReport;
import model.Game;

/**
 *
 * @author arthu
 */
public class GameControl {
    
    public static AnnualReport liveTheYear(
        Game game, int tithesPercent, int bushelsForFood, int acresToPlant){
        
        if (game == null || tithesPercent < 0 || tithesPercent > 100 || bushelsForFood < 0 || acresToPlant < 0)
        {
            return null;
        }
        AnnualReport report = new AnnualReport();
        report.setLandPrice(LandControl.getCurrentLandPrice());

        int totalWheat = game.getWheatInStorage();
        
        int harvested = CalculateHarvest.calculateHarvest(tithesPercent, acresToPlant);
        int tithingAmount = (int)(double)((tithesPercent/100.0) * harvested);
        int lostToRats  = WheatControl.calculateLossToRats(tithesPercent, totalWheat);
        
        int peopleStarved = PopulationControl.calculateMortality(bushelsForFood, game.getCurrentPopulation());
        int peopleMovedIn = PopulationControl.calculateNewMoveIns(game.getCurrentPopulation());

        totalWheat = totalWheat + harvested - tithingAmount - lostToRats;
        game.setWheatInStorage(totalWheat);
        game.setCurrentPopulation(game.getCurrentPopulation() - peopleStarved + peopleMovedIn);

        report.setBushelsHarvested(harvested);
        report.setTithingAmount(tithingAmount);
        report.setLostToRats(lostToRats);
        report.setPeopleStarved(peopleStarved);
        report.setPeopleMovedIn(peopleMovedIn);
        
        report.setEndingWheatInStorage(game.getWheatInStorage());
        report.setEndingPopulation(game.getCurrentPopulation());
        report.setEndingAcresOwned(game.getAcresOwned());

        return report;

    }
    
    
    
    public static int getRandomNumber(int lowVal, int highVal){
        
        if (lowVal < 0) {
            return -1;
        }
        if (highVal < 1) {
            return -1;
        }
        if (lowVal == highVal) {
            return -1;
        }
        if (highVal < lowVal) {
            return -1;
        }
        return (new Random().nextInt(highVal + 1 - lowVal) + lowVal );
    }

    public static void liveTheYear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

    


