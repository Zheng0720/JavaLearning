import java.util.*;

/**
 * @author ZhengXinchang
 * @create 2021-10-02-14:27
 */
public class Leetcode {

    int[] dxArray = new int[]{-1, 1, 0, 0};
    int[] dyArray = new int[]{0, 0, -1, 1};

    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        if (m * n < word.length()) {
            return false;
        }
        boolean[][] visited=new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, 0, i, j,visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int index, int i, int j,boolean[][] visited) {
        System.out.println(i + "," + j);
        if (index == word.length()) {
            return true;
        }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length||visited[i][j]) {
            return false;
        }
        if (board[i][j] != word.charAt(index)) {
            return false;
        }
        visited[i][j]=true;
        for (int k = 0; k < 4; k++) {
            int dx = i + dxArray[k];
            int dy = j + dyArray[k];
            if (dfs(board, word, index + 1, dx, dy,visited)) {
                return true;
            }
        }
        visited[i][j]=false;
        return false;
    }


    public static void main(String[] args) {
        Leetcode leetcode = new Leetcode();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCB";
//        char[][] board = {{'a'}};
//        String word = "a";
        boolean exist = leetcode.exist(board, word);
        System.out.println(exist);
    }
}
