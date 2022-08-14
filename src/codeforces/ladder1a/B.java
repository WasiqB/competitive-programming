package codeforces.ladder1a;

import static java.lang.Math.abs;

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
        final var onePosition = new int[2];
        boolean found = false;
        for (var i = 0; i < 5 && !found; i++) {
            for (var j = 0; j < 5; j++) {
                if (IN.nextInt () == 1) {
                    onePosition[0] = i;
                    onePosition[1] = j;
                    found = true;
                    break;
                }
            }
        }
        final var ans = abs (onePosition[0] - 2) + abs (onePosition[1] - 2);
        out.println (ans);
    }
}
