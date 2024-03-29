package com.careerdevs;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> hs = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            hs.add(num);
            if(deque.size() == m){
                if(hs.size() > max){
                    max = hs.size();
                }
                int removed = (int)deque.removeFirst();
                if(!deque.contains(removed)){
                    hs.remove(removed);
                }
            }
        }
        System.out.println(max);
    }
}

