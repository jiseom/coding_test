class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (char c : myString.toCharArray()){
            if(c >= 97){ // 소문자일때
                if('a' == c ){
                    sb.append((char)(c - 32));
                }else{
                    sb.append(c);
                }
            }else { // 대문자 또는 공백일 때 
                if(c == 32) {
                    sb.append(" ");
                }else if ('A' == c){
                    sb.append(c);
                }else {
                    sb.append((char) (c + 32));    
                }
            }
        }
     return sb.toString();   
    }
}