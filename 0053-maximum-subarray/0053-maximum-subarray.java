class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for(int i = 1; i <nums.length; i++){
            max = Math.max(max + nums[i], nums[i]);
            sum = Math.max(max, sum);
        }
        return sum;
    }
}