package com.puopolo;

public class SolverAlgorithm {
    Code[] SecretCode = new Code [4];
    Code[] GuessCode = new Code [4];

    SolverAlgorithm(Code Secret, Code Guess){
        System.out.println(Secret);
       // SecretCode=Secret;          // Had the choice of converting to string and comparing, or just comparing "Code" datatype. I chose Code.
    }
}
