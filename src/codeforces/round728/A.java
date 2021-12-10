package codeforces.round728;

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
        final var t = IN.nextInt ();
        for (var i = 0; i < t; i++) {
            final var n = IN.nextInt ();
            final var ans = new String[n];
            ans[0] = Integer.toString (n);
            for (var j = 1; j <= n - 1; j++) {
                ans[j] = Integer.toString (j);
            }
            out.println (String.join (" ", ans));
        }
    }
}