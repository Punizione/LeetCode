import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(missingNumber(new int[]{0,1,3}));
	}
	public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);  
        dummy.next = head;  
        ListNode p = dummy;  
        ListNode q = head;  
        while(q!=null) {  
            if(q.val == val) {  
                p.next = q.next;  
            } else {  
                p = p.next;  
            }  
            q = q.next;  
        }  
          
        return dummy.next;  
	}


		
}