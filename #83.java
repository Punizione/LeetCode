import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null){
			return null;
		}
		if(head.next==null){
			return head;
		}
		
		ListNode front = head;
		ListNode post = head.next;
		int now = front.val;
		while(post!=null){
			if(post.val == now){
				post = post.next;
			}else{
				front.next.val = post.val;
				front = front.next;
				post = post.next;
				now = front.val;
			}
		}
		front.next = null;
		return head;
	}
}