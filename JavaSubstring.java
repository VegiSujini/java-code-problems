// Problem Name :

// Java String Reverse

// Problem URL :

//https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true

// Solution File :
import java.util.Scanner;

class JavaSubstring {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        int len = S.length();
        char c[] = new char[len];
        for (int i = 0; i < len; i++) {
            c[i] = S.charAt(i);
        }
        for (int i = start; i < end; i++) {
            System.out.print(c[i]);
        }
    }
}
