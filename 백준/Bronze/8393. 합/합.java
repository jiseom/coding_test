import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int a = (value * (1 + value)) / 2;
        System.out.print(a);
        scanner.close();
    }

}