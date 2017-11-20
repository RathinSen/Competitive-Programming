package com.hackerrank;

import java.util.HashSet;
import java.util.Scanner;

public class TwoStrings {

    static String twoStrings(String s1, String s2){
        HashSet<Character> characters = new HashSet<>();
        for(int i = 0 ; i < s1.length() ; i++){
            characters.add(s1.charAt(i));
        }
        for(int i = 0 ; i < s2.length() ; i++){
            if(characters.contains(s2.charAt(i))){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
