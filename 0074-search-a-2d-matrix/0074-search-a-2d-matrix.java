class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0, mid = 0, end = matrix[0].length * matrix.length - 1;
        
        while(start <= end){
            mid = (start + end) / 2;
            
            if(matrix[mid / matrix[0].length][mid % matrix[0].length] > target)
                end = mid - 1;
            else if(matrix[mid / matrix[0].length][mid % matrix[0].length] < target)
                start = mid + 1;
            else
                return true;
        }
        
        return false;
        
    }
}