package com.careerdevs;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int[] r = new int[100];
        int[] x = new int[100];
        for (int i = 0;i<a.length();i++){
            r[Character.toUpperCase(a.charAt(i))]++;
        }
        for (int i = 0;i<b.length();i++){
            x[Character.toUpperCase(b.charAt(i))]++;
        }
        if (Arrays.equals(r,x)){System.out.println("Anagrams");} else {System.out.println("Not Anagrams");};

    }
}
