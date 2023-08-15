import java.util.*;

class Solution {
    public int solution(int[] A, int X, int Y) {
        int N = A.length;
        int cpy = X;
        int cost[] = new int[N - (X * Y) - 2];
        for (int i = 0; i < cost.length; i++) {
            cost[i] = 0;
            int j = i;
            while (cpy > 0) {
                cost[i] = cost[i] + A[i + j];
                j = j + Y;
                cpy--;
            }
            cpy = Y;
        }
        Arrays.sort(cost);
        return cost[0];
    }
}

// Sliding Window Microsoft Online Assessment