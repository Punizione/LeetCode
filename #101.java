import java.util.*;
public class Test{
	public static void main(String[] args){
		System.out.println(canConstruct("aa","aab"));
	}
	public boolean isSymmetric(TreeNode root) {
		if(root==null)
			return true;
		return isMirror(root.left, root.right);
	}

	public boolean isMirror(TreeNode p, TreeNode q){
		if(p==null && q==null){
			return true;
		}
		if(p==null || q==null){
			return false;
		}
		return (q.val==p.val) && isMirror(p.left, q.right) && isMirror(p.right, q.left);
	}
}