package codejam.y2022.qual;

import static java.lang.System.out;
import static java.text.MessageFormat.format;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SolutionA {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader (new InputStreamReader (System.in)));
        int t = in.nextInt();
        for (int i = 1; i <= t; ++i) {
            int r = in.nextInt();
            int c = in.nextInt();
            out.println (format ("Case #{0}:", i));
            for (int j = 0; j < (r * 2) + 1; j++) {
                for (int k = 0; k < (c * 2) + 1; k++) {
                    if (j < 2 && k < 2) {
                        out.print (".");
                        continue;
                    }
                    if (j % 2 == 1 && k % 2 == 1) {
                        out.print (".");
                    }
                    if (j % 2 == 0 && k % 2 == 0) {
                        out.print ("+");
                    }
                    if (j % 2 == 0 && k % 2 == 1) {
                        out.print ("-");
                    }
                    if (j % 2 == 1 && k % 2 == 0) {
                        out.print ("|");
                    }
                }
                out.println ();
            }
        }
    }
}