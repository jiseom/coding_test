import java.util.*;
import java.io.*;
public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int N = nextInt();
        int K = nextInt();

        if (K > N) {
            System.out.println(0);
            return;
        }
        long sum = 0;

        int[] buffer = new int[K];
        for (int i = 0; i < K; i++) {
            buffer[i] = nextInt();
            sum += buffer[i];
        }

        long max = sum;
        int idx = 0;

        for (int i = K; i < N; i++) {
            int incoming = nextInt();
            sum += incoming;
            sum -= buffer[idx];
            buffer[idx] = incoming;

            if (++idx == K) {
                idx = 0;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.print(max);


    }

    static int nextInt() throws IOException {
        if (st == null || !st.hasMoreTokens()) {
            String line = bf.readLine();
            if (line == null) {
                throw new EOFException();
            }
            st = new StringTokenizer(line);
        }
        return Integer.parseInt(st.nextToken());
    }


}
