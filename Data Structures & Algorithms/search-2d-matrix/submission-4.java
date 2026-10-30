class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int a = 0;
        int b = matrix.length * matrix[0].length;
        while (a < b) {
            int mid = (a+b)/2;
            int x = mid/matrix[0].length;
            int y = mid % matrix[0].length;
            if (target == matrix[x][y]) {
                return true;
            } else if (target < matrix[x][y]) {
                b = mid;
            } else if (target > matrix[x][y]) {
                a = mid+1;
            }

        }
        return false;
    }
}
