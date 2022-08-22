package codeforces.ladder1a;

import static java.lang.Character.isUpperCase;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class G {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = System.out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static void solve (final PrintWriter out) {
        final var text = IN.next ();
        final var chars = text.toCharArray ();
        var upperCount = 0;
        var lowerCount = 0;
        for (final char c : chars) {
            if (isUpperCase (c)) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
        out.println (upperCount > lowerCount ? text.toUpperCase () : text.toLowerCase ());
    }
}
