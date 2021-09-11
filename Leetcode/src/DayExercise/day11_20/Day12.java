package DayExercise.day11_20;

import java.util.ArrayList;
import java.util.List;


/**
 * @author ZhengXinchang
 * @create 2021-09-09-20:05
 */
public class Day12 {
    //68-文本左右对齐
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int right = 0;
        int n = words.length;

        while (true) {
            int left = right;
            int sumLen = 0;

            while (right < n && sumLen + words[right].length() + right - left <= maxWidth) {
                sumLen += words[right++].length();
            }
            if (right == n) {
                StringBuffer sb = join(words, left, n, " ");
                sb.append(blank(maxWidth - sb.length()));
                ans.add(sb.toString());
                return ans;
            }
            int numWords = right - left;
            int numSpace = maxWidth - sumLen;
            if (numWords == 1) {
                StringBuffer sb = new StringBuffer(words[left]);
                sb.append(blank(numSpace));
                ans.add(sb.toString());
                continue;
            }
            int avgSpace = numSpace / (numWords - 1);
            int extraSpace = numSpace % (numWords - 1);
            StringBuffer sb = new StringBuffer();
            sb.append(join(words, left, left + extraSpace + 1, blank(avgSpace + 1)));
            sb.append(blank(avgSpace));
            sb.append(join(words, left + extraSpace + 1, right, blank(avgSpace)));
            ans.add(sb.toString());
        }
    }

    public String blank(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    public StringBuffer join(String[] words, int left, int right, String sep) {
        StringBuffer sb = new StringBuffer(words[left]);
        for (int i = left + 1; i < right; i++) {
            sb.append(sep);
            sb.append(words[i]);
        }
        return sb;
    }

    //和大于等于 target 的最短子数组

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i - left + 1);
                sum -= nums[left++];
            }
        }
        return ans > nums.length ? 0 : ans;
    }

    public static void main(String[] args) {
        int target = 7;
        int[] nums = new int[]{2, 3, 1, 2, 4, 3};
        int i = minSubArrayLen(target, nums);
        System.out.println(i);

    }

}
