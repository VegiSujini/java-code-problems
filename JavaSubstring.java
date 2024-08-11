// Problem Name :

// Java String Reverse

// Problem URL :

// https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true

// Solution File :
import java.util.Scanner;

class JavaSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int n = A.length();
        char oa[] = new char[n];
        char ra[] = new char[n];
        for (int i = 0; i < n; i++) {
            oa[i] = A.charAt(i);
        }
        for (int i = n - 1, k = 0; i >= 0; i--) {

            ra[k++] = A.charAt(i);
        }

        int l = 0;
        for (int i = 0; i < n; i++) {
            if (oa[i] == ra[i]) {
                l++;
            }
        }
        if (l == n)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
