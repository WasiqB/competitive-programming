package codeforces.ed110;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class A {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = System.out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static void solve (final PrintWriter out) {
        final var t = IN.nextInt ();
        for (var i = 0; i < t; i++) {
            final var s1 = IN.nextInt ();
            final var s2 = IN.nextInt ();
            final var s3 = IN.nextInt ();
            final var s4 = IN.nextInt ();
            final var players = new int[] { s1, s2, s3, s4 };
            Arrays.sort (players);
            final var game1 = Math.max (s1, s2);
            final var game2 = Math.max (s3, s4);
            final var ans = ((game1 == players[2] || game1 == players[3]) && (game2 == players[2] || game2 == players[3]));
            out.println (ans ? "YES" : "NO");
        }
    }
}
