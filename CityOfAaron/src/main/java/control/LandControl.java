/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import app.CityOfAaron;
import exceptions.GameControlException;
import exceptions.LandControlException;

/**
 *
 * @author arthu
 */
public class LandControl {

    public static int getCurrentLandPrice()
            throws LandControlException, GameControlException {

        int priceOfLand = GameControl.getRandomNumber(17, 27);

        return priceOfLand;
    }

    public static void buyLand(int amountDesired, int priceOfLand)
            throws LandControlException {
        if (amountDesired < 0) {
            throw new LandControlException("Please enter a positive number");
        }
        int totalPrice = amountDesired * priceOfLand;
        if (totalPrice > CityOfAaron.getCurrentGame().getWheatInStorage()) {
            System.out.println("You do not have enough wheat to make this purchase.\n");
        }
        if (totalPrice <= CityOfAaron.getCurrentGame().getWheatInStorage()) {
            CityOfAaron.getCurrentGame().setAcresOwned(CityOfAaron.getCurrentGame().getAcresOwned() + amountDesired);
            CityOfAaron.getCurrentGame().setWheatInStorage(CityOfAaron.getCurrentGame().getWheatInStorage() - totalPrice);
            System.out.println("You now own " + CityOfAaron.getCurrentGame().getAcresOwned() + " acres of land.\n");
        }
    }

}
