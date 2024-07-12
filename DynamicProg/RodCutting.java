import java.util.*;

class RodCutting{
    public static int knapS2(int length[], int price[], int N, int n) {
        int t[][] = new int[n + 1][N + 1];

        // Initialize the table with base conditions
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= N; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        // Fill the table iteratively
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= N; j++) {
                if (length[i - 1] <= j) {
                    t[i][j] = Math.max(price[i - 1] + t[i][j - length[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][N];
    }

    public static void main(String args[]) {
        int price[] = new int[] { 1,5,8,9,10,17,17, 20};
        int length[] = new int[] { 1,2,3,4,5,6,7,8};
        int N = 8;
        int n = price.length;
        System.out.println(knapS2(length, price, N, n));
    }
}
