package com.careerdevs;

import java.util.Scanner;

public class Java1DArrayPart2 {
    public static boolean canWin(int leap, int[] game ) {
        // Return true if you can win the game; otherwise, return false.

        return canWinHelper(leap, game, 0);
    }
    private static boolean canWinHelper(int leap, int[] game, int i) {
        if (i < 0 || game[i] == 1) {
            // We've gone out of bounds or hit a 1, so we can't continue.
            return false;
        } else if (i == game.length - 1 || i + leap > game.length - 1) {
            // We've reached the end of the game.
            return true;
        } else {
            // Try all possible moves.
            game[i] = 1; // Mark this cell as visited.
            boolean canWin = canWinHelper(leap, game, i + 1) ||
                    canWinHelper(leap, game, i - 1) ||
                    canWinHelper(leap, game, i + leap);
            game[i] = 0; // Unmark this cell.
            return canWin;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
