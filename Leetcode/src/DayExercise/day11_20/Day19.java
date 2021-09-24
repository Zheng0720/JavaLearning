package DayExercise.day11_20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-09-22-21:58
 */
public class Day19 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), 0, 0, n);
        return res;
    }

    public void backtrack(List<String> res, StringBuilder curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            res.add(curr.toString());
            return;
        }
        if (open < max) {
            curr.append("(");
            backtrack(res, curr, open + 1, close, max);
            curr.deleteCharAt(curr.length() - 1);
        }
        if (close < open) {
            curr.append(")");
            backtrack(res, curr, open, close + 1, max);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    public static void main(String[] args) {
        Day19 day19 = new Day19();
        List<String> list = day19.generateParenthesis(3);

    }
}
