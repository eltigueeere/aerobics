package MergeTwoSortedLists;

public class MergeTwoSortedLists {
    public static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    
    public static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode dummy = new ListNode(-1);
            ListNode current = dummy;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.next = list1;
                    list1 = list1.next;
                } else {
                    current.next = list2;
                    list2 = list2.next;
                }
                current = current.next;
            }
            // Conecta el resto de la lista que no ha terminado
            if (list1 != null) {
                current.next = list1;
            } else {
                current.next = list2;
            }
            return dummy.next;
        }
    }
    public static void main(String[] args) {
        // Ejemplo de prueba
        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        Solution sol = new Solution();
        ListNode merged = sol.mergeTwoLists(l1, l2);

        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
    }
}
