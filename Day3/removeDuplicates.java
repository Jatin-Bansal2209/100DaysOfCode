
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
import java.util.*;

class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int cpy[] = new int[l];
        Arrays.fill(cpy, 101);
        int k = 0;
        cpy[0] = nums[0];
        for (int i = 1; i < l; i++) {
            if (nums[i] == cpy[k]) {
                continue;
            } else {
                cpy[++k] = nums[i];
            }
        }
        for (int i = 0; i < k + 1; i++) {
            nums[i] = cpy[i];
        }
        return k + 1;
    }
}