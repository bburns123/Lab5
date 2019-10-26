/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

/**
 *
 * @author Brendyn Burns
 * Chapter 7, question 5.
 */
public class GreaterThanN {
    public static void arrayMethod(int array[], int n) {
        
        for (int counter = 0; counter < array.length; counter++) {
            if (array[counter] > n) {
                System.out.println(array[counter] + " is greater than " + n);
            }
        }
    }
}
