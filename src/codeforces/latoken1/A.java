package codeforces.latoken1;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = System.out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static void colorGrid (final char[][] grid, final List<int[]> positionForR,
        final List<int[]> positionForW) {

    }

    private static void readProblem (final char[][] grid, final List<int[]> positionR, final List<int[]> positionW) {
        for (var j = 0; j < grid.length; j++) {
            grid[j] = IN.next ()
                .toCharArray ();
            for (var k = 0; k < grid[j].length; k++) {
                final var chr = grid[j][k];
                if (chr == 'R') {
                    positionR.add (new int[] { j, k });
                }
                if (chr == 'W') {
                    positionW.add (new int[] { j, k });
                }
            }
        }
    }

    private static void solve (final PrintWriter out) {
        final var t = IN.nextInt ();
        for (var i = 0; i < t; i++) {
            final var n = IN.nextInt ();
            final var m = IN.nextInt ();
            final var grid = new char[n][m];
            final List<int[]> positionForR = new ArrayList<> ();
            final List<int[]> positionForW = new ArrayList<> ();

            readProblem (grid, positionForR, positionForW);
            colorGrid (grid, positionForR, positionForW);
        }
    }
}
