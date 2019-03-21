import java.util.Map;

/**
 * 使用动态规划解决，O(n^2)耗时长
 */
public class PerfectSquares {
    public int numSquares(int n) {
        int[] memo = new int[n+1];
        initialMemo(memo);
        memo[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (isPerfectSquares(i)) {
                memo[i] = 1;
                continue;
            }
            for (int j = 1; j <= i-1; j++) {
                memo[i] = Math.min(memo[i], memo[j]+memo[i-j]);
            }
        }

        return memo[n];
    }

    private void initialMemo(int[] memo) {
        for (int i = 0; i < memo.length; i++){
            memo[i] = Integer.MAX_VALUE/2;
        }
    }

    private boolean isPerfectSquares(int n) {
        return isInteger(Math.sqrt(n));
    }

    private boolean isInteger(double num) {
        return num%1 == 0;
    }

    public static void main(String[] args) {
        PerfectSquares ps = new PerfectSquares();
        for(int i = 1; i <= 20; i++)
            System.out.println(ps.numSquares(i));
    }

}
