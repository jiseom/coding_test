import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String s = scanner.next();
            System.out.println(s.toLowerCase());
        }
        scanner.close();
    }
}
