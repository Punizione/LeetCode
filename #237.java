import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(missingNumber(new int[]{0,1,3}));
	}
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
		
}