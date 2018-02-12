import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(arrangeCoins(8));
	}

	public ListNode oddEvenList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		while(odd.next != null && even.next != null){
			odd.next = even.next;
			odd = odd.next;
			even.next = odd.next;
			even = even.next;
		}
		odd.next = evenHead;
		return head;
	}

}