/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import app.CityOfAaron;
import exceptions.CalculateHarvestException;
import exceptions.GameControlException;
import exceptions.LandControlException;
import exceptions.MapControlException;
import exceptions.PopulationControlException;
import exceptions.WheatControlException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Random;
import model.AnnualReport;
import model.Author;
import model.Game;
import model.Map;
import model.Player;
import model.Provision;
import model.Storehouse;
import view.ErrorView;
import static view.ViewBase.pause;

/**
 *
 * @author arthu
 */
public class GameControl {

    public static AnnualReport liveTheYear(
            Game game, int tithesPercent, int bushelsForFood, int acresToPlant)
            throws CalculateHarvestException, LandControlException, GameControlException, PopulationControlException, WheatControlException {

        if (game == null) {
            throw new GameControlException("The game cannot be null.");
        }
        if (acresToPlant < 0) {
            throw new CalculateHarvestException("The acresToPlant value cannot be negative.");
        }
        if (bushelsForFood < 0) {
            throw new PopulationControlException("The bushelsForFood value cannot be negative.");
        }
        if (tithesPercent < 0 || tithesPercent > 100) {
            //throw new WheatControlException("The tithesPercent value cannot be negative or greater than 100.");
        }
        AnnualReport report = new AnnualReport();
        report.setLandPrice(LandControl.getCurrentLandPrice());

        int totalWheat = game.getWheatInStorage();

        int harvested = CalculateHarvest.calculateHarvest(tithesPercent, acresToPlant);
        int tithingAmount = (int) (double) ((tithesPercent / 100.0) * harvested);
        int lostToRats = WheatControl.calculateLossToRats(tithesPercent, totalWheat);

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

    public static int getRandomNumber(int lowVal, int highVal)
            throws GameControlException {

        if (lowVal < 0 || highVal < 0) {
            throw new GameControlException("The lowVal and highVal values cannot be negative.");
        }
        if (lowVal == highVal || highVal < lowVal) {
            throw new GameControlException("The lowVal cannot be equal to highVal or the highVal cannot be less than the lowVal.");
        }
        return (new Random().nextInt(highVal + 1 - lowVal) + lowVal);
    }

    public static Game createNewGame(String playerName)
            throws GameControlException, MapControlException {

        Player player = new Player();
        player.setName(playerName);

        Game game = new Game();
        game.setThePlayer(player);

        game.setCurrentPopulation(100);
        game.setAcresOwned(1000);
        game.setWheatInStorage(3000);

        Map theMap = MapControl.createMap();
        game.setTheMap(theMap);

        /**
         * Set the Storehouse here & list of Authors
         */
        Storehouse storehouse = new Storehouse();
        Author[] author = {
            new Author("Arthur", "Programmer"),
            new Author("Brandy", "Programmer"),
            new Author("Jon", "Programmer")
        };
       
        storehouse.setAuthors(author);
        storehouse.setAnimals(control.StorehouseControl.createAnimals());
        storehouse.setTools(control.StorehouseControl.createTools());
        storehouse.setProvisions(control.StorehouseControl.createProvisions());

        game.setTheStorehouse(storehouse);

        return game;

    }

    public static void saveGame(String saveGameName, Game game) throws GameControlException {
        if (game == null || saveGameName == null || saveGameName.length() < 1) {
            throw new GameControlException("Game is invalid or the File Path is invalid.");
        }
        try (ObjectOutputStream out
                = new ObjectOutputStream(new FileOutputStream(saveGameName))) {
            out.writeObject(game);
        } catch (IOException ex) {
            System.out.println("File Not Found." + ex.getMessage());
        }

        System.out.println("Saving game as: " + saveGameName);
        pause(1000);
        System.out.println("Game has been saved!");

    }

    public static Game getGame(String filePath) throws GameControlException, IOException, ClassNotFoundException {
        if (filePath == null || filePath.length() < 1) {
            throw new GameControlException("The Filepath entered doesn't exist.");
        }
        try (ObjectInputStream fis
                = new ObjectInputStream(new FileInputStream(filePath))) {
            Game game = (Game) fis.readObject();
            CityOfAaron.setCurrentGame(game);
            CityOfAaron.getCurrentGame().setThePlayer(game.getThePlayer());
        } catch (IOException ex) {
            System.out.println("File Not Found." + ex.getMessage());
        }
        return null;
    }
}
