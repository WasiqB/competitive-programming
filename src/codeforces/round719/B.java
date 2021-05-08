package codeforces.round719;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class B {
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
            for (var pw = 1; pw <= n; pw = pw * 10 + 1) {
                for (var d = 1; d <= 9; d++) {
                    if (pw * d <= n) {
                        ans++;
                    }
                }
            }
            out.println (ans);
        }
    }
}