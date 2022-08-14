package codeforces.ladder1a;

import java.io.OutputStream;
import java.io.PrintWriter;
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
        final var n = IN.nextInt ();
        var sumX = 0;
        var sumY = 0;
        var sumZ = 0;
        for (var i = 0; i < n; i++) {
            final var x = IN.nextInt ();
            final var y = IN.nextInt ();
            final var z = IN.nextInt ();
            sumX += x;
            sumY += y;
            sumZ += z;
        }
        final var ans = sumX == sumY && sumY == sumZ && sumZ == 0 ? "YES" : "NO";
        out.println (ans);
    }
}
