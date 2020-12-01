package com.puopolo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Code
{
    static final int CODE_SIZE = 4;

    public Code(String theCode) {
        if (theCode.length() != CODE_SIZE) {
            throw new IllegalArgumentException("Invalid code size");
        }
        _pegs = new ArrayList<>();
        for (int i = 0; i < theCode.length(); i++) {
            char c = theCode.charAt(i);
            Peg p = new Peg(Character.toString(c));
            _pegs.add(p);
        }
    }

    @Override
   public String toString() {
       return Arrays.toString(_pegs.toArray());
    }

    private List<Peg> _pegs;


    Peg getPegAt(int index){


        return _pegs.get(index);
    }
}

