import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st ;

    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int X = nextInt();
        int[] arr = new int[X];
        int sum = 0;
        for (int i = 0; i < X; i++) {
            arr[i] = nextInt();
            sum += arr[i];
        }

        int max ;
        int idx = 0;
        int cnt = 1;
        max = sum;

        for (int i = X; i < N; i++) {
            int incoming = nextInt();
            sum += incoming;
            sum -= arr[idx];
            arr[idx] = incoming;
            if (++idx == X) {
                idx = 0;
            }
            if (sum > max) {
                max = sum;
                cnt = 1;
            }else if(sum==max){
                cnt++;
            }
        }

        
        if (max == 0) {
            System.out.println("SAD");
            return;
        }

        System.out.println(max);
        System.out.println(cnt);

    }

    static int nextInt() throws IOException {
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(bf.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
}
