package com.careerdevs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

interface PerformOperation {
    boolean check(int a);
}
class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    // Write your code here
    // Lambda expression for checking if a number is odd or even
    public static PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }

    // Lambda expression for checking if a number is prime or composite
    public static PerformOperation isPrime() {
        return (int a) -> {
            if (a < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    // Lambda expression for checking if a number is a palindrome
    public static PerformOperation isPalindrome() {
        return (int a) -> {
            String str = Integer.toString(a);
            return str.equals(new StringBuilder(str).reverse().toString());
        };
    }
}
public class JavaLambda {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
