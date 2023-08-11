// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
//my solution
class Solution {
    public boolean check(int[] nums) {
        int l = nums.length;
        if (l == 1)
            return true;
        int A[] = new int[l];
        int i = 0;
        while (i < l) {
            for (int x = 0; x < l; x++) {
                A[x] = nums[(i + x) % l];
                if (x == l - 1) {
                    i++;
                    for (int j = 0; j < l - 1; j++) {
                        if (A[j] > A[j + 1])
                            break;
                        if (j == l - 2)
                            return true;
                    }
                }
            }
        }
        return false;
    }
}
// optimized solution:(logic in notebook)
// class Solution {
// public:
// bool check(vector<int>& nums) {
// int n = nums.size();
// int rotations = 0;
// for (int i = 1; i < n; i++) {
// if (nums[i] < nums[i-1]) {
// rotations++;
// if (rotations > 1) {
// return false;
// }
// }
// }
// if (rotations == 1) {
// return nums[n-1] <= nums[0];
// }
// return true;
// }
// };