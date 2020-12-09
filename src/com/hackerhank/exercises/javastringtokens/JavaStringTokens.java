package com.hackerhank.exercises.javastringtokens;

import java.util.Scanner;

public class JavaStringTokens {

    /**
     * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a
     * token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by
     * each token on a new line.
     * <p>
     * Note: You may find the String.split method helpful in completing this challenge.
     * <p>
     * Input Format
     * <p>
     * A single string, .
     * <p>
     * Constraints
     * <p>
     * is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas
     * (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
     * Output Format
     * <p>
     * On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be
     * unique). Next, print each of the  tokens on a new line in the same order as they appear in input string
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(s.trim().length() == 0 || s.trim().length() > 400000){
            System.out.println(0);
            return;
        }

        String tokens[] = s.trim().split("[\\s,?'!_.@]+");
        System.out.println(tokens.length);

        for(String token : tokens){
            System.out.println(token);
        }
        scan.close();
    }
}

