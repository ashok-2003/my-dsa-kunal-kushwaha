public class llinkedlist_58 {
    // so here we will learn about the different types of linked list pattern and quesitons


    // so question were solve in the leetcode and in the question pdf question are sloved
    public static void main(String[] args) {
        linkedList ans = new linkedList();
        ans.InsertFirst(3);
        ans.InsertFirst(1);;
        ans.InsertFirst(2);
        ans.InsertFirst(4);

    }
    // cannot get created in the this ListNode in that
}
class Solution1 {
    // so this is the solution of the merge sort of linked list
    public ListNode sortList(ListNode head) {
        // so here we are learning about the merge sort so for that we have to first find
        // two of the thing one is the mid node of it and we have to merge the two list
        // and at last we can merge two of it to return the list
        if(head == null || head.next == null){
            return head;
        }

        // so now we have made both of those function so now creating here theree node
        ListNode mid = Mid(head);
        ListNode head2  = mid.next;
        mid.next = null;   // this line is necessary otherwise it will give stack overflow error here
        // so this reutrn the mid node
        // head.next = null;
        ListNode right = sortList(head2);
        ListNode left = sortList(head);

        // so at last we have to sort both of these
        return merge(left , right);
    }
    ListNode merge(ListNode list1 , ListNode list2){   //  i think here is some of the error here
        // so now here is the merging part of it
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode ans = new ListNode(-1);
        ListNode out = ans;
        // so now when
        while(list1 != null && list2 != null){
            // so when both of them are not equal to null then
            if(list1.val < list2.val){
                ans.next = list1;
                list1 = list1.next;
                ans = ans.next;
            }
            else{
                ans.next = list2;
                list2 = list2.next;
                ans = ans.next;
            }
        }
        while(list1 != null){
            ans.next = list1;
            list1 = list1.next;
            ans = ans.next;
        }
        while(list2 != null){
            ans.next = list2;
            list2 = list2.next;
            ans = ans.next;
        }
        return out.next; // so this reuturn the merge of the two listnode




    }
    ListNode Mid(ListNode head){
        // so here it will reuturn  the mid of the node so for it
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;   // if we dont't' define this prev then our code will
        // give the runtime error with the stack overflow
        while(fast != null && fast.next != null){
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        return prev;
    }
}
class ListNode {
     static ListNode head;
     static ListNode tail;
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     public static void  insertfirst(int val){
          // so here we have to add the value from the last
         ListNode temp = new ListNode(val);
         temp.next = head;
         head = temp;

         if(tail == null ){
             tail = head;
         }
         // this not work at all

     }
}

