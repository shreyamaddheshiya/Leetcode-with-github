//using recursion 

class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;        
    }
}


//iterative code 

/* 
class Solution {
    public ListNode reverseList(ListNode head) {
ListNode temp = head;
        ListNode prev = null;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;         
    }
}       
        
        */