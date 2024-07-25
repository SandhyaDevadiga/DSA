import java.util.*;

class MinCoins{
    public static int ways(int coin[], int sum, int n) {
        int t[][] = new int[n + 1][sum + 1];

        // Initialize the table with base conditions
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if(i==0){
                    t[i][j]=Integer.MAX_VALUE-1;
                }
                 if(j==0){
                    t[i][j]=0;
                }
            }
        }

        // Fill the table iteratively
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (coin[i - 1] <= j) {
                    t[i][j] = Math.min( t[i][j - coin[i - 1]]+1, t[i - 1][j]);
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }

    public static void main(String args[]) {
        int coin[] = new int[] { 1,2,3 };
        int sum = 9;
        int n = coin.length;
        System.out.println(ways(coin, sum, n));
    }
}


// output for this example is 3 because (3+3+3)=9, 3 coins
