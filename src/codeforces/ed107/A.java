package codeforces.ed107;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {
    private static final OutputStream OS      = System.out;
    private static final Scanner      SCANNER = new Scanner (System.in);

    public static void main (final String[] args) {
        try (final PrintWriter out = new PrintWriter (OS)) {
            solve (SCANNER, out);
        }
    }

    private static void solve (final Scanner scanner, final PrintWriter out) {
        final int t = scanner.nextInt ();
        for (int i = 0; i < t; i++) {
            final int n = scanner.nextInt ();
            int ans = 0;
            for (int j = 0; j < n; j++) {
                final int r = scanner.nextInt ();
                if (r != 2) {
                    ans++;
                }
            }
            out.println (ans);
        }
    }
}