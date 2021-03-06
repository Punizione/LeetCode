import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public ListNode mergeKLists(ListNode[] lists) {
		if(lists==null||lists.length==0){
			return null;
		}
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
			@Override
			public int compare(ListNode n1, ListNode n2){
				if(n1.val<n2.val){
					return -1;
				}else if(n1.val == n2.val){
					return 0;
				}else{
					return 1;
				}
			}
		});

		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		for(ListNode node:lists){
			if(node!=null){
				queue.add(node);
			}
		}
		while(!queue.isEmpty()){
			tail.next = queue.poll();
			tail = tail.next;
			if(tail.next!=null){
				queue.add(tail.next);
			}
		}
		return dummy.next;
	}
}