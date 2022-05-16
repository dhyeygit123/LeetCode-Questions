class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
class Mergetwolists {
public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode l3 = new ListNode(0);
    ListNode addl3 = l3;
    while(l1!=null && l2!=null)
    {
        if(l1.val==l2.val) {
        ListNode newnode1 = new ListNode(l1.val);
        ListNode newnode2 = new ListNode(l1.val);
        l3.next = newnode1;
        l3.next.next=newnode2;
        l3=l3.next.next;
        l1=l1.next;
        l2=l2.next;
        }else if(l1.val<l2.val)
        {
            ListNode newnode = new ListNode(l1.val);
            l3.next = newnode;
            l3=l3.next;
            l1=l1.next;
        }else{
            ListNode newnode = new ListNode(l2.val);
            l3.next = newnode;
            l3=l3.next;
            l2=l2.next;
        }
    }
           if(l1==null){
    while(l2!=null)
    {
        ListNode newnode = new ListNode(l2.val);
        l3.next = newnode;
        l2=l2.next;
    }
}else if(l2==null){
    while(l1!=null){
        ListNode newnode = new ListNode(l1.val);
        l3.next = newnode;
        l1=l1.next;
    }
}
    return addl3.next;
}
    public static void main(String[] args) {
        ListNode l1 = new ListNode(-9);
        l1.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(7);
        mergeTwoLists(l1, l2);
   
    }
}
