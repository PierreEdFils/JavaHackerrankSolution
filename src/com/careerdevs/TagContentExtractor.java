package com.careerdevs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    static final Pattern p = Pattern.compile("<(.+)>([^<>]+)</\\1>");
    public static void main(String[] args){

        String regex = "<(.+)>([^<>]+)</(\\1)>";
        Pattern p = Pattern.compile(regex);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases-- > 0) {
            String line = in.nextLine();
            Matcher m = p.matcher(line);

            if (m.find()) {
                m.reset();
                while (m.find()) {
                    System.out.println(m.group(2));
                }
            } else {
                System.out.println("None");
            }
        }

        in.close();
    }
}
