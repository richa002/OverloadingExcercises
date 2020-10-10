package com.richa.learning;

public class Game {
    public String playGame(String player1){
      return player1;
    }
    public String playGame(String player1,String player2){
        if(player1.length()>player2.length())
            return player1;
        else return player2;
    }
    public String playGame(String player1,String player2, String player3){
    return playGame(playGame(player1, player2),player3);
    }
}
