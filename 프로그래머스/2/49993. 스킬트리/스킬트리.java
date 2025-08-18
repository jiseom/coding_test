import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {     
        String[] arr = skill.split("");
        String[] strArr = new String[skill_trees.length];
        
        for(int i =0; i< skill_trees.length; i ++ ){
            String node = "";
            for(char ch : skill_trees[i].toCharArray()){
                for(int j = 0; j < arr.length ; j++){ 
                    if(String.valueOf(ch).equals(arr[j])){
                        node += j;    
                    }
                }
            }
            strArr[i] = node;
        }
        
        int cnt = 0;
       
        
        for(int i = 0; i< strArr.length; i++){    
            String value = strArr[i];
            
            if (value.isEmpty()) {
                cnt++;
                continue;
            }
            
            String [] result = value.split("");
            
            
            
            if(!result[0].equals("0")){   
                    continue;
            }
            boolean ok = true;
            for(int j = 0;j< result.length-1; j++){
                if(Integer.parseInt(result[j+1]) - Integer.parseInt(result[j]) != 1){  
                    ok = false;
                    break;   
                }
            }  
            
            if(ok) cnt++;    
            
        }   
        return cnt;
    }
}