//https://leetcode.com/problems/move-zeroes/description/
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            }
            if (nums[i] != 0 && zeroes > 0) {
                nums[i - zeroes] = nums[i];
                nums[i] = 0;
            }
        }
    }
}