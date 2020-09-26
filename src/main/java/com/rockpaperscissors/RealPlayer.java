package com.imc;

import java.util.Scanner;

public class RealPlayer {

    private String name;
    Scanner sc = new Scanner(System.in);

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public void requestPlayerName() {
        System.out.println("Please enter your username");
        name = sc.next();
    }

    //Get the player input
    public int getInput() {
        // Select among ROCK PAPER SCISSORS and returns the selected value
        System.out.println("Select \t r ---> ROCK \n\t\t p ---> PAPER \n\t\t s ---> SCISSOR");

        String input = sc.next();
        char c = input.toUpperCase().charAt(0);
        // checking the 1st character in the input
        if (c == 'R')
            return CompareSelections.ROCK;
        else if (c == 'P')
            return CompareSelections.PAPER;
        else if (c == 'S')
            return CompareSelections.SCISSORS;
        else {
            System.out.println("Please Select the correct Input");
            getInput();
            return 0;
        }
    }

    public boolean playAgain() {
        // This function will ask if the user wants to play again and return true or false accordingly.
        sc = new Scanner(System.in);
        System.out.println("Do you want to play again? \n\t enter (y) if yes  \n\t or any other character to exit");
        String userInput = sc.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }
}
