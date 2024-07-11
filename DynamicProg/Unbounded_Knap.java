import java.util.*;

class Unbounded_Knap{
    public static int knapS2(int wt[], int val[], int W, int n) {
        int t[][] = new int[n + 1][W + 1];

        // Initialize the table with base conditions
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        // Fill the table iteratively
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][W];
    }

    public static void main(String args[]) {
        int profit[] = new int[] { 1,30 };
        int weight[] = new int[] { 1,50};
        int W = 100;
        int n = profit.length;
        System.out.println(knapS2(weight, profit, W, n));
    }
}
