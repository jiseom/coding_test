import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int totalprogresses = 100;
        int[] days = new int[progresses.length];
        
        for(int i =0; i< progresses.length; i++){
            int pro = totalprogresses - progresses[i];
            int estimate = (pro + speeds[i] -1)/speeds[i]; // 반올림 
            days[i] = estimate;  
        }
            
        List<Integer> list = new ArrayList<>();
        
        int current = days[0];
        int cnt = 1;
        
        for (int i = 1; i < days.length; i++){
            if(days[i] <= current ){
                cnt++;
            }else{
                list.add(cnt);
                cnt = 1;
                current = days[i];   
            }
        }
        list.add(cnt);
        
        int[] answer = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
         
        return answer;
    }
}