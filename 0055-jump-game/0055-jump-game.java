class Solution {
    public boolean canJump(int[] nums) {
        int isExit = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(i > isExit) return false;
            isExit = Math.max(isExit, i + nums[i]);
        }
        return true;
    }
}