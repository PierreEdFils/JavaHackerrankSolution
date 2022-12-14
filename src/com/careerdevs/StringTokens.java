package com.careerdevs;

import java.util.Scanner;

public class StringTokens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) {
            System.out.println("0");
        } else {
            String s = scanner.nextLine();
            String[] string = s.trim().split("[ -!,?._'@]+");
            if (1 <= s.length() && s.length() <= 4 * Math.pow(10, 5)) {
                System.out.println(string.length);
                for (String element : string) {
                    System.out.println(element);
                }
            }
        }
    }
}
