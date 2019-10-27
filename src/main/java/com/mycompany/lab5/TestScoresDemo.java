/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Brendyn Burns
 */
public class TestScoresDemo {
        public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> testScoresArray = new ArrayList<>();
        
        for (int counter = 0; counter < 5; counter ++) {
            double doubleHolder = scanner.nextDouble();
            testScoresArray.add(doubleHolder);
        }

        try{
            TestScores array = new TestScores(testScoresArray);
            double average = array.getAverage(testScoresArray);
            
            System.out.println("Average test score: " + average);
        }
        catch (InvalidTestScore ex) {
            System.out.println("Invalid test score, please enter scores between 0 and 100!");
        }
}}
