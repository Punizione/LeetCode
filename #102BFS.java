import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(longestConsecutive(new int[]{1,3,4,6,8,200,1,55,2,6,8,4,9,7,54,8,15,48465,12,}));
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		if(root == null){
			return list;
		}

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()){
			int level = queue.size();
			List<Integer> subList = new ArrayList<Integer>();
			for(int i=0;i<level;i++){
				TreeNode node = queue.poll();
				subList.add(node.val);
				if(node.left !=null){
					queue.offer(node.left);
				}
				if(node.right!=null){
					queue.offer(node.right);
				}
			}
			list.add(subList);
		}
		return list;
	}

}