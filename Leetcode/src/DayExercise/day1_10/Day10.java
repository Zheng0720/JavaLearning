package DayExercise.day1_10;

/**
 * @author ZhengXinchang
 * @create 2021-09-07-8:38
 */
public class Day10 {
    //在一个 平衡字符串 中，'L' 和 'R' 字符的数量是相同的。
    //给你一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。
    public static int balancedStringSplit(String s) {
        int ans = 0;
        int d = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'L') {
                d++;
            } else {
                d--;
            }
            if (d == 0) {
                ans++;
            }
        }
        return ans;
    }

    //给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于n/2的元素。
    //你可以假设数组是非空的，并且给定的数组总是存在多数元素。
    public static int majorityElement(int[] nums) {
        int major = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (major == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    major = nums[i + 1];
                }
            }
        }
        return major;
    }


    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }
}
