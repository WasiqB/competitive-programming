package codeforces.ladder1a;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class C {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = System.out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static void solve (final PrintWriter out) {
        final var n = IN.nextInt ();
        final var t = IN.nextInt ();
        final var s = IN.next ()
            .toCharArray ();
        for (var i = 0; i < t; i++) {
            for (var j = 1; j < n; j++) {
                if (s[j - 1] == 'B' && s[j] == 'G') {
                    swap (s, j - 1, j);
                    j++;
                }
            }
        }
        final var ans = new String (s);
        out.println (ans);
    }

    private static void swap (final char[] s, final int i, final int j) {
        final var temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
