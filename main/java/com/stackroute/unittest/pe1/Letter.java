package com.stackroute.unittest.pe1;
import java.util.Scanner;
public class Letter {
    public String isLetter(char c) {
        if (c >= 65 && c <= 90) {
            return "Capital letter";
        } else if (c >= 97 && c <= 122) {
            return "Small case letter";
        } else if (c >= 48 && c <= 57) {
            return "Digit";
        } else {
            return "Symbol";
        }
    }
}
