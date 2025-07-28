import java.util.*;
import java.io.*;
public class Main {

    static class Element{
        int value;
        int originalIndex;

        Element(int value,int idx){
            this.value = value;
            this.originalIndex = idx;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        List<Element> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(bf.readLine());
            Element em = new Element(value, i);
            list.add(em);
        }

        list.sort((a,b) -> {
            return a.value - b.value;
        });

        int max = 0;
        for (int i = 0; i <= list.size()-1; i++) {
            Element e = list.get(i);
            int move =  e.originalIndex - i;
            if (max < move) {
                max = move;
            }
        }

       System.out.print(max + 1);
    }
}
