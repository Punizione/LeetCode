import java.util.*;
public class Test{
	public static void main(String[] args){
		isSubsequence("abc","ahbgdc");
	}
	public String reverseWords(String s) {
		String[] arr = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String tmp:arr){
			sb.append(new StringBuilder(tmp).reverse()+" ");
		}
		sb = sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}
}