//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class missing_number {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] array = new int[n - 1];
            for (int i = 0; i < n - 1; i++) {
                array[i] = Integer.parseInt(str[i]);
            }
            Solution sln = new Solution();
            System.out.println(sln.missingNumber(array, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
       int num=array.length;
        for(int i =0 ;i<num-1; i++)
        {
            for(int j=0; j<num-i-1; j++)
            {
                if (array[j]> array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        
        int flag=-1;
        for( int i=0; i<num; i++)
        {
            if(array[i]!=i+1)
           {
            flag = i+1;
           }
        }
        return flag;
    }
}