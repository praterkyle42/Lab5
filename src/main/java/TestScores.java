/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep
 */
public class TestScores {
    private double[] testScoreArray = new double[6];
    private double testScoreTotal;
    public TestScores (double[] testScoreArray) throws InvalidTestScoreException {
           this.testScoreArray = testScoreArray; 
           for (int i = 0; i < testScoreArray.length; i++) {
               if (testScoreArray[i] < 0 || testScoreArray[i] > 100) {
                   throw new InvalidTestScoreException("You entered an invalid test score. Your test score cannot be less than 0 or greater than 100");
               } else {
                   this.testScoreArray[i] = testScoreArray[i]; 
               } 
            
            }
        }
    public double getAverage() {
        double arrayTotal = 0; 
        double arrayAverage;
        for (int i = 0; i < testScoreArray.length; i++) {
            arrayTotal += testScoreArray[i]; 
        }
        testScoreTotal = arrayTotal;
        arrayAverage = testScoreTotal / 5; 
        return arrayAverage; 
    }
}

 