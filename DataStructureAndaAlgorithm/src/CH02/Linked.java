package CH02;

/**
 * @author ZhengXinchang
 * @create 2021-08-13-18:50
 * 实现链表功能
 */
public class Linked<T> {
    /**
     * 链表中的节点定义
     */
    private class Node {
        private T t;
        private Node next;

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }
    }

    private Node head;//头节点
    private int size;//链表节点个数

    //初始化
    public Linked() {
        this.head = null;
        this.size = 0;
    }

    /**
     * 求表长
     *
     * @return 表的长度
     */
    public int length() {
        Node p = head;
        int i = 0;
        while (p != null) {
            p = p.next;
            i++;
        }
        return i;
    }

    //查找

    /**
     * 根据索引查找
     *
     * @param index 索引值
     * @return 查找的结果
     */
    public Node FindKth(int index) {
        Node p = this.head;
        int i = 0;
        while (p != null && i < index) {
            p = p.next;
            i++;
        }
        if (i == index) {
            return p; //找到指定值，返回结果
        } else
            return null; //否则返回空
    }

    /**
     * 按值查找
     * @param x 寻找的值
     * @return 结果
     */
    public Node find(T x){
        Node p=this.head;
        while (p!=null && p.t!=x){
            p=p.next;
        }
        return p;
    }


}
