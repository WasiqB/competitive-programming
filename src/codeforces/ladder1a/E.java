package codeforces.ladder1a;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class E {
    private static final Scanner      IN = new Scanner (System.in);
    private static final OutputStream OS = System.out;

    public static void main (final String[] args) {
        try (final var out = new PrintWriter (OS)) {
            solve (out);
        }
    }

    private static boolean isBeautiful (final int y) {
        final var digits = new ArrayList<Integer> ();
        var temp = y;
        while (temp > 0) {
            final var currentDigit = temp % 10;
            if (!digits.contains (currentDigit)) {
                digits.add (currentDigit);
            } else {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    private static void solve (final PrintWriter out) {
        var y = IN.nextInt () + 1;
        while (!isBeautiful (y)) {
            y++;
        }
        out.println (y);
    }
}
