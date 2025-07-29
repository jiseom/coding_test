import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        int[] input = new int[100001];


        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(bf.readLine());
            input[number]++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 10000; i++) {
            for (int j = 1; j <= input[i]; j++) {
                result.append(i).append("\n");
            }

        }
        System.out.print(result);
    }
}
