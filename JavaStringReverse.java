// Problem Name :

// Java String Reverse

// Problem URL :

// https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true

// Solution File :
import java.util.Scanner;

class JavaStringReverse {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int arr[][] = new int[t][3];
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            arr[i][0] = a;
            arr[i][1] = b;
            arr[i][2] = n;
        }
        double sum;
        for (int i = 0; i < t; i++) {
            sum = 0;
            sum = sum + arr[i][0];
            for (int j = 0; j < arr[i][2]; j++) {
                sum = sum + Math.pow(2, j) * arr[i][1];
                System.out.print((int) sum + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
