package DayExercise.day11_20;

import java.util.List;
import java.util.logging.Level;

/**
 * @author ZhengXinchang
 * @create 2021-09-16-8:58
 */
public class Day18 {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<2){
            return n;
        }
        int slow=2;
        for(int fast=2;fast<n;fast++){
            if(nums[fast]!=nums[slow-2]){
                nums[slow]=nums[fast];
                slow++;
            }
        }
        return slow;
    }
    public static void moveZeroes(int[] nums) {
        int n=nums.length;
        int left=0;
        for(int right=0;right<n;right++){
            if(nums[right]!=0){
                nums[left]=nums[right];
                left++;
            }
            for(int i=left+1;i<n;i++){
                nums[i]=0;
            }
        }

    }

    public static void main(String[] args) {
        int[] nums =new int[]  {0,1,0,3,12};
        moveZeroes(nums);
    }
}
