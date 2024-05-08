/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diedicegame;

/**
 *
 * @author EYC
 */

import java.util.Random;

public class DieDiceGame {
    private static final int NUM_DICE = 5; //number of dice in the game
    private static final int NUM_SIDES = 6; //number of sides on each die
    private int[] diceValues; //array to store the values of each die
    private Random random; //random number generator

    public DieDiceGame() {
        diceValues = new int[NUM_DICE]; // the array for storing dice values
        
        random = new Random(); //initialize the random number generator
    }

    //method to roll dice
    public void rollDice() {
        for (int i = 0; i < NUM_DICE; i++) {
            diceValues[i] = random.nextInt(NUM_SIDES) + 1; // Roll each die and store the result
        }
    }

    //method  to display the current values of the dice
    public void displayDice() {
        System.out.print("Dice Values: ");
        for (int value : diceValues) {
            System.out.print(value + " "); // Print each die's value
        }
        System.out.println();
    }

    //method  to calculate the total score
    public int calculateScore() {
        int score = 0;
        for (int value : diceValues) {
            score += value; // Sum up the values of all dice
        }
        return score; // Return the total score
    }

    public static void main(String[] args) {
        DieDiceGame game = new DieDiceGame(); // Create an instance of the DiceGame class
        game.rollDice(); // Roll the dice
        game.displayDice(); // Display the current values of the dice
        int score = game.calculateScore(); // Calculate the total score
        System.out.println("Total Score: " + score); // Print the total score
    }
}
    

