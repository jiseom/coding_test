class Solution {
    public int[] solution(int[] arr) { 
        int arrSize = 0;
        
        for(int num : arr){
            arrSize += num;
        }
        
        int[] X = new int[arrSize];
        int idx = 0;
        for (int i = 0; i < arr.length; i++){  
            for (int j = 0; j < arr[i]; j++){
                X[idx++] = arr[i];
            }
        }   
        return X ;
    }
}