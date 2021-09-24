package DayExercise.day11_20;

import java.io.FileReader;
import java.util.*;

/**
 * @author ZhengXinchang
 * @create 2021-09-23-20:41
 */
public class Day20 {
    public List<String> letterCombinations(String digits) {
        Map<Character, char[]> map = new HashMap<>();
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
        List<String> ans = new ArrayList<>();
        if (digits == "") {
            return ans;
        }
        backtrack(ans, map, digits, 0, new StringBuffer());
        return ans;

    }

    public void backtrack(List<String> ans, Map<Character, char[]> map, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            ans.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            char[] letters = map.get(digit);
            int letterCount = letters.length;
            for (int i = 0; i < letterCount; i++) {
                combination.append(letters[i]);
                backtrack(ans, map, digits, index + 1, combination);
                combination.deleteCharAt(index);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combinations = new ArrayList<Integer>();
        backtrack1(candidates, target, ans, combinations, 0);
        return ans;
    }

    public void backtrack1(int[] candidates, int target, List<List<Integer>> ans, List<Integer> combinations, int index) {
        if (index == candidates.length) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<Integer>(combinations));
            return;
        }
        backtrack1(candidates, target, ans, combinations, index + 1);
        if (target >= candidates[index]) {
            combinations.add(candidates[index]);
            backtrack1(candidates, target - candidates[index], ans, combinations, index);
            combinations.remove(combinations.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> combine = new ArrayList<Integer>();
        for(int num:nums){
            combine.add(num);
        }
        permuteBacktrack(ans, combine, 0,nums);
        return ans;
    }

    public void permuteBacktrack(List<List<Integer>> ans, List<Integer> combine, int index,int[] nums) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(combine));
            return;
        }else{
            for(int i=index;i<nums.length;i++){
                Collections.swap(combine,index,i);
                permuteBacktrack(ans,combine,index+1,nums);
                Collections.swap(combine,index,i);
            }
        }

    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        Day20 day20 = new Day20();
        List<List<Integer>> permutes = day20.permute(nums);
        for (List<Integer> permute : permutes) {
            System.out.println(permute);
        }
    }
}
