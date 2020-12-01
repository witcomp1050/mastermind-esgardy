package com.puopolo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class User {

    User() {
    }


    public Code MakeGuess(String Guess) {

        String One = Character.toString(Guess.charAt(0));
        Boolean one = Peg.isValidColor(One);
        String Two = Character.toString(Guess.charAt(1));
        Boolean two = Peg.isValidColor(Two);
        String Three = Character.toString(Guess.charAt(2));
        Boolean three= Peg.isValidColor(Three);
        String Four = Character.toString(Guess.charAt(3));
        Boolean four = Peg.isValidColor(Four);
        //System.out.println(Four);

        if(!(one && two && three && four)) {
            throw new IllegalArgumentException("False numbers");
            }


        return new Code(Guess);
    }


}
