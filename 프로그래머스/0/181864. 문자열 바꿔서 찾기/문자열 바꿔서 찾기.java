class Solution {
    public int solution(String myString, String pat) {
        String newStr = "";
         
        for (char c : myString.toCharArray()){
            if('A' == c ) {
                newStr += "B";
            }else {
                newStr += "A";  
            }
        }
        
        if(newStr.contains(pat)){
            return 1;
        }else{
            return 0;
        }
    }
}