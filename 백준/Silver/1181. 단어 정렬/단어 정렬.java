import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
       
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Set<String> set = new HashSet<>();


        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            set.add(st.nextToken());
        }

        String[] arr = new String[set.size()];
        Iterator<String> it = set.iterator();

        for (int i = 0; i < set.size(); i++) {
             arr[i] = it.next();
        }


        Arrays.sort(arr, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            } else {
                return a.compareTo(b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< arr.length ; i++){
            sb.append(arr[i]).append("\n");
        }

        System.out.print(sb);
    }
}
