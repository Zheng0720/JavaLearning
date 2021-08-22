package CH01;

import java.util.ArrayList;

/**
 * @author ZhengXinchang
 * @create 2021-08-12-10:25
 * 最大子列和问题
 */
public class MaxListSum {
    public static int MaxListSum1(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }
        int thisSum;
        int maxSum = num[0];
        for (int i = 0; i < num.length; i++) { //i是子列左端位置
            for (int j = i; j < num.length; j++) {  //j是子列右端位置
                thisSum = 0;
                for (int k = i; k <= j; k++) {
                    thisSum += num[k];
                    if (thisSum > maxSum) {
                        maxSum = thisSum;
                    }
                }
            }
        }
        return maxSum;
    }

    public static int MaxListSum2(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }
        int thisSum;
        int maxSum = num[0];
        for (int i = 0; i < num.length; i++) { //i是子列左端位置
            thisSum = 0;
            for (int j = i; j < num.length; j++) {  //j是子列右端位置
                thisSum += num[j];
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    //分而治之算法
    public static int MaxListSum3(int[] num) {
        if (num == null || num.length == 0) {
            return 0;
        }
        return DivideAndConquer(num,0,num.length-1);

    }

    private static int DivideAndConquer(int[] list, int left, int right) {
        int MaxLeftSum;//左边子列的最大和
        int MaxRightSum;//右边子列的最大和
        //递归的终止条件
        if(left==right){
            return list[left];
        }
        int mid = (right + left) / 2; //中点
        MaxLeftSum = DivideAndConquer(list, left, mid);
        MaxRightSum = DivideAndConquer(list, mid + 1, right);
        //求跨边界的最大子列和
        //中点向左扫描
        int MaxLeftBorderSum = list[mid];
        int LeftBorderSum = 0;
        for (int i = mid; i >= left; i--) {
            LeftBorderSum += list[i];
            if (LeftBorderSum > MaxLeftBorderSum) {
                MaxLeftBorderSum = LeftBorderSum;
            }
        }
        //中点向右扫描
        int MaxRightBorderSum = list[mid+1];
        int RightBorderSum = 0;
        for (int i = mid + 1; i <= right; i++) {
            RightBorderSum += list[i];
            if (RightBorderSum > MaxRightBorderSum) {
                MaxRightBorderSum = RightBorderSum;
            }
        }
        return MaxLeftSum > MaxRightSum ? MaxLeftSum > (MaxRightBorderSum + MaxLeftBorderSum) ? MaxLeftSum : (MaxRightBorderSum + MaxLeftBorderSum) : MaxRightSum > (MaxRightBorderSum + MaxLeftBorderSum) ? MaxRightSum : (MaxRightBorderSum + MaxLeftBorderSum);

    }
    //在线处理
    public static int MaxListSum4(int[] num){
        if (num == null || num.length == 0) {
            return 0;
        }
        int thisSum=0;
        int maxSum=num[0];
        for (int i = 0; i < num.length; i++) {
            thisSum+=num[i];
            if(thisSum>maxSum){
                maxSum=thisSum;//发现更大子列和则抛弃结果
            }
            if(thisSum<0){ //如果当前子列和为负
                thisSum=0;// 不可能使后面的部分和增大，抛弃之
            }
        }
        return maxSum;

    }

    public static void main(String[] args) {
        int[] nums=new int[]{-3,-2,-1,-2};
        System.out.println(MaxListSum4(nums));
    }

}
