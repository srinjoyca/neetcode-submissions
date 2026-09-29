class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0; 
        int w = matrix[0].length;
        int l = matrix.length;
        int right = w*l-1;
        
        while (left <= right) { 
            int middle = left+(right-left)/2;
            int numAtMiddle = matrix[middle/w][middle%w];
            System.out.println("row is " + middle/l);
            int p = middle%w-1;
            System.out.println("col is " + p);
            if (numAtMiddle == target) {
                return true;
            }
            if (numAtMiddle > target) {
                right = middle-1;
            } else {
                left = middle+1;
            }
        }
        return false;
    }

 

 
}
