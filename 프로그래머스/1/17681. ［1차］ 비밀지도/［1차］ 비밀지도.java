import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String [] strArr1 = new String[n];
        String [] strArr2 = new String[n];
        
        int temp = 0;
        int binary = 0;
       
        for(int i= 0; i<n; i++){
            temp = arr1[i];
            String s = "";
            
            while (temp > 0){
                binary = temp % 2;
                temp /= 2;
                s = binary + s;
            }
            
           while (s.length() < n) s = "0" + s;
            
            strArr1[i] = s;
        }
         
        for(int i= 0; i<n; i++){
            temp = arr2[i];
            String s = "";
            
            while (temp > 0){
                binary = temp % 2;
                temp /= 2;
                s = binary + s;
            }
            
            // if(s.length() < n){
            //     s = "0"+ s;
            // }
            while (s.length() < n) s = "0" + s;
            strArr2[i] = s;
        }
        
        //System.out.println(Arrays.toString(strArr1));
        //System.out.println(Arrays.toString(strArr2));
        
        for(int i= 0; i < n; i++){
            char[] a = strArr1[i].toCharArray();
            char[] b = strArr2[i].toCharArray();
            for (int j =0; j<n; j++){    
                
                if(a[j] == '0' && b[j] == '1'){
                    a[j] = '1';
                }
            }
            strArr1[i] = new String(a);
            
        }
        
    
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = strArr1[i].replace('1', '#').replace('0', ' ');
        }
        return answer;

    }
}