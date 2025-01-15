package Q0002_AddTwoNumbersz_M;

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
        ListNode listSum;
        ListNode listInter = new ListNode(0);

        listInter.val = (l1.val + l2.val) % 10;
        int addCarry = (l1.val + l2.val) / 10;
        listSum = listInter;

        while (l1.next != null || l2.next != null || addCarry != 0) {
            int sum = 0;
            if (l1.next != null) {
                sum += l1.next.val;
                l1 = l1.next;
            }

            if (l2.next != null) {
                sum += l2.next.val;
                l2 = l2.next;
            }

            listInter.next = new ListNode((sum+ addCarry) % 10);
            addCarry = (sum+ addCarry) / 10;

            listInter = listInter.next;
        }

        return listSum;
    }
}
