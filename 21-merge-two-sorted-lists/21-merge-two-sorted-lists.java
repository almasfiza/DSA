/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode L = new ListNode();
        ListNode l;
        l = L;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                l.next = new ListNode(l1.val);
                l = l.next;
                l1 = l1.next; 
            }
            else{
                l.next = new ListNode(l2.val);
                l = l.next;
                l2 = l2.next;
            }
        }
        if(l1 == null){
            while(l2 != null){
                l.next = new ListNode(l2.val);
                l = l.next;
                l2 = l2.next;
            }
        }
        if(l2 == null){
            while(l1 != null){
                l.next = new ListNode(l1.val);
                l = l.next;
                l1 = l1.next;
            }
        }
        return L.next;
    }
}