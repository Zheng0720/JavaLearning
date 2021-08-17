package DayExercise;

/**
 * @author ZhengXinchang
 * @create 2021-08-16-9:38
 */
public class Day04 {
    /**
     * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     *
     * @param nums
     */
    public static void moveZeroes(int[] nums) {
        if (nums.length == 0) {
            return;
        }
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }
    }

    /**
     * 给定一个已按照 升序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        if(numbers.length==2){
            ans[0]=0;
            ans[1]=1;
            return ans;
        }
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            if(numbers[left]+numbers[right]>target){
                right--;
            }
            else if(numbers[left]+numbers[right]<target){
                left++;
            }
            else {
                break;
            }
        }
        ans[0]=left+1;
        ans[1]=right+1;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,7,11,15};
        int[] sum = twoSum(nums, 9);
        for(int i:sum){
            System.out.println(i);
        }
    }
}
