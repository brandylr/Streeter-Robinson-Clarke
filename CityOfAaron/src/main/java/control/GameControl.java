/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Random;

/**
 *
 * @author arthu
 */
public class GameControl {
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
}

