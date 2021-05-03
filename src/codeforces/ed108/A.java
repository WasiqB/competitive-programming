package codeforces.ed108;

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
            final var r = IN.nextInt ();
            final var b = IN.nextInt ();
            final var d = IN.nextInt ();
            var ans = "NO";
            if (r <= b * (d + 1) && b <= r * (d + 1)) {
                ans = "YES";
            }
            out.println (ans);
        }
    }
}