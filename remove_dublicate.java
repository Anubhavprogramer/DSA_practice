class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        
        if (n == 0) {
            return 0; // If the array is empty, there are no duplicates to remove.
        }
        
        int j = 1; // Initialize the new array length and skip the first element (it's already in the new array).
        
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i]; // Update the current element in the new array.
                j++;
            }
        }
        
        return j; // Length of the new array with duplicates removed.
    }
}