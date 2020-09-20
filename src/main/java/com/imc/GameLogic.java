package com.imc;

public class GameLogic {

    private RealPlayer realPlayer;
    private Computer computer;

    // score of the player
    private int playerScore;

    // score of the computer
    private int computerScore;

    // total number of games played
    private int totalGamesPlayed;

    //number of games tie
    private int tieGame;

    public GameLogic(){
        realPlayer = new RealPlayer();
        computer = new Computer();
        playerScore = 0;
        computerScore = 0;
        totalGamesPlayed = 0;
        tieGame = 0;
    }

    //Start and play the game
    public void startGame() {
        int playerInput = realPlayer.getInput();
        CompareSelections.displaySelected(realPlayer.getName(), playerInput);
        int computerInput = computer.getInput();
        CompareSelections.displaySelected("Computer", computerInput);
        // Compare moves to determine the winner of a round
        int compareResult= CompareSelections.compareTheSelections(playerInput, computerInput);
        switch (compareResult) {
            case 0:
                System.out.println("This round is a TIE!");
                tieGame++;
                break;
            case 1:
                System.out.println(realPlayer.getName()+ " Beats Computer \n You WON this round ! ");
                playerScore++;
                break;
            case -1:
                System.out.println("Computer Beats "+ realPlayer.getName()+" \n Computer WON this round ! ");
                computerScore++;
                break;
        }

        totalGamesPlayed++;

        if (realPlayer.playAgain()) {
            startGame();
        }
         else {
            System.out.println(" EXITING THE GAME \n");
            showResults();
        }
    }

    // get the users name
    public void getPlayerName() {
        realPlayer.requestPlayerName();
    }

    //Print the stats and results
    public void showResults()
    {
        System.out.println("Total number of games played ---> " +totalGamesPlayed + "\n");

        System.out.println(" ---- INDIVIDUAL SCORES ---- ");
        System.out.println(realPlayer.getName()+"'s score ---> " +playerScore);
        System.out.println("Computers score ---> " +computerScore);
        System.out.println("Number of games Tied ---> " +tieGame + "\n");

        System.out.println(" -------- RESULT -------- ");

        if (playerScore > computerScore) {
            System.out.println(" YOU WON !!!!");
        }
        else if (computerScore > playerScore) {
            System.out.println(" COMPUTER WON !!!");
        }
        else {
            System.out.println("ITS A TIE !");
        }
    }
}
