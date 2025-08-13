import java.util.*;
class Solution {
    public int solution(String dirs) {
        char[] c = dirs.toCharArray();
        int[][] arr = new int[c.length+1][2];
        arr[0][0] = 0; arr[0][1] = 0;
        
        
        for(int i = 0; i < c.length; i++){
            int x = arr[i][0]; int y = arr[i][1];
            int nx = x, ny =y;
            
            if('L' == c[i]) nx--;
            else if('R' == c[i]) nx++;
            else if('U' == c[i]) ny++;
            else if('D' == c[i]) ny--;
            
            if(nx< -5 || nx > 5 || ny < -5 || ny > 5) {
                arr[i+1][0] = x;
                arr[i+1][1] = y;
            }else{
                arr[i+1][0] = nx;
                arr[i+1][1] = ny;
            }
        }
        
        Set<String> edges = new HashSet<>();
        for(int i = 0; i< c.length; i++){
            int x1= arr[i][0], y1= arr[i][1];
            int x2= arr[i+1][0], y2= arr[i+1][1];
            
            if(x1 == x2 && y1 == y2) continue;
            
            String key;
            if(x1 < x2 || (x1 == x2 && y1 < y2)){
                key = x1 + "," + y1 + ":" + x2 + "," + y2; 
            }else{
                key = x2 + "," + y2 + ":" + x1 + "," + y1; 
            }
            edges.add(key);
        }
        
        
        return edges.size();
       //System.out.println("(" + arr[i][0] + "," + arr[i][1] + ")");
            //(0,1)(-1,1)(-1,2)(1,0)(1,0)(0,-1)(-1,0)(-1,0)(0,1)
            //(0,1)(-1,0)(0,1)(1,0)(1,0)(0,-1)(-1,0)(-1,0)(0,1)
       
        
    }
}