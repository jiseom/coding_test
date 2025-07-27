
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(bf.readLine());
        }

        String[] arr = set.toArray(new String[0]);

        Arrays.sort(arr,(a,b) -> {
            if(a.length() != b.length()){
                return a.length() - b.length();
            }else{
                return a.compareTo(b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< arr.length; i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }


}