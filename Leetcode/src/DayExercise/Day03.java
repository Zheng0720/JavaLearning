package DayExercise;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author ZhengXinchang
 * @create 2021-08-15-10:32
 */
public class Day03 {
    /**
     * public int[] sortedSquares(int[] nums)
     *
     * @param nums
     * @return
     */
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0, j = n - 1, pos = n - 1; i <= j; ) {
            if (nums[i] * nums[i] < nums[j] * nums[j]) {
                ans[pos] = nums[j] * nums[j];
                j--;
            } else {
                ans[pos] = nums[i] * nums[i];
                i++;
            }
            pos--;
        }
        return ans;
    }

    /**
     * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
     *
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);


    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * 最接近的三数之和
     *
     * @param nums
     * @param target
     * @return
     */

    public static int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        Arrays.sort(nums);
        int closeNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int threeSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(threeSum - target) < Math.abs(closeNum - target)) {
                    closeNum = threeSum;
                }
                if (threeSum < target) {
                    left++;
                } else if (threeSum > target) {
                    right--;
                } else {
                    return target;
                }
            }
        }
        return closeNum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,2,1,-4};
        int i = threeSumClosest(nums, 1);
        System.out.println(i);
    }
}
