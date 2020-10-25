
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdpra
 */
public class Array_Problem_2 {
    public static void main(String[] args) {
        int n;  
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How long do you want the array to be?"); 
        n = keyboard.nextInt(); 
        double[] doubleArray = new double[n];
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println("Enter a number: ");
            doubleArray[i] = keyboard.nextInt(); 
        }
        System.out.println("The total of the numbers in the array are " + getTotal(doubleArray)); 
        System.out.println("The average of the numbers in the array are " + getAverage(doubleArray));
        System.out.println("The highest value in the array is: " + getHighest(doubleArray));
        System.out.println("The lowest value in the array is: " + getLowest(doubleArray)); 
    }
    public static double getTotal(double[] doubleArray) {
        double arrayTotal = 0;  
        for (int i = 0; i < doubleArray.length; i++) {
            arrayTotal += doubleArray[i]; 
        }
       return arrayTotal; 
    }
    public static double getAverage(double[] doubleArray) {
        double total = getTotal(doubleArray); 
        double arrayAverage = total/doubleArray.length; 
        return arrayAverage;
    }
    public static double getHighest(double[] doubleArray) { 
        double highestValue = 0; 
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] > highestValue) {
                highestValue = doubleArray[i]; 
            }   
        }    
        return highestValue; 
    }
    public static double getLowest(double[] doubleArray) {
        double lowestValue = doubleArray[0]; 
        for (int i = 0; i < doubleArray.length; i++) {
            if (doubleArray[i] < lowestValue) {
                lowestValue = doubleArray[i]; 
            }
        }
       return lowestValue;
    }
}
