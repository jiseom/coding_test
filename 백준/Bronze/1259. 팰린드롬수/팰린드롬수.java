import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            int rev = 0, temp = n;
            while (temp > 0) {
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }
            boolean isPalindrome = (n == rev);
            if (isPalindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}