import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.next();
            if (input.equals("0")) {
                break;
            }
            boolean equals =
                    input.equals(new StringBuilder(input).reverse().toString());
            if (equals) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
