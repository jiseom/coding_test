import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(bf.readLine());
        }

        //list => set
        List<String> list = new ArrayList<>(set);

        list.sort((a, b) -> {
                    if (a.length() != b.length()) {
                        return a.length() - b.length();
                    } else {
                        return a.compareTo(b);
                    }
                }
        );

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.print(sb);
    }
}
