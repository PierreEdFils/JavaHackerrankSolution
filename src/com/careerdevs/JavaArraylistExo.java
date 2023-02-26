package com.careerdevs;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylistExo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt();
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                line.add(scanner.nextInt());
            }
            lines.add(line);
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (y <= lines.get(x-1).size()) {
                System.out.println(lines.get(x-1).get(y-1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
