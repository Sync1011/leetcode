/**
 * https://leetcode.com/problems/palindrome-linked-list/
 * 
 * Given a singly linked list, determine if it is a palindrome.
 */
public class PalindromeLinkedList234 {
    public static void main(String[] args) {
        PalindromeLinkedList234 main = new PalindromeLinkedList234();
        ListNode one = new ListNode(1);
        ListNode one1 = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode one2 = new ListNode(1);
        one.next = one1;
        one1.next = two;
        two.next = one2;
        main.isPalindrome(one);
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        // set slow to to the middle of the list
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse the second half of the list
        slow = reverse(slow);
        // set fast back to begining
        fast = head;
        // compare slow (right) and fast (left)
        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}