/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;
import java.util.ArrayList;

/**
 *
 * @author Brendyn Burns
 * Chapter 11, question 11.
 */
public class TestScores {
    double average;
    double total;
    
    public TestScores(ArrayList<Double> testScoresArray) {
        
    }
    
    public static double getAverage(ArrayList<Double> testScoresMethod) throws Exception{
        double total = 0;
        double average;
        
        for (double counter: testScoresMethod){
            if (counter < 0 || counter > 100){
                throw new InvalidTestScore("Please enter a test score between 0 and 100!");
            }   
            total += counter;
        }
        
        average = total / testScoresMethod.size();
        return average;
    }
        
}
    
