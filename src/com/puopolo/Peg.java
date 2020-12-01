
package com.puopolo;

public class Peg
{
    static final String[] VALID_COLORS = {
            "R", "G", "B", "Y", "P", "O","X"}; // X is only to be used for Temp Peg

    static public boolean isValidColor(String c)
    {
        for (int i = 0; i < VALID_COLORS.length; i++) {
            if (c.compareToIgnoreCase(VALID_COLORS[i]) == 0) {
                return true;
            }
        }
        return false;
    }

    public Peg(String c) {
        if (isValidColor(c)) {
            _colorString = c;
        } else {
            throw new IllegalArgumentException("Invalid peg color!");
        }
    }

    public Peg setTempPeg(String P ){
        Peg X = new Peg(P);

        return X;
    }

    @Override
    public String toString()
    {
        return _colorString;
    }

    private String _colorString;
        // R=red, G=green,...
}
