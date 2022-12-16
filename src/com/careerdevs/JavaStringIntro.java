package com.careerdevs;

import java.util.Scanner;

public class JavaStringIntro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length() + B.length());

        int l1 = A.length();
        int l2 = B.length();

        int minL = (l1 < l2) ? l1 : l2;

        String order = "No";

        for (int i = 0; i < minL; i++) {
            if (A.charAt(i) != B.charAt(i)) {
                order = A.charAt(i) < B.charAt(i) ? "No" : "Yes";
                break;
            }
        }

        System.out.println(order);

        System.out.print((A.charAt(0) + "").toUpperCase() + A.substring(1) + " " + (B.charAt(0) + "").toUpperCase() + B.substring(1));

    }
}
