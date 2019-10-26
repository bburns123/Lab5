/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

/**
 *
 * @author Brendyn Burns
 * Chapter 7, question 11.
 */
public class ArrayOrganizer {
    int total;
    int average;
    int highest;
    int lowest;

    public int getTotal(int testArray[]) {
        for (int counter = 0; counter < testArray.length; counter++) {
            total += testArray[counter];
        }
        return total;
    }

    public int getAverage(int testArray[]) {
         for (int counter = 0; counter < testArray.length; counter++) {
            total += testArray[counter];
        }
         average = total / testArray.length;
        return average;
    }

    public int getHighest(int testArray[]) {
        highest = testArray[0];
         for (int counter = 0; counter < testArray.length; counter++) {
            if (testArray[counter] > highest) {
                highest = testArray[counter];
            }
        }
        return highest;
    }

    public int getLowest(int testArray[]) {
        lowest = testArray[0]; 
        for (int counter = 0; counter < testArray.length; counter++) {
            if (testArray[counter] < lowest) {
                lowest = testArray[counter];
            }
        }
        return lowest;
    }
    
    public static void main(String[] args) {
        int[] testArray = new int[]{ 4,12,16,2,6,19,8,22 };
        ArrayOrganizer array = new ArrayOrganizer();
        
        int total = array.getTotal(testArray);
        int average = array.getAverage(testArray);
        int highest = array.getHighest(testArray);
        int lowest = array.getLowest(testArray);
        
        System.out.println("The total of the array is: " + total);
        System.out.println("The average of the array is: " + average);
        System.out.println("The highest number of the array is: " + highest);
        System.out.println("The lowest number of the array is: " + lowest);
    }
}
