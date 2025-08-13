import java.util.*;
class Solution {
    public String[] solution(String[] record) {
    HashMap<String,String> map = new HashMap<>();
        
    int idx = 0;

    for(int i= 0; i<record.length; i++){
        String[] arr = record[i].split(" ");
        
        if(!arr[0].equals("Change")){
            idx++;
        }
        
        if(!arr[0].equals("Leave")){
            map.put(arr[1], arr[2]); 
        } 
        
    }
        int w = 0;
        String[] result = new String[idx];
        for(int i = 0; i< record.length; i++){
            String[] arr = record[i].split(" ");
        
            if(!"Change".equals(arr[0])){
            result[w++]  = "Enter".equals(arr[0]) ? map.get(arr[1]) + "님이 들어왔습니다." : map.get(arr[1]) +"님이 나갔습니다.";
            }
            
        }

        //set 에서 데이터 꺼내는 법 (iterator)
        //map 에서 데이터 넣는법 (put)

        return result;
    }
}