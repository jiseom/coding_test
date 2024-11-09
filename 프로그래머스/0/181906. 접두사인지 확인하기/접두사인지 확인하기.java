class Solution {
    public int solution(String my_string, String is_prefix) {
        char[] charArray = is_prefix.toCharArray();
        if(my_string.length() < is_prefix.length() ){
            return 0;
        }

        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] != my_string.charAt(i)){
                return 0;
            }
        }

        return 1;

    }
}
