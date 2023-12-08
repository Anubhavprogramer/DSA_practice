public class search {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid; // Target found at index mid.
            } else if (nums[mid] < target) {
                left = mid + 1; // Adjust the left boundary.
            } else {
                right = mid - 1; // Adjust the right boundary.
            }
        }

        // If the loop terminates, 'left' represents the index where 'target' should be inserted.
        return left;
    }
}
