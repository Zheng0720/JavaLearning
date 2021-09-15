package DayExercise.day11_20;

import java.util.*;

/**
 * @author ZhengXinchang
 * @create 2021-09-14-9:14
 */
public class Day17 {
    //524. 通过删除字母匹配到字典里最长单词
    public static String findLongestWord(String s, List<String> dictionary) {
        String ans = "";
        for (String t : dictionary) {
            int i = 0, j = 0;
            while (i < t.length() && j < s.length()) {
                if (t.charAt(i) == s.charAt(j)) {
                    i++;
                }
                j++;
            }
            if (i == t.length()) {
                if (t.length() > ans.length() || (t.length() == ans.length() && t.compareTo(ans) < 0)) {
                    ans = t;
                }
            }
        }
        return ans;
    }
    public static String longestWord(String[] words){
        Arrays.sort(words);
        String ans="";
        Set<String> set= new HashSet<>();
        for(String t:words){
            if(t.length()==1||set.contains(t.substring(0,t.length()-1))){
                ans=t.length()>ans.length()?t:ans;
                set.add(t);
            }
        }
        return ans;
    }
    public static void merge(int[] A, int m, int[] B, int n) {
        int[] res=new int[m+n];
        int i=0;
        int j=0;
        int index=0;
        while(i<m&&j<n){
            if(A[i]<B[j]){
                res[index++]=A[i];
                i++;
            }
            else if(A[i]>B[j]){
                res[index++]=B[j];
                j++;
            }else{
                res[index++]=A[i];
                res[index++]=B[j];
                i++;
                j++;
            }
        }
        for(i=0;i<m+n;i++){
            A[i]=res[i];
        }
    }

    public static void main(String[] args) {
        int[] A =new int[] {1,2,3,0,0,0};
        int m = 3;
        int[] B = new int[]{2,5,6};
        int n = 3;
        merge(A,m,B,n);
    }
}
