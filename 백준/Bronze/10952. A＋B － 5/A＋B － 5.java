import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        boolean flag = true;
        while(true){
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (A == 0 && B == 0) {
                break;
            }
            
            System.out.println(A+B);
        }

        scanner.close();
    }
}
