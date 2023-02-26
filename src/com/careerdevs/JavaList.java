package com.careerdevs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        // read initial input list
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // read number of queries and perform them
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String query = scanner.next();
            if (query.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else if (query.equals("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }
        }

        // print final list
        for (int value : list) {
            System.out.print(value + " ");
        }
    }
}
