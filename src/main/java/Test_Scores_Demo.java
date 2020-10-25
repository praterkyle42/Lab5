
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep
 */
public class Test_Scores_Demo {
    public static void main(String[] args) {
        double[] testScoresArray = new double[6]; 
        Scanner keyboard = new Scanner(System.in); 
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter the score for test " + i + ":");
            testScoresArray[i] = keyboard.nextDouble(); 
        }
       
        try {
           TestScores myTestScores = new TestScores(testScoresArray); 
           System.out.println("The average of your test scores was " + myTestScores.getAverage()); 
        } catch (InvalidTestScoreException ex) {
            System.out.println(ex.getMessage());
        }
        
       
    }
}
