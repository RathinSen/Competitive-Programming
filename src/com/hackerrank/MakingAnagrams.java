package com.hackerrank;

import java.util.Scanner;

public class MakingAnagrams {

    static int makingAnagrams(String s1, String s2){
        int[] countArray = new int[26];
        for(int i = 0 ; i < s1.length() ; i++){
            countArray[s1.charAt(i) - 'a']++;
        }
        for(int i = 0 ; i < s2.length() ; i++){
                countArray[s2.charAt(i) - 'a']--;
        }
        int uniqueLetters = 0;
        for(int i = 0 ; i < countArray.length ; i++){
            uniqueLetters += Math.abs(countArray[i]);
        }
        return uniqueLetters;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
