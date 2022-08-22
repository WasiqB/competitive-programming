package codeforces.ladder1a;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class F {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = System.out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static void printGame (final int[][] boards, final PrintWriter out) {
        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                if (boards[i][j] % 2 == 0) {
                    out.print ("1");
                } else {
                    out.print ("0");
                }
            }
            out.println ();
        }
    }

    private static void solve (final PrintWriter out) {
        final var games = new int[3][3];
        for (var i = 0; i < 3; i++) {
            for (var j = 0; j < 3; j++) {
                final var currentValue = IN.nextInt ();
                if (currentValue > 0) {
                    toggleCell (games, i, j, currentValue);
                    toggleCell (games, i, j + 1, currentValue);
                    toggleCell (games, i, j - 1, currentValue);
                    toggleCell (games, i + 1, j, currentValue);
                    toggleCell (games, i - 1, j, currentValue);
                }
            }
        }
        printGame (games, out);
    }

    private static void toggleCell (final int[][] boards, final int i, final int j, final int value) {
        if (i < 0 || i >= 3 || j < 0 || j >= 3) {
            return;
        }
        boards[i][j] += value;
    }
}
