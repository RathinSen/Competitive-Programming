package com.hackerrank;

import java.util.Scanner;

public class StringConstruction {

    static int stringConstruction(String s) {
        int[] countArray = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            countArray[s.charAt(i) - 'a'] = 1;
        }
        int charge = 0;
        for(int i = 0 ; i < countArray.length ; i++){
            charge += countArray[i];
        }
        return charge;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = stringConstruction(s);
            System.out.println(result);
        }
        in.close();
    }

}
