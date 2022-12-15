package com.careerdevs;

import java.util.Scanner;

public class JavaSubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i=0;i<S.length();i++)
        {if((i>=start) && (i<end))
            System.out.print(S.charAt(i));

        }
    }
}
