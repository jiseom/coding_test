import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            if(A == 0 && B==0 && C==0)break;

            int max = Math.max(A,(Math.max(B,C)));

            int sum = A * A + B * B + C * C - max * max;

            if(max*max == sum){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
        }
    }
}