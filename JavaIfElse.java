// Problem Name :

// Java if-Else

// Problem URL :

// https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true

// Solution File :

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIfElse {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        if (N == 1 || N == 5 || N % 2 != 0) {
            System.out.print("Weird");
        } else if (N % 2 == 0) {
            if (N == 0 || 2 >= N || N < 5)
                System.out.print("Not Weird");
            else if (6 >= N || N <= 20)
                System.out.print("Weird");
            else if (N > 20)
                System.out.print("Not Weird");
        }
        bufferedReader.close();
    }
}
