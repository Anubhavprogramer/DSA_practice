class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // Initialize with 1 to add 1 to the last digit.
        
        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10; // Update the current digit.
            carry = sum / 10;    // Set the carry for the next iteration.
        }
        
        if (carry == 1) {
            // If there's still a carry after the loop, it means we need to add a new digit at the beginning.
            int[] newarr = new int[n + 1];
            newarr[0] = 1;
            for (int i = 0; i < n; i++) {
                newarr[i + 1] = digits[i];
            }
            return newarr;
        } else {
            return digits;
        }
    }
}