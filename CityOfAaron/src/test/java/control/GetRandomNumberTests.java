package control;


import org.junit.Test;
import static org.junit.Assert.*;

public class GetRandomNumberTests{
    

    @Test
    public void testCase1(){
        int rndNumber;
        int lowVal = 1;
        int highVal = 3; 
        
        rndNumber = GameControl.getRandomNumber(1, 3);
        if (rndNumber != -1) {
        System.out.printf("Test#1: %d <= %d <= %d \n", lowVal, rndNumber, highVal);
        }
        else {
            System.out.printf("Test#1: Error '-1' \n");
        }
        assertTrue(
        String.format("Test#1: %d should be between %d and %d \n", rndNumber, lowVal, highVal), rndNumber >= lowVal && rndNumber <= highVal);
        
    }
    
    @Test
    public void testCase2(){
        int rndNumber;
        int lowVal = 3;
        int highVal = 1; 
        
        rndNumber = GameControl.getRandomNumber(3, 1);
        if (rndNumber != -1) {
        System.out.printf("Test#2: %d <= %d <= %d \n", lowVal, rndNumber, highVal);
        }
        else {
            System.out.printf("Test#2: Error '-1' \n");
        }
        assertTrue(rndNumber == -1);
    }
    
    @Test
    public void testCase3(){
        int rndNumber;
        int lowVal = -3;
        int highVal = 5; 
        
        rndNumber = GameControl.getRandomNumber(-3, 5);
        if (rndNumber != -1) {
        System.out.printf("Test#3: %d <= %d <= %d \n", lowVal, rndNumber, highVal);
        }
        else {
            System.out.printf("Test#3: Error '-1' \n");
        }
        assertTrue(rndNumber == -1);
        
    }
    
    @Test
    public void testCase4(){
        int rndNumber;
        int lowVal = 4;
        int highVal = 4; 
        
        rndNumber = GameControl.getRandomNumber(4, 4);
        if (rndNumber != -1) {
        System.out.printf("Test#4: %d <= %d <= %d \n", lowVal, rndNumber, highVal);
        }
        else {
            System.out.printf("Test#4: Error '-1' \n");
        }
        assertTrue(rndNumber == -1);
        
    } 
    
    @Test
    public void testCase5(){
        int rndNumber;
        int lowVal = 0;
        int highVal = 1; 
        
        rndNumber = GameControl.getRandomNumber(0, 1);
        if (rndNumber != -1) {
        System.out.printf("Test#5: %d <= %d <= %d \n", lowVal, rndNumber, highVal);
        }
        else {
            System.out.printf("Test#5: Error '-1' \n");
        }
        assertTrue(
        String.format("Test#5: %d should be between %d and %d \n", rndNumber, lowVal, highVal), rndNumber >= lowVal && rndNumber <= highVal);
        
    }
        
    @Test
    public void testCase6(){
        int rndNumber;
        int lowVal = 1;
        int highVal = 100; 
        
        rndNumber = GameControl.getRandomNumber(1, 100);
        if (rndNumber != -1) {
        System.out.printf("Test#6: %d <= %d <= %d \n", lowVal, rndNumber, highVal);
        }
        else {
            System.out.printf("Test#6: Error '-1' \n");
        }
        assertTrue(
        String.format("Test#6: %d should be between %d and %d \n", rndNumber, lowVal, highVal), rndNumber >= lowVal && rndNumber <= highVal);
        
    }
    
    
}