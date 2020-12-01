package com.puopolo;

import java.util.ArrayList;
import java.util.List;

public class Board
{
    public Board(int maxGuesses, Code theSolution) {
        if (maxGuesses != 10) {
            throw new IllegalArgumentException("Guesses must be 10!");
        }
        _solution = theSolution;
        _guesses = new ArrayList<>(maxGuesses);

    }



    public void printTextBoard() {
        System.out.println("+----------------+");
        System.out.println(_solution);
        System.out.println("+----------------+");
    }

    public void AddGuess(Code userGuessCode) {
        DoesitMatch=0;  // will use a condition for this. If blackpegs is 4, then does it match equals 1, if it equals 1 the user wins, else continue the loop until 10 reps
        _guesses.add(userGuessCode);
        //_solution.getPegAt(0);
       //String x=(userGuessCode.getPegAt(0));

       Compare CompareBoth = new Compare( _solution.getPegAt(0), _solution.getPegAt(1), _solution.getPegAt(2), _solution.getPegAt(3), userGuessCode.getPegAt(0),userGuessCode.getPegAt(1) ,userGuessCode.getPegAt(2) ,userGuessCode.getPegAt(3) );
       // System.out.println(userGuessCode.getPegAt(0));
        //System.out.println(_guesses.get(0));
        //System.out.println(_guesses.get(0));
        //test.get
        //System.out.println();
        //System.out.println(test);
        if(CompareBoth.Getblackpeg() == 4)
        {
            DoesitMatch=1;
        }



    }

    int Getguesses(){
        return _guesses.size();
    }

    int DoesitMatch(){
        return DoesitMatch;
    }

    private Code _solution;
    private List<Code> _guesses;
    private int DoesitMatch;


}
