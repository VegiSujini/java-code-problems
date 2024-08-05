
// Problem Name :

// Java Stdin and Stdout I

// Problem URL :

// https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true

// Solution File :

import java.util.Scanner;

public class JavaStdinOutII {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sin = new Scanner(System.in);
        int first_num = sin.nextInt();
        int second_num = sin.nextInt();
        int third_num = sin.nextInt();
        sin.close();
        System.out.print(first_num + "\n" + second_num + "\n" + third_num);
    }
}
