//https://leetcode.com/problems/missing-number/description/
public class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        for( int i=0;i<nums.length;i++)
            sum=sum+nums[i];
        //return ((nums.length+1)*(nums.length))/2-sum;
        return ((n+1)*n)/2-sum;
    }
}{

}
