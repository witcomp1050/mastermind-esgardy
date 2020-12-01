package com.puopolo;
import java.util.Random;
import java.util.SplittableRandom;

public class Computer
{
    public Code makeSolution() {
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < Code.CODE_SIZE; i++) {
            int j = r.nextInt(Peg.VALID_COLORS.length - 1) + 0;
            sb.append(Peg.VALID_COLORS[j]);
        }
        return new Code(sb.toString());
    }
}
