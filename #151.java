import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(reverseWords("I am happy"));
	}
	public static String reverseWords(String s) {
		String[] array = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String str:array){
			if(!str.equals("")){
				sb.insert(0,str);
				sb.insert(0," ");
			}
		}
		sb = new StringBuilder(sb.substring(1));
		return sb.toString();
	}
}