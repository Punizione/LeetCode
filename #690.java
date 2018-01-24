import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(reverseWords("I am happy"));
	}

	public int getImportance(List<Employee> employees, int id) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.offer(id);
		Employee tmp;
		int soi = 0; //Sum Of Importance
		while(!queue.isEmpty()){
			tmp = employees.get(queue.poll()-1);
			soi += tmp.importance;
			if(tmp.subordinates.size()>0){
				for(Integer t:tmp.subordinates){
					queue.offer(t);
				}
			}
		}
		return soi;
	}

}