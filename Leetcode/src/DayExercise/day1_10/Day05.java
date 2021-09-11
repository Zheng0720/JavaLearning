package DayExercise.day1_10;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author ZhengXinchang
 * @create 2021-08-17-8:29
 */
public class Day05 {
    /**
     * 给学生出勤记录 I
     * @param s
     * @return
     */
    public static boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                late = 0;
                absent++;
                if (absent > 1) {
                    return false;
                }
            } else if (s.charAt(i) == 'L') {
                late++;
                if (late >= 3) {
                    return false;
                }
            } else {
                late = 0;
            }
        }
        return true;
    }

    /**
     * 反转字符串中的单词 III
     * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int i = 0;
        int start;
        while (i < n) {
            start=i;
            while (i<n&&chars[i] != ' ') {
                i++;
            }
            int left=start;
            int right = i - 1;
            while (left < right){
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            while(i<n&&chars[i]==' '){
                i++;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }
}
