package codeforces.round722;

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
            final var n = IN.nextInt ();
            final var a = new int[n];
            for (var j = 0; j < n; j++) {
                a[j] = IN.nextInt ();
            }
            Arrays.sort (a);
            var ans = 0;
            for (var j = 0; j < n; j++) {
                if (a[j] != a[0]) {
                    ans++;
                }
            }
            out.println (ans);
        }
    }
}
