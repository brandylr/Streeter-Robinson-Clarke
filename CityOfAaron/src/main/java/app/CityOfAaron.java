/*
 * Main class. This is the first code that will be executed when 
 * the program starts.
 */
package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import model.Game;
import view.ErrorView;
import view.StartProgramView;

public class CityOfAaron {

    // Keep a copy of the current Game object in the main class.
    public static Game currentGame = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CityOfAaron.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CityOfAaron.logFile = logFile;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game game) {
        currentGame = game;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            CityOfAaron.inFile = new BufferedReader(new InputStreamReader(System.in));
            CityOfAaron.outFile = new PrintWriter(System.out, true);
            CityOfAaron.logFile = new PrintWriter("logFile.txt");

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.displayView();
            
            
        } catch (Throwable te) {
            ErrorView.display(CityOfAaron.class.getName(), "Exception caught from the main method");
            ErrorView.display(CityOfAaron.class.getName(), te.getMessage());
            te.printStackTrace();
        } finally {
            try {
                CityOfAaron.inFile.close();
                CityOfAaron.outFile.close();
                if (logFile != null){
                    logFile.close();
                }
            } catch (IOException ex) {
                ErrorView.display(CityOfAaron.class.getName(), "Error closing files.");
                return;
            }

        }
    }

}
