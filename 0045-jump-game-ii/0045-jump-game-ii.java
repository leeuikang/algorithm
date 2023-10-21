class Solution {
    public int jump(int[] nums) {
        int count = 0;
        int index = 0;
        int jump = 0;
        
        for(int i = 0; i < nums.length - 1; i++){
            index = Math.max(index, nums[i] + i);
            if(i == jump){
                count++;
                jump = index;
            }
        }
        return count;
    }
}