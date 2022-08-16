package codeforces.ladder1a;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class D {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = System.out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static void solve (final PrintWriter out) {
        var s = IN.next ();
        s = s.replace ("--", "2");
        s = s.replace ("-.", "1");
        s = s.replace ('.', '0');
        out.println (s);
    }
}
