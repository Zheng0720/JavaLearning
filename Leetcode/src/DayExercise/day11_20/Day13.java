package DayExercise.day11_20;

/**
 * @author ZhengXinchang
 * @create 2021-09-10-8:52
 */
public class Day13 {
    //1894. 找到需要补充粉笔的学生编号
    public static int chalkReplacer(int[] chalk, int k){
        int ans=0;
        int sum=0;
        for(int i=0;i<chalk.length;i++){
            sum+=chalk[i];
        }
        int surplusChalk=k%sum;
        while(surplusChalk>chalk[ans]){
            surplusChalk-=chalk[ans];
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] chalk = new int[]{5,1,5};
        int k = 22;
        int i = chalkReplacer(chalk, k);
        System.out.println(i);
    }
}
