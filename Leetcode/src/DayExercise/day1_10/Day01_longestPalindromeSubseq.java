package DayExercise.day1_10;

/**
 * @author ZhengXinchang
 * @create 2021-08-12-8:25
 * 题目：给你一个字符串 s ，找出其中最长的回文子序列，并返回该序列的长度。
 *子序列定义为：不改变剩余字符顺序的情况下，删除某些字符或者不删除任何字符形成的一个序列。
 *
 * 方法：动态规划
 */
public class Day01_longestPalindromeSubseq {
    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i][i] = 1;
            char c1 = s.charAt(i);
            for (int j = i + 1;j<n;j++){
                char c2=s.charAt(j);
                //如果 s[i]=s[j]s[i] = s[j]s[i]=s[j]，
                // 则首先得到s的下标范围 [i+1,j−1]内的最长回文子序列，
                // 然后在该子序列的首尾分别添加 s[i]和 s[j]，即可得到 s 的下标范围 [i,j]内的最长回文子序列
                // 因此 dp[i][j]=dp[i+1][j−1]+2;
                if(c1==c2){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    //如果s[i]!=s[j],则 s[i]和 s[j]不可能同时作为同一个回文子序列的首尾，
                    // 因此 dp[i][j]=max(dp[i+1][j],dp[i][j−1]);
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }

    public static void main(String[] args) {
        String s="bbbab";
        System.out.println(longestPalindromeSubseq(s));
    }
}
