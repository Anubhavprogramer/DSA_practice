//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
           int left = 0;        // Initialize the left pointer
        int right = 0;       // Initialize the right pointer
        int currentSum = 0;  // Initialize the current sum
        ArrayList<Integer> result = new ArrayList<>();

        while (right < n) {
            // Add the current element to the current sum
            currentSum += arr[right];

            // Check if the current sum is greater than or equal to 's'
            while (currentSum >= s) {
                // If it is, check if the subarray from 'left' to 'right' adds up to 's'
                if (currentSum == s) {
                    // If yes, add the indices to the result
                    result.add(left + 1);  // Adding 1 because the problem uses 1-based indexing
                    result.add(right + 1); // Adding 1 because the problem uses 1-based indexing
                    return result;
                }

                // If the current sum is still greater than 's', move the left pointer
                currentSum -= arr[left];
                left++;
            }

            // Move the right pointer to explore the next element
            right++;
        }

        // If no subarray is found, return -1
        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }
}