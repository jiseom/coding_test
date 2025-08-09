import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st ;
    public static void main(String[] args) throws IOException {
        int N = nextInt(); 
        int T = nextInt(); 

        long sum = 0;
        long[] arr = new long[T];

        for (int i = 0; i < T; i++) { 
            arr[i] = nextInt();
            sum += arr[i];
        }

        long max = sum;
        int idx = 0;

        for (int i = T; i < N; i++) {
            int incoming = nextInt();
            sum += incoming;
            sum -= arr[idx];
            arr[idx] = incoming;
            if (++idx == T) {
                idx = 0;
            }
            if (sum > max) max = sum;
        }

        System.out.println(max);
    }

    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(bf.readLine());
        }

        return Integer.parseInt(st.nextToken());
    }

}