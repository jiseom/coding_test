import java.util.*; // util Arrays..

class Solution {
    public String[] solution(String my_string) {
        String[] str = my_string.split(" ");        
        List<String> list = new ArrayList(Arrays.asList(str));
        
        for(int i = list.size() - 1; i >= 0; i--){
            if("".equals(list.get(i))){ 
                list.remove(list.get(i));  
            }
        }  
        return list.toArray(new String[list.size()]); 
    }
}