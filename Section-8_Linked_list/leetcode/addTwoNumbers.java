class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        ListNode result = new ListNode();
        ListNode ans = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            result.next = new ListNode(sum % 10);
            carry = sum / 10;
            result = result.next;
        }

        if (carry != 0) {
            result.next = new ListNode(carry);
        }

        return ans.next;
    }

    // Helper method to print linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        // Create first number: 342 as 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Create second number: 465 as 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        AddTwoNumbers obj = new AddTwoNumbers();
        ListNode result = obj.addTwoNumbers(l1, l2);

        // Print result: should be 7 -> 0 -> 8
        printList(result);
    }
}
