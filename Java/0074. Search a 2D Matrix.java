// 74. Search a 2D Matrix
// Time: O(logmn); Space:O(1)
// view the 2d array as a 1d array
// define n is level order, (mid / n, mid % n)

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid / n][mid % n] < target) {
                left = mid + 1;
            } else {
                right = mid;
            } 
        }
        return matrix[left / n][right % n] == target;
    }
}