
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
public class Array_Problem_1 {
    public static void main(String[] args) {
        int[] integerArray = new int[10];
        Scanner keyboard = new Scanner(System.in); 
        for (int i = 0; i < integerArray.length; i++ ) {
            System.out.println("Enter a whole number: ");
            integerArray[i] = keyboard.nextInt(); 
        }
        System.out.println("Enter a number to see the numbers in the array that are higher than that number: ");
        printArray(integerArray, keyboard.nextInt()); 
       
    }
    public static void printArray (int[] integerArray, int n) {
        System.out.println("The numbers in the array that are above this number are:");
        for (int i = 0; i < integerArray.length; i++) {
           if (integerArray[i] > n) {
               System.out.println(integerArray[i]);
           }
        }
    }
}