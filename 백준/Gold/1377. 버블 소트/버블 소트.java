import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] input = new int[N];
        int[] count = new int[1_000_001];

        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(bf.readLine());
            count[input[i]]++;
        }
        
        int accumulated = 0; 
        for (int i = 0; i <= 1_000_000; i++) {
            accumulated += count[i];
            count[i] = accumulated- 1; 
        }
        
        int maxMove = 0;
        for (int i = 0; i < N; i++) {
            int sortedIndex = count[input[i]];
            maxMove = Math.max(maxMove,i-sortedIndex);
        }
        
        System.out.println(maxMove+1);
    }
    
}