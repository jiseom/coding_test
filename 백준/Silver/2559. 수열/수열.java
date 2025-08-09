import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(bf.readLine());

        int sum = 0;
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int i = K; i < N; i++) {
            sum += arr[i];
            sum -= arr[i - K];
            if (max < sum) max = sum;
        }

        System.out.print(max);
    }
}
