import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A == B && A == C) {
            System.out.println(10000 + (A * 1000));
        } else if (A == B || A == C) {
            System.out.println(1000 + (A * 100));
        } else if (B == C || B == A) {
            System.out.println(1000 + (B * 100));
        } else if (C == B || C == A) {
            System.out.println(1000 + (C * 100));
        } else {
            if (A > B && A > C) {
                System.out.println(A * 100);
            } else if (B > A && B > C) {
                System.out.println(B * 100);
            } else {
                System.out.println(C * 100);
            }
        }

        scanner.close();
    }

}