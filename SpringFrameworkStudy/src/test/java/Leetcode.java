import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author ZhengXinchang
 * @create 2021-10-02-14:27
 */
public class Leetcode {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0){
            return intervals;
        }
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(a->a[0]));
        int[] curr=new int[2];
        curr[0]=intervals[0][0];
        curr[1]=intervals[0][1];
        for (int i = 1; i <intervals.length; i++) {
            if(intervals[i][0]>curr[1]){
                ans.add(curr);
                curr=new int[2];
                curr[0]=intervals[i][0];
                curr[1]=intervals[i][1];
            }else if(intervals[i][0]<=curr[1]&&intervals[i][1]>curr[1]){
                curr[1]=intervals[i][1];
            }
        }
        if(curr[1]<intervals[intervals.length-1][1]){
            curr[1]=intervals[intervals.length-1][1];
        }
        ans.add(curr);
        int[][] res=new int[ans.size()][2];
        for(int j=0;j<ans.size();j++){
            res[j][0]=ans.get(j)[0];
            res[j][1]=ans.get(j)[1];
        }
        return res;
    }

    public static void main(String[] args) {
        Leetcode leetcode = new Leetcode();
        int[][] intervals = new int[][]{{4,5},{1,4},{0,1}};
        int[][] merge = leetcode.merge(intervals);
        for(int i=0;i<merge.length;i++){
            System.out.print(merge[i][0]+" ");
            System.out.print(merge[i][1]);
            System.out.println();
        }
    }
}
