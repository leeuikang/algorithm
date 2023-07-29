class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1, mid = 0, min = 5001, minIndex = -1;
        
        while(start <= end){
            mid = (start + end) / 2;
            
            if(mid > 0 && nums[mid] < nums[mid-1])
                return nums[mid];
            
            if(nums[start] <= nums[mid] && nums[mid] > nums[end])
                start = mid  + 1;
            else
                end = mid - 1;
        }
        
        return nums[mid];
    }
}