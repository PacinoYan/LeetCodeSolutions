public class SearchMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m > 0) {
            int n = matrix[0].length;
            if (n > 0) {
                int i = m - 1, j = 0;
                while (i >= 0 && j <= n - 1) {
                    if (matrix[i][j] == target) {
                        return true;
                    } else if (matrix[i][j] < target) {
                        j++;
                    } else if (matrix[i][j] > target) {
                        i--;
                    }
                }
                return false;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }
}
