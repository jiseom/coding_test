import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.print(Math.max(reverse(A), reverse(B)));
    }

    static int reverse(int number) {
        int temp = number;
        int rev = 0;
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return rev;
    }
}
