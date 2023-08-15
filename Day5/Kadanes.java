//https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&company[]=Microsoft&sortBy=submissions
class Solution {

    // arr: input array
    // n: size of array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n) {
        int cursum = 0, nextsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            cursum = cursum + arr[i];
            if (cursum > nextsum)
                nextsum = cursum;
            if (cursum < 0)
                cursum = 0;
        }
        return nextsum;
    }
}