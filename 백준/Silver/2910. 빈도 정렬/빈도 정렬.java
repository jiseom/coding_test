import java.io.*;
import java.util.*;

public class Main {
    static class NumberStat implements Comparable<NumberStat> {

        int value;
        int count;
        int order;

        @Override
        public int compareTo(NumberStat n) {
            if (this.count == n.count) {
                return this.order - n.order;
            } else {
                return n.count - this.count;
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);

        HashMap<Integer,NumberStat> map = new HashMap<>();
        List<NumberStat> list= new ArrayList<>();

        String[] arr2= bf.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(arr2[i]);
            if (!map.containsKey(number)) {
                NumberStat stat = new NumberStat();
                stat.value = number;
                stat.count = 0;
                stat.order = i;
                map.put(number, stat);
                list.add(stat);
            }
            map.get(number).count++;
        }

        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        for (NumberStat stat : list){
            while (stat.count > 0) {
                sb.append(stat.value).append(" ");
                stat.count--;
            }
        }

        System.out.print(sb);

    }
}
