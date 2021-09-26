/**
 * @author ZhengXinchang
 * @create 2021-09-26-9:12
 */
public class leetcode {
    public int reverse(int x) {
        long ans = 0;
        while (x != 0) {
            int t = x % 10;
            ans = ans * 10 + t;
            x = x / 10;
        }
        if (Math.abs(ans) > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) ans;
    }

    public int myAtoi(String s) {
        long ans = 0;
        int i = 0;
        boolean posAndNeg = true;//判断正负号
        boolean flagPlus = false;
        int flag = 0;


        while (i < s.length()) {
            if (flag >= 2) {
                return 0;
            }
            if (flag == 0 && flagPlus == false && s.charAt(i) == ' ') {
                i++;
            } else if (flagPlus == false && s.charAt(i) == '-') {
                posAndNeg = false;
                flag++;
                i++;
            } else if (flagPlus == false && s.charAt(i) == '+') {
                posAndNeg = true;
                flag++;
                i++;
            } else if (s.charAt(i) <= '9' && s.charAt(i) >= '0' && ans < Integer.MAX_VALUE) {
                ans = ans * 10 + (s.charAt(i) - '0');
                flagPlus = true;
                i++;
            } else {
                break;
            }
        }

        if (posAndNeg == false) {
            ans = -1 * ans;
        }

        return (int) ans;
    }

    public String longestCommonPrefix(String[] strs) {
        String ans = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while (j < strs[i].length() && j < ans.length() && ans.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            ans = ans.substring(0, j);
        }
        return ans;

    }

    public static void main(String[] args) {
        leetcode leetcode = new leetcode();
        String[] strs=new String[]{"dog","racecar","car"};
        String s = leetcode.longestCommonPrefix(strs);
        System.out.println(s);

    }

}
