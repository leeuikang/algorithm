class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1, end = Arrays.stream(piles).max().getAsInt(), mid = 0;
        
        while(start < end){
            mid = (start + end) / 2;
            int total = 0;
        
            for(int pile : piles){
                total += Math.ceil((double)pile / mid);
            }
            
            if(total > h)
                start = mid + 1;
            else
                end = mid;
        }
        return end;
        
    } 
}