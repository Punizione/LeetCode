import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public String reverseVowels(String s) {
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		List<Integer> li = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
				sb.append(arr[i]);
				li.add(i);
			}
		}
		sb = sb.reverse();
		arr = sb.toString().toCharArray();
		char[] newArr = s.toCharArray();
		int j=0;
		for(Integer i:li){
			newArr[i]=arr[j++];
		}
		sb = new StringBuilder();
		for(int i=0;i<newArr.length;i++){
			sb.append(newArr[i]);
		}
		return sb.toString();
	}
}