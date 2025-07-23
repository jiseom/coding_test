import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int X = scanner.nextInt();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < A; i++) {
            int number = scanner.nextInt();
            if (number < X) {
                builder.append(number).append(",");
            }
        }
        System.out.print(builder.toString().replaceAll(",", " "));
    }
}