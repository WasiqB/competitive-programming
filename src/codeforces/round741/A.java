package codeforces.round741;

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
            final var l = IN.nextInt ();
            final var r = IN.nextInt ();
            var ans = 0;
            if (l != r) {
                for (var j = r; j >= l; j--) {
                    for (var k = j - 1; k >= l; k--) {
                        final var mod = j % k;
                        System.out.println (j + " % " + k + " = " + mod);
                        ans = Math.max (ans, mod);
                    }
                }
            }
            System.out.println (ans);
        }
    }
}
