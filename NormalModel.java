package com.example.whatnumberamithinkingof;

public class NormalModel {
    private int numGuess;
    private int answer;
    private String msg;
    private boolean gameDone;
    private final int maxTries = 5;

    public NormalModel(){
        this.gameDone = false;
        this.answer = (int) (Math.random() * 10 + 1);
        this.numGuess = 1;
    }

    public boolean isGameOver(){
        return gameDone;
    }

    public String getMsg(){
        return msg;
    }

    public void answerNormal(int guess) {
        if(numGuess == maxTries){
            msg = "Your all out of tries buddy!";
            gameDone = true;
        }
       if(gameDone){
           msg = "The game is over, you lose!";
        }
       else if (guess == answer){
           if(numGuess == 1)
           {
               msg = String.format("You guessed the right number in the first try!");
           }
           else{
               msg = String.format("You guessed the right number in %d tries!", numGuess);
           }
           gameDone = true;
       }
       else{
           if(guess < answer){
               msg = "Your guess is too low!";
           }
           else{
               msg = "Your guess is too high!";
           }
       }
       numGuess++;
    }
}
