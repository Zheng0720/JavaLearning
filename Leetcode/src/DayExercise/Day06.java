package DayExercise;

/**
 * @author ZhengXinchang
 * @create 2021-08-18-9:11
 */
public class Day06 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
     * 如果有两个中间结点，则返回第二个中间结点。
     *
     * @param head
     * @return
     */
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    /**
     * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
     * 解题思路：快慢指针法，先让fast走n步，那样fast和slow之间相差n个节点，这样在同时出发，
     * 当fast走到末尾时，slow处正好为倒数第n个节点
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null && head.next != null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i++) {
            if (fast.next != null) {
                fast = fast.next;
            } else {
                return head.next;
            }
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        boolean f = true;
        if (!f) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
    }

}
