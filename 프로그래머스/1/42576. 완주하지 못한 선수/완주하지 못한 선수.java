import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String name : participant){
            map.put(name,map.getOrDefault(name,0) + 1);
        }
        

         for(String c : completion){
             map.put(c, map.get(c) - 1);
        }
       
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            if (entry.getValue() != 0){
                return entry.getKey();
            }
            
        }
        
        return "";
    }
}