import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
         
        int aCnt = 0;
        int bCnt = 0;
        int cCnt = 0;
        
        int[] score = new int [3];
        
        for (int i = 0; i< answers.length; i++){
            if(answers[i]==(a[i % a.length])){
                score[0]++;
            }    
            if(answers[i] == (b[i% b.length])){
                score[1]++;
            }
            if(answers[i] == (c[i % c.length])){
                score[2]++;
            } 
        }
        
        //제일 큰 수를 찾는다. 
        //점수가 동일할경우 오름차순 
        int max = Math.max(score[0],Math.max(score[1],score[2]));
        
        int count = 0;
        for(int i =0 ;i< score.length; i++){
            if(score[i] == max){
                count++;
            }
        }
        
        int[] answer = new int[count];
        
        int idx = 0 ;
        for (int i =0; i< score.length; i++){
            if(score[i] == max ){
                answer[idx++] = i+1;
            }
        }
        
        
        
        return answer;
    }
}