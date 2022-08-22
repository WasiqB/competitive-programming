package codeforces.ladder1a;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toUpperCase;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class H {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = System.out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static void solve (final PrintWriter out) {
        var text = IN.next ();
        if (!isUpperCase (text.charAt (0))) {
            text = toUpperCase (text.charAt (0)) + text.substring (1);
        }
        out.println (text);
    }
}
