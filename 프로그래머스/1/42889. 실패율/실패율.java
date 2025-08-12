import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int [] arr = new int[N+2];
      
        for(int i = 0; i< stages.length; i++){
            if(stages[i] > N ){
                continue;
            }
            arr[stages[i]]++;
        }
        
        int allPlayers = stages.length;
        int players = 0;
        int cnt = 0;
        
        double rate ; // double 로 캐스팅
        double [] rateArr = new double[N];
        for(int i = 1; i <= N; i++){
            // if(i == 1){
            //     rate = (double) arr[i] /allPlayers;
            // }else{
            //     rate = (double) arr[i]/(allPlayers-cnt);
            // }
            int denom = (i == 1) ? allPlayers : (allPlayers - cnt);
            if (denom == 0) {
            rate = 0.0;
            } else {
            rate = (double) arr[i] / denom;
            }
            
            cnt += arr[i];
    
            rateArr[i-1] = rate;
            //12345
            //34215
            // 1/8.   3/7    2/4.  1/2.   0/1
            // 0.125 0.42857142857142855 0.5 0.5 0.0
            
        } 
        
        Integer[] idx = new Integer[N];
        
        for(int i =0; i< N; i++){
            idx[i] = i;
        }

        Arrays.sort(idx,(a,b) -> {
              int cmp = Double.compare(rateArr[b],rateArr[a]);
              if(cmp != 0) return cmp;
              return Integer.compare(a,b);
        });
        
       
        for(int i = 0; i< N; i++){
            idx[i] = idx[i] + 1;
        }
        
        int[] answer = Arrays.stream(idx)
            .mapToInt(x -> x)
            .toArray();
      
        return answer;
    }
}