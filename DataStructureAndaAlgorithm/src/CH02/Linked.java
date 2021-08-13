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

        public Node(T t) {
            this(t, null);
        }

        public Node(T t, Node next) {
            this.t = t;
            this.next = next;
        }

        public T getValue() {
            return t;
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
     *
     * @param x 寻找的值
     * @return 结果
     */
    public Node find(T x) {
        Node p = this.head;
        while (p != null && p.t != x) {
            p = p.next;
        }
        return p;
    }

    /**
     * 在链表头部增加元素
     *
     * @param t
     */
    public void addFirst(T t) {
        Node node = new Node(t);
        node.next = this.head;
        this.head = node;
        size++;
    }

    //尾部插入元素
    public void addLast(T t) {
        insert(t, size);
    }

    /**
     * 中间插入元素
     *
     * @param t
     * @param index
     */
    public void insert(T t, int index) {
        if (index < 0 || index > size) {
            System.out.println("索引值错误");
        }
        if (index == 0) {
            addFirst(t);
            return;
        }
        //找到前一个节点
        Node preNode = this.head;
        for (int i = 0; i < index - 1; i++) {
            preNode = preNode.next;
        }
        Node node = new Node(t);
        node.next = preNode.next; //插入节点的下一个节点指向上一个节点的下一个节点
        preNode.next = node;//上一个节点的下一个节点指向自己；
        size++;
    }

    //删除节点
    public void delete(int index) {
        if (index < 0 || index > size) {
            System.out.println("索引值错误");
        }
        if (index == 0) {
            this.head = FindKth(1);
            size--;
            return;
        }
        //找到前一个节点
        Node preNode = FindKth(index - 1);
        Node node = FindKth(index);
        preNode.next = node.next; //插入节点的下一个节点指向上一个节点的下一个节点
        size--;
    }

    public int getSize() {
        return size;
    }

    public void printLinked() {
        Node p = this.head;
        for (int i = 0; i < size; i++) {
            System.out.println(p.getValue());
            p = p.next;
        }
    }

    public static void main(String[] args) {
        Linked<Integer> linked = new Linked<>();
        linked.addLast(1);
        linked.addLast(2);
        linked.addLast(3);
        linked.addLast(4);

        linked.printLinked();

    }

}
