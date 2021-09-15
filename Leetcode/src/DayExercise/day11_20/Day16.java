package DayExercise.day11_20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhengXinchang
 * @create 2021-09-13-9:00
 */
public class Day16 {
    //回旋镖
    public static int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for (int[] p : points) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int[] q : points) {
                int distance = (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
                map.put(distance, map.getOrDefault(distance, 0) + 1);
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                int m = entry.getValue();
                ans += m * (m - 1);
            }
        }
        return ans;
    }

    //斐波那契数列
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int c = b;
            b = (a + b) % 1000000007;
            a = c;
        }
        return b;
    }

    public static int[] printNumbers(int n) {
        int m = (int) (Math.pow(10, n) - 1);
        int[] ans = new int[m];
        for (int i = 1; i <= m; i++) {
            ans[i - 1] = i;
        }
        return ans;
    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int i = 0;
        while (i < k) {
            if (nums[i] < 0) {
                nums[i] = -nums[i];
            } else {
                break;
            }
            i++;
        }
        if (i < k) {
            for (int j = i; j < k; j++) {
                nums[i] = -nums[i];
            }
        }
        for (int num : nums) {
            ans += num;
        }
        return ans;
    }



    public static void main(String[] args) {
        int[] nums = new int[]{2, -3, -1, 5, -4};
        int k = 2;
        int i = largestSumAfterKNegations(nums, k);
        System.out.println(i);
    }

}
