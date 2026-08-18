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

class Solution 
{
    public ListNode mergeKLists(ListNode[] lists) 
    {
          ArrayList<Integer> arr = new ArrayList<>();
          for(int i = 0; i <lists.length; i++)
          {
              ListNode curr = lists[i];
              while(curr != null)
              {
                arr.add(curr.val);
                curr = curr.next;

              }
          }

          Collections.sort(arr);
          ListNode list = new ListNode(0);
          ListNode curr = list;
          for(int i = 0; i <arr.size(); i++)
          {
           
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
          }
        
        return list.next;
    }
}
