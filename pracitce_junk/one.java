public class one {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        int m = A.length;
        int n = A[0].length;

        int[] result = new int[m * n];
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        int direction = 0; // 0: right, 1: down, 2: left, 3: up
        int index = 0;

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    result[index++] = A[top][i];
                }
                top++;
            } else if (direction == 1) {
                for (int i = top; i <= bottom; i++) {
                    result[index++] = A[i][right];
                }
                right--;
            } else if (direction == 2) {
                for (int i = right; i >= left; i--) {
                    result[index++] = A[bottom][i];
                }
                bottom--;
            } else if (direction == 3) {
                for (int i = bottom; i >= top; i--) {
                    result[index++] = A[i][left];
                }
                left++;
            }

            direction = (direction + 1) % 4;
        }

        return result;
    }
}
