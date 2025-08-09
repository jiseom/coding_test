import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int prev = Integer.parseInt(st.nextToken());
        int curr =Integer.parseInt(st.nextToken());

        int dir = curr > prev ? 1 : -1;

        prev = curr;

        while (st.hasMoreTokens()) {
            curr = Integer.parseInt(st.nextToken());
            int d = curr > prev ? 1: -1;
            if (d != dir){
                System.out.println("mixed");
                return;
            }
            prev = curr;
        }

        System.out.print(dir == 1 ? "ascending" : "descending");

    }
}