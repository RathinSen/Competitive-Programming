package com.hackerrank;

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
    
    public static int anagram(String s){
        if(s.length()%2 != 0){
            return -1;
        }
        int[] countArray = new int[26];
        int i = 0;
        for(; i < s.length()/2; i++){
            countArray[s.charAt(i) - 'a']++;
        }
        for(; i < s.length() ; i++){
            countArray[s.charAt(i) - 'a'] = Integer.max(countArray[s.charAt(i) - 'a'] - 1, 0);
        }
        int uniqLetters = 0;
        for(i =0 ; i < countArray.length ;i++){
            uniqLetters += countArray[i];
        }
        return uniqLetters;
    }
}
