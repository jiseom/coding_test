class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        if(num_list.length >= 11){  
            for(int num : num_list){
                sum += num;
            }
        }else{
            sum = 1;
            for(int num : num_list){
            sum *= num ;        
            }
        }
        return sum;
    }
}