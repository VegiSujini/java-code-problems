
// Problem Name :

// Java Stdin and Stdout II

// Problem URL :

// https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true

// Solution File :

import java.util.Scanner;

public class JavaStdinOutI {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sin = new Scanner(System.in);
        int num = sin.nextInt();
        double doub = sin.nextDouble();
        sin.nextLine();
        String str = sin.nextLine();
        System.out.println("String: " + str);
        System.out.println("Double: " + doub);
        System.out.println("Int: " + num);
        sin.close();
    }
}
