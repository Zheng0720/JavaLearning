package CH02;

/**
 * @author ZhengXinchang
 * @create 2021-08-13-18:58
 * 数组的实现
 */
public class Array {
    private int[] array;
    private int last; //数组最后一位的指针


    /**
     * 初始化，传入制定数组长度
     *
     * @param capacity：数组长度
     */
    public Array(int capacity) {
        array = new int[capacity];
        last = 0;
    }

    /**
     * 无参数的构造函数，默认的capacity=10；
     */
    public Array() {
        array = new int[10];
        last = 0;
    }

    /**
     * 查找元素
     *
     * @param x 待查找的元素
     * @return：索引值
     */
    public int find(int x) {
        int i = 0;
        while (i <= last && array[i] != x) {
            i++;
        }
        if (i >= last) {
            return -1;
        } else {
            return i;
        }
    }

    /**
     * 增加元素
     *
     * @param index 增加元素的索引
     * @param x     增加元素
     */
    public void insert(int index, int x) {
        if (last == array.length) {
            System.out.println("表满");
        }
        if (index < 0 || index > last + 1) {
            System.out.println("位置不合法");
        }
        for (int i = last - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = x;
        last++;
    }

    /**
     * 删除指定索引的元素
     * @param index 索引值
     * @return 被删除的元素
     */
    public int delete(int index) {
        if (index < 0 || index >= last) {
            System.out.println("不存在这个元素");
        }
        int ret = array[index];
        for (int i = index + 1; i < last; i++) {
            array[i - 1] = array[i];
        }
        last--;
        return ret;
    }

    public static void main(String[] args) {
        Array array = new Array(10);
    }

}
