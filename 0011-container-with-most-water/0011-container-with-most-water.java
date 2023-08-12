class Solution {
    public int maxArea(int[] height) {
        
        int start = 0;
        int end = height.length - 1;
        int max = -1;

        while(start < end){
            int cal = end - start;
            if(height[start] < height[end]){
                max = Math.max(max, cal * height[start]);
                start++;   
            }else{
                max = Math.max(max, cal * height[end]);
                end--;
            }
        }

        return max;
    }
}