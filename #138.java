import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(divide(1,-1));
	}
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head==null){
			return null;
		}
		copy(head);
		linkRandom(head);
		return split(head);
	}
	public void copy(RandomListNode head){
		RandomListNode p = head;
		while(p!=null){
			RandomListNode newP = new RandomListNode(p.label);
			newP.next = p.next;
			p.next = newP;
			p = newP.next;
		}
	}

	public void linkRandom(RandomListNode head){
		RandomListNode p = head;
		while(p!=null){
			if(p.random!=null){
				p.next.random = p.random.next;
			}
			p = p.next.next;
		}
	}

	public RandomListNode split(RandomListNode head){
		RandomListNode newHead = head.next;
		RandomListNode p = head;
		RandomListNode newP;

		while(p != null){
			newP = p.next;
			p.next = newP.next;
			if(p.next != null){
				newP.next = p.next.next;
			}
			p = p.next;
		}
		return newHead;
	}

	
		
}