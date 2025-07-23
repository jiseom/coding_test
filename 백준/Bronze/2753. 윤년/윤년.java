import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value % 4 == 0) {
            if (value % 100 != 0 || value % 400 == 0) {
               System.out.print(1);
            } else {
                System.out.print(0);
            }

        }else{
            System.out.print(0);            
        }
        scanner.close();

    }
}
