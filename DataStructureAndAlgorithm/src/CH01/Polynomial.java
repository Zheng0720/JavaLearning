package CH01;

import java.awt.desktop.SystemEventListener;

/**
 * @author ZhengXinchang
 * @create 2021-08-12-9:39
 * 写程序计算给定多项式在给定点x处的值
 */
public class Polynomial {
    public static double polynomial1(int n, double[] a, double x) {
        double p = a[0];
        for (int i = 1; i <= n; i++) {
            p += (a[i] * Math.pow(x, i));
        }
        return p;
    }

    public static double polynomial2(int n, double[] a, double x) { //秦九韶算法
        double p = a[n];
        for (int i = n; i > 0; i--) {
            p = a[i - 1] + x*p;
        }
        return p;
    }

    public static void main(String[] args) {
        double[] a = new double[10]; //多项式的系数
        final int MAXK = (int) 1e7;
        for (int i = 0; i < 10; i++) {
            a[i] = (double) i;
        }
        long start = System.currentTimeMillis();
        //调用MAXK次数
        for (int i = 0; i < MAXK; i++) {
            polynomial1(9, a, 1.1);
        }
        long end1 = System.currentTimeMillis();
        //调用MAXK次数
        for (int i = 0; i < MAXK; i++) {
            polynomial2(9, a, 1.1);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("函数1时间为：" + (end1 - start));
        System.out.println("函数2时间为：" + (end2 - end1));
        //函数1时间为：2085
        //函数2时间为：5
    }
}
