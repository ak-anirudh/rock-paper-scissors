package com.imc;

public class CompareSelections {

    //These instance variables will act as constants through out the project
    public static final int ROCK = 1;
    public static final int PAPER = 2;
    public static final int SCISSORS = 3;

    // to display the selection of computer and the player
    public static void displaySelected(String who, int s) {
        switch (s) {
            case ROCK:
                System.out.println(who + " selected ---> ROCK ");
                break;
            case PAPER:
                System.out.println(who + " selected ---> PAPER ");
                break;
            case SCISSORS:
                System.out.println(who + " selected ---> SCISSORS ");
                break;
            default:
                break;
        }
    }

    //to help decide who wins a particular round
    public static int compareTheSelections(int userSelection, int computerSelection) {
        if(userSelection == computerSelection) return 0;
        switch (userSelection) {
            case ROCK:
                return (computerSelection == SCISSORS ? 1 : -1);
            case PAPER:
                return (computerSelection == ROCK ? 1 : -1);
            case SCISSORS:
                return (computerSelection == PAPER ? 1 : -1);
        }
        return 0;
    }
}
