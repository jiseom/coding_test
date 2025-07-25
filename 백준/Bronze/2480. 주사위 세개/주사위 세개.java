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
        } else if (B == C) {
            System.out.println(1000 + (B * 100));
        } else {
            int max = Math.max(A, Math.max(B, C));
            System.out.println(max * 100);
        }

        scanner.close();
    }

}