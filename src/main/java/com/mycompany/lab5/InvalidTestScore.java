/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab5;

/**
 *
 * @author Brendyn Burns
 */
public class InvalidTestScore extends Exception {
    public InvalidTestScore(String errorMessage) {
        super(errorMessage);
    }
}
