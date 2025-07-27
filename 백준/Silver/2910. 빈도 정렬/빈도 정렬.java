import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer tokenizer = new StringTokenizer(bf.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(tokenizer.nextToken());
            map.put(number, map.getOrDefault(number, 0) + 1);

            if (!list.contains(number)) {
                list.add(number);
            }
        }

        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort((a, b) ->
        {
            int compare = b.getValue() - a.getValue();
            if (compare != 0) return compare;
            return list.indexOf(a.getKey()) - list.indexOf(b.getKey());
        });


        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int valueNumber = entry.getKey();
            int valueCount = entry.getValue();

            for (int i = 0; i < valueCount; i++) {
                sb.append(valueNumber).append(" ");
            }

        }
        System.out.print(sb);
    }
}
