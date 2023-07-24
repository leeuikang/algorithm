class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");

        if(s.length() == 0)
            return true;   
        
        int start = 0;
        int end = s.length() - 1;    
       
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(start + i) != s.charAt(end - i))
                return false;
        }
        
        return true;
    }
}