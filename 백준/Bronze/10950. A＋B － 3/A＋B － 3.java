import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        
        for(int i = 0; i < count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            builder.append(a+b).append(",");
        }
        
        String[] split = builder.toString().split(",");
        for (String value : split){
            System.out.println(value);    
        }
    }

}
