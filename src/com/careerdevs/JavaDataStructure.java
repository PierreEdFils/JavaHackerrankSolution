package com.careerdevs;

import java.util.HashSet;
import java.util.Scanner;

public class JavaDataStructure {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
        HashSet<String> hset = new HashSet<>();
        for (int i = 0; i < t; i++) {
            hset.add(pair_left[i] + "," +pair_right[i]);
            System.out.println(hset.size());
        }
    }
}
