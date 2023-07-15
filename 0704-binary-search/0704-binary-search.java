class Solution {
    public int search(int[] nums, int target) {
        
        int start = 0, mid = 0, end = nums.length-1;
        
        while(start <= end){
            mid = (start + end) / 2;
            
            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid] > target)
                end = mid - 1;
            else
                return mid;
        }
    
        if(nums[mid] != target)
            return -1;
        return mid;
    }
}