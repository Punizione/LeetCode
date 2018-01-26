import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(reverseWords("I am happy"));
	}
	int height(TreeNode root) {
		return root == null ? -1 : 1 + height(root.left);
	}
	public int countNodes(TreeNode root) {
		int h = height(root);
		return h < 0 ? 0 :
			   height(root.right) == h-1 ? (1 << h) + countNodes(root.right)
										 : (1 << h-1) + countNodes(root.left);
	}
}