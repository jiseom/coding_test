import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String value = scanner.next();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum += value.charAt(i) - '0';
        }
        System.out.println(sum);
        scanner.close();
    }
}