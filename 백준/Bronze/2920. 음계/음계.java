import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine().replaceAll(" ", "");
        char[] arr = input.toCharArray();

        int acsendingCount = 0;
        int descendingCount = 0;

        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] > arr[i + 1]) {
                descendingCount++;
            } else {
                acsendingCount++;
            }
        }

        if (acsendingCount == arr.length -1) {
            System.out.print("ascending");
        }else if (descendingCount == arr.length -1){
            System.out.print("descending");
        }else{
            System.out.print("mixed");
        }
    }
}
