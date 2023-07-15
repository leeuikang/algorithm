class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = 0;
        int start = 0;
        int end = 0;

        while(end < s.length()){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }else{
                set.add(s.charAt(end));
                end++;
                max = Math.max(max, set.size());
            }
        }

        return max;
    }
}