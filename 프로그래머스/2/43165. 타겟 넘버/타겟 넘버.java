class Solution {
    public int solution(int[] numbers, int target) {
        int idx = 0; 
        int sum = 0;
        return dfs(idx,sum,numbers,target);
 
    }
    
    static int dfs(int idx, int sum, int[] numbers, int target){
        if(idx == numbers.length){
            return (sum == target) ? 1:0;
        }
        
        int plus = dfs(idx+1,sum + numbers[idx], numbers,target);
        int minus = dfs(idx+1,sum - numbers[idx] ,numbers,target);
        return plus + minus;
    }
}