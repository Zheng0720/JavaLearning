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
        while (left < nums.length && right < nums.length) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
            right++;
        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,1};
        moveZeroes(nums);
        for(int i:nums){
            System.out.println(i);
        }
    }
}
