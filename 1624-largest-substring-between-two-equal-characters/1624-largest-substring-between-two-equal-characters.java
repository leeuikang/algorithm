class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int answer = -1;
        
        for(int i = 0; i < s.length(); i++){
            int lastIndex = s.lastIndexOf(s.charAt(i));
            
            if(lastIndex != i){
                answer = Math.max(answer, lastIndex - i - 1);
            }
        }
        return answer;
    }
}