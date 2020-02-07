package Q0002_AddTwoNumbersz_Medium;

import java.util.List;

/**
 * @author Die antwort
 * @2020/2/6 18:50
 * Description:
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listSum = new ListNode(0);
        ListNode listInter = new ListNode(0);
        int index = (l1.val + l2.val) / 10;
        listInter.val =  (l1.val + l2.val) % 10;
        listSum = listInter;
        while (l1.next != null || l2.next != null) {
            if(l1.next == null) {
                l1.next = new ListNode(0);
            }
            if(l2.next == null) {
                l2.next = new ListNode(0);
            }
            listInter.next = new ListNode((l1.next.val + l2.next.val + index) % 10);
            index = (l1.next.val + l2.next.val + index) / 10;
            l1 = l1.next;
            l2 = l2.next;
            listInter = listInter.next;
        }
        if(index == 1) {
            listInter.next = new ListNode(index);
        }
        return listSum;
    }
}
