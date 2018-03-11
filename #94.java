import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(arrangeCoins(8));
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if(root == null){
			return list;
		}
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode pointer = root;
		while(pointer != null || !stack.isEmpty()){
			while(pointer != null){
				stack.push(pointer);
				pointer = pointer.left;
			}
			pointer = stack.pop();
			list.add(pointer.val);
			pointer = pointer.right;
		}
		return list;
	}
}