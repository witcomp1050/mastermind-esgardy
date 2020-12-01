package com.puopolo;

public class Compare {


    Compare(Peg S1,Peg S2,Peg S3,Peg S4,Peg G1,Peg G2,Peg G3,Peg G4 ){
        Blackpeg=0;
        Whitepegs=0;
        System.out.println("Compare starts:");
        Peg Temp = new Peg("X");
        //System.out.println(Temp);
        _Guess[0]=G1;
        _Guess[1]=G2;
        _Guess[2]=G3;
        _Guess[3]=G4;
        _Code[0]=S1;
        _Code[1]=S2;
        _Code[2]=S3;
        _Code[3]=S4;

        //System.out.println(Temp);
        // Used to verify arrays were filled correctly. They are--------.
        /*System.out.println("Guess array");
        for( int i =0; i<4; i++){
            System.out.println(_Guess[i]);//System.out.println(_Code[i]);
        }
        System.out.println("Code array");
        for( int i =0; i<4; i++){
            System.out.println(_Code[i]);
        }
        */

        // Going to search and compare the pegs here and increment whiteball and blackpeg when condition is met
        for(int i =0 ; i< _Code.length ; i++){//Using Code.length in case I have time to add longer Codes then 4 pegs.
            System.out.println(_Code[i]);
            System.out.println(_Guess[i]);
            if(_Guess[i].toString().equals(_Code[i].toString()))
            {
                System.out.println("They equal");
                Blackpeg++;
                _Guess[i]=Temp;
                _Code[i]=Temp;
            }
        }
        System.out.println("Searching for Whitepegs");
        for(int j =0; j<_Code.length; j++) {
            System.out.println(_Guess[j]);
            for (int i = 0; i < _Code.length; i++) { //Using Code.length in case I have time to add longer Codes then 4 pegs.
                if (_Guess[j].toString().equals(_Code[i].toString()) && !_Code[i].toString().equals(Temp.toString())) {
                    Whitepegs++;
                    _Guess[j] = Temp;
                    _Code[i] = Temp;
                }
            }
        }
        System.out.println(Blackpeg);
        System.out.println(Whitepegs);

        System.out.println("------------------");
    }

   public int Getblackpeg(){
        return Blackpeg;
    }

    public int getWhitepegs(){
        return Whitepegs;
    }

    private Peg[] _Guess = new Peg[4];
    private Peg[] _Code = new Peg[4];
    private int Whitepegs = 0; // make a get function for this and use it in the board to check if the user won
    private int Blackpeg = 0;   // make a get function for this and use it in the board to check if the user won

}
