//https://leetcode.com/problems/search-a-2d-matrix/description/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rlow = 0, clow = 0;
        int rhigh = matrix.length - 1;
        int chigh = matrix[0].length - 1;
        int midRow = (rhigh + rlow) / 2;
        int midCol = (clow + chigh) / 2;
        while (rhigh >= rlow) {
            midRow = (rhigh + rlow) / 2;
            if (matrix[midRow][chigh] >= target && matrix[midRow][0] <= target)
                break;
            else if (matrix[midRow][0] > target)
                rhigh = midRow - 1;
            else
                rlow = midRow + 1;
        }
        while (chigh >= clow) {
            midCol = (clow + chigh) / 2;
            if (matrix[midRow][midCol] == target)
                return true;
            else if (matrix[midRow][midCol] > target)
                chigh = midCol - 1;
            else
                clow = midCol + 1;
        }
        return false;

    }
}