
// Problem Name :

// Java Int to String

// Problem URL :

// https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true

// Solution File :

import java.util.Scanner;

public class JavaInttoString {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sin = new Scanner(System.in);
        int n = sin.nextInt();
        if (-100 <= n || n >= 100) {
            String str = "" + n;
            if (str.length() >= 0) {
                System.out.println("Good job");
            } else
                System.out.println("Wrong answer");
        }
        sin.close();
    }

}
