class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resp = new ListNode();
        ListNode tmp = resp;
        while((list1 !=null)&& (list2!=null)) {
        	if(list1.val<=list2.val) {
        		ListNode t = new ListNode(list1.val, null);
        		tmp.next = t;
        		tmp = tmp.next;list1=list1.next;
        	}else {
        		ListNode t = new ListNode(list2.val, null);
        		tmp.next = t;
        		tmp = tmp.next;list2=list2.next;
        	}
        }
        
        if(list1 !=null) {
        	tmp.next = list1;
        }
        
        if(list2 !=null) {
        	tmp.next = list2;
        }
        return resp.next;
    }
}