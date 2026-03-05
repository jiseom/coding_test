class Solution {
    static boolean[] visited;
    static int[][] computers;
    static int n;
    
    public int solution(int number, int[][] computersInput) {
        n = number;
        int answer = 0;
        computers = computersInput;
        visited =  new boolean[number];
        for(int i=0; i<n; i++){
            if(visited[i] == false){
                dfs(i);
                answer++;
            
            }
        }
        
        return answer;
    }
    

    static void dfs(int node){
        visited[node] = true;
        for(int i = 0; i< n; i++){
            if(computers[node][i] == 1 && visited[i] == false){
                dfs(i);
            }
        }
        
    }
}