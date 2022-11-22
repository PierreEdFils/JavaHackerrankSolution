package com.careerdevs;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i = 0; i < q; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0; j < n; j++) {
                int s = a;

                for(int l = 0; l <= j; l++) {
                    s += Math.pow(2, l) * b;
                }
                System.out.print(s);
                System.out.print(" ");
            }
            System.out.print("\n");

        }
}
}
