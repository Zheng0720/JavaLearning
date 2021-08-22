package CH01;

/**
 * @author ZhengXinchang
 * @create 2021-08-12-9:34
 * 写程序实现一个函数PrintN，使得传入一个正整数为N的参数后，能顺序打印从1到N的全部正整数
 */
public class PrintN {
    //for循环方法
    public static void print1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    //递归方法
    public static void print2(int n){
        if(n!=0){
            print2(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        print1(100);
        print2(100);
    }
}

