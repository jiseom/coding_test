class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char a = alp.charAt(0) ;

        for (char c : my_string.toCharArray()){
            if(a == c){
                int b = (int) a - 32 ;
                answer += (char)(b);

            }else{
                answer += c;
            }
        }

        return answer;
    }
}