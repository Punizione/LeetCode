import java.util.*;
public class Test{
	public static void main(String[] args){
	//	System.out.println(isPalindrome("aacecaa"));
		System.out.println(shortestPalindrome("abcd"));
	}

	public static String shortestPalindrome(String s){
			int j = 0;
			for (int i = s.length() - 1; i >= 0; i--) {
				if (s.charAt(i) == s.charAt(j)) { j += 1; }
			}
			if (j == s.length()) { return s; }
			String suffix = s.substring(j);
			return new StringBuffer(suffix).reverse().toString() + shortestPalindrome(s.substring(0, j)) + suffix;
	}
	//Time limited
	public static String shortestPalindrome(String s) {
		StringBuilder extra = new StringBuilder();
		StringBuilder sb = new StringBuilder(s);
		if(isPalindrome(s)){
			return s;
		}
		while(true){
			if(isPalindrome(sb.toString())){
				System.out.println(extra);
				sb = sb.append(extra.reverse());
				sb = extra.reverse().append(sb);
				return sb.toString();
			}else{
				extra.append(sb.charAt(sb.length()-1));
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}

	public static boolean isPalindrome(String s){
		if(s.length()<1){
			return true;
		}
		if(s.length()==1){
			return true;
		}
		for(int i=0,j=s.length()-1;i<j;i++,j--){
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
		}
		return true;
//		return s.equals(new StringBuilder(s).reverse().toString());
	}
}