class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while(start <= end){
            int indexSum = numbers[start] + numbers[end];
            if(indexSum == target){
                break;
            }else if(indexSum > target){
                end--;
            }else{
                start++;
            }
        }

        return new int[]{start + 1, end + 1};
    }
}