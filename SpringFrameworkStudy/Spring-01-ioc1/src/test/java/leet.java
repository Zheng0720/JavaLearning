/**
 * @author ZhengXinchang
 * @create 2021-09-26-18:08
 */
public class leet {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        StringBuffer sb = new StringBuffer();
        int i = 0;
        int count = 1;
        while (i < s.length()) {
            if (i != s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(count);
                sb.append(s.charAt(i));
                count = 1;
            }
            i++;
        }
        return sb.toString();
    }

    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            while(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(!(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right)))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="race a car";
        leet leet = new leet();
        boolean palindrome = leet.isPalindrome(s);
        System.out.println(palindrome);
    }
}
