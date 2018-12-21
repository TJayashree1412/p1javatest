package com.stackroute.unittest.pe1;
import java.util.Scanner;
public class TargetGuess {
    public int target=34;
    public String guessMatch(int n){

            if(n<target)
            {
                return "Number guessed is less than original number";
            }
            else if(n==target)
            {
                return "Number guessed is matches the original number";
            }
            else
            {
                return "Number guessed is more than original number";
            }
//        }while(n!=target);

    }
}
