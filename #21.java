import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(canConstruct("aa","aab"));
	}
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if(l1==null){
			return l2;
		}
		if(l2==null){
			return l1;
		}
		ListNode p,q;
		ListNode newList;
		if(l1.val>l2.val){
			p = l1;
			q = l2.next;
			newList = new ListNode(l2.val);
		}else{
			p = l1.next;
			q = l2;
			newList = new ListNode(l1.val);
		}
		ListNode newP = newList;
		while(p!=null && q!= null){
			if(p.val > q.val){
				newP.next = new ListNode(q.val);
				q = q.next;
				newP = newP.next;
			}else if(p.val <= q.val){
				newP.next = new ListNode(p.val);
				p = p.next;
				newP = newP.next;
			}
		}
		if(p==null && q!=null){
			while(q!=null){
				newP.next = new ListNode(q.val);
				q = q.next;
				newP = newP.next;
			}
		}else if(p!=null && q==null){
			while(p!=null){
				newP.next = new ListNode(p.val);
				p = p.next;
				newP = newP.next;
			}
		}
		return newList;   
	}
}