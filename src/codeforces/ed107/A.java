package codeforces.ed107;

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
            var ans = 0;
            for (var j = 0; j < n; j++) {
                final var r = IN.nextInt ();
                if (r != 2) {
                    ans++;
                }
            }
            out.println (ans);
        }
    }
}