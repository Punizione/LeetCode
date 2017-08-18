
public class Test{
	public static void main(String[] args){
		System.out.println(isUgly(-11));
	}
	public static int sum = 0;
	public int findTilt(TreeNode root) {
		sum = 0;
		postRoot(root);
		return sum;
	}
	public static int getTilt(TreeNode node){
		int left = node.left==null?0:node.left.val;
		int right = node.right==null?0:node.right.val;
		node.val = node.val+left+right;
		return Math.abs(left-right);
	}
	public static void  postRoot(TreeNode node){
		if(node!= null){
			postRoot(node.left);
			postRoot(node.right);
			sum += getTilt(node);
		}
	}
}