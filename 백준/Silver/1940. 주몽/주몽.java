import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st ;
    public static void main(String[] args) throws IOException {
        int N = nextInt();
        int M = nextInt();

        String[] input = bf.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(arr);

        int sum ;
        int cnt = 0;

        int left = 0, right = N - 1;

        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum == M) {
                cnt++;
                left++;
                right--;
            }else if(sum < M){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(cnt);
    }

    static int nextInt()throws IOException{
        while(st == null || !st.hasMoreTokens()){
            st = new StringTokenizer(bf.readLine());
        }
        return Integer.parseInt(st.nextToken());
    }
    
}