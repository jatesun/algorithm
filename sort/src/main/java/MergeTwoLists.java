/**
 * @author sunjiantao
 * @date 2019-10-16
 */
public class MergeTwoLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(2);
        ListNode l12 = new ListNode(4);
        l1.next = l11;
        l11.next = l12;

        ListNode l2 = new ListNode(1);
        ListNode l21 = new ListNode(3);
        ListNode l22 = new ListNode(4);
        l2.next = l21;
        l21.next = l22;

        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode result = mergeTwoLists.mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /**
         * 思路（遍历两个链表，对比链表值，小的排前，然后该链表后移一位）
         *
         */
        ListNode result = null;
        ListNode prev = null;
        while (l1 != null || l2 != null) {
            int target = 0;
            if (l1 == null) {
                target = l2.val;
                l2 = l2.next;
            } else if (l2 == null) {
                target = l1.val;
                l1 = l1.next;
            } else if (l1.val <= l2.val) {
                target = l1.val;
                l1 = l1.next;
            } else {
                target = l2.val;
                l2 = l2.next;
            }
            if (result == null) {
                result = new ListNode(target);
                prev = result;
            } else {
                ListNode cur = new ListNode(target);
                prev.next = cur;
                prev = cur;
            }
        }
        return result;
    }
}