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
    public ListNode sortList(ListNode head) {
        List<Integer>arr= new ArrayList<>();
        if(head!=null)
        {
            ListNode temp=head;
            while(temp!=null)
            {
                arr.add(temp.val);
                temp=temp.next;
            }
            Collections.sort(arr);
        }
        int[] a = arr.stream().mapToInt(i -> i).toArray();
        ListNode h=new ListNode(0);
        ListNode temp=h;
        for(int i:a)
        {
            ListNode newNode= new ListNode(i,null);
            temp.next=newNode;
            temp=temp.next;

        }
        return h.next;
        
    }
}