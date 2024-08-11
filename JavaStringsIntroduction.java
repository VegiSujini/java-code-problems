// Problem Name :

// Java if-Else

// Problem URL :

// https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

// Solution File :

import java.io.IOException;
import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int len1 = A.length();
        int len2 = B.length();
        int sumt = len1 + len2;
        System.out.println(sumt);
        if (A.charAt(0) > B.charAt(0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        char nstr[] = new char[sumt + 1];
        int j = 1;
        for (int i = 0; i <= sumt; i++) {
            if (i == 0) {
                nstr[i] = Character.toUpperCase(A.charAt(0));
            } else {
                if (i == len1) {
                    nstr[i] = ' ';
                } else if (i == len1 + 1) {
                    nstr[i] = Character.toUpperCase(B.charAt(0));
                } else if (i < len1)
                    nstr[i] = A.charAt(i);
                else
                    nstr[i] = B.charAt(j++);
            }
            System.out.print(nstr[i]);
        }
    }
}
