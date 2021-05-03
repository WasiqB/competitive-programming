package codeforces.gr14;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
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
            final var x = IN.nextInt ();
            final var u = new ArrayList<Integer> ();
            for (var j = 0; j < n; j++) {
                u.add (IN.nextInt ());
            }
            u.sort (Collections.reverseOrder ());
            var sum = 0;
            for (var j = 0; j < n; j++) {
                sum += u.get (j);
                if (sum == x && j < n - 1) {
                    final int next = u.get (j + 1);
                    u.set (j + 1, u.get (j));
                    u.set (j, next);
                }
            }
            if (sum != x) {
                out.println ("YES");
                u.forEach (a -> out.print (a + " "));
                out.println ();
            } else {
                out.println ("NO");
            }
        }
    }
}