//leetcode.com/problems/merge-two-sorted-lists/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null){
            return list2;
        }
        if(list2==null){
            return list1;
        }
        if(list1.val>list2.val){
            ListNode temp=list1;
            list1=list2;
            list2=temp;
        }
        
        ListNode top=list1;
        list1=list1.next;
        top.next=null;
        top.next=mergeTwoLists(list1,list2);
        return top;
        
    }
}
