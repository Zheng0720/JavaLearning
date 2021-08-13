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
    private class Node{
        private T t;
        private Node next;
        public Node(T t,Node next){
            this.t=t;
            this.next=next;
        }
    }
    private Node head;//头节点
    private int size;//链表节点个数


}
