
// Problem Name :

// Java Loops I

// Problem URL :

// https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true

// Solution File :

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        // for(int i=1;i<N;i++){
        for (int j = 1; j <= 10; j++) {
            System.out.println(N + " x " + j + " = " + N * j);
        }
        bufferedReader.close();
    }
}
